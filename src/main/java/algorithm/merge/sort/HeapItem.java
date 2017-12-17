package algorithm.merge.sort;

import java.util.List;

/**
 * HeapItem class.
 */
class HeapItem implements Comparable<HeapItem> {

    private List<Integer> list;
    private int index;

    public HeapItem(List<Integer> list, int index) {
        this.list = list;
        this.index = index;
    }

    public int compareTo(HeapItem heapItem) {
        return this.list.get(index) - heapItem.getList().get(heapItem.getIndex());
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }


}
