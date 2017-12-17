package algorithm.merge.sort;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Implementation for MergeKSortedLists.
 */
public class MergeKSortedListsImpl implements MergeKSortedLists {

    /**
     * Method compares every k nodes and get the node with the smallest value using PriorityQueue.
     * It's called an N-way merge. Its complexity is O(n log k).
     *
     * @param lists
     * @return List<Integer>
     */
    @Override
    public List<Integer> mergeSortedLists(List<List<Integer>> lists) {
        if (CollectionUtils.isEmpty(lists)) {
            throw new IllegalArgumentException("Invalid input!");
        }

        PriorityQueue<HeapItem> pq = new PriorityQueue<HeapItem>();
        int outputListSize = 0;

        // add arrays to the heap
        for (int i = 0; i < lists.size(); i++) {
            pq.add(new HeapItem(lists.get(i), 0));
            outputListSize = lists.get(i).size();
        }

        List<Integer> result = new ArrayList<Integer>(outputListSize);

        while (!pq.isEmpty()) {
            HeapItem current = pq.remove();
            result.add(current.getList().get(current.getIndex()));
            if (current.getIndex() < current.getList().size() - 1) {
                current.setIndex(current.getIndex() + 1);
                pq.add(current);
            }
        }

        return result;
    }
}
