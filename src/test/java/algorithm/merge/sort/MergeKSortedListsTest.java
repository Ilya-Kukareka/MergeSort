package algorithm.merge.sort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * MergeKSortedListsTest for testing MergeKSortedLists.
 */

public class MergeKSortedListsTest {

    private MergeKSortedLists mergeKSortedLists = new MergeKSortedListsImpl();

    @Test
    public void mergeLists_correctExecution() {

        //setup
        List<Integer> list1 = new ArrayList<Integer>() {{
            add(3);
            add(5);
            add(7);
        }};
        List<Integer> list2 = new ArrayList<Integer>() {{
            add(2);
            add(4);
            add(8);
        }};

        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        lists.add(list1);
        lists.add(list2);

        List<Integer> checkList = new ArrayList<Integer>() {{
            add(2);
            add(3);
            add(4);
            add(5);
            add(7);
            add(8);
        }};

        //run
        List<Integer> result = mergeKSortedLists.mergeSortedLists(lists);

        //verify
        assertEquals(result, checkList);
    }

    @Test(expected = IllegalArgumentException.class)
    public void mergeLists_whenEmptyList() {
        //run
        mergeKSortedLists.mergeSortedLists(null);
    }
}
