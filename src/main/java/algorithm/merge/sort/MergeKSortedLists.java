package algorithm.merge.sort;

import java.util.List;

/**
 * MergeKSortedLists interface.
 */
public interface MergeKSortedLists {
    /**
     * Method merges sorted lists in one sorted list.
     *
     * @param lists
     * @return List<Integer>
     */
     List<Integer> mergeSortedLists(List<List<Integer>> lists);
}
