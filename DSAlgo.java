import Sort.HeapSort;
import Sort.MergeSort;
import Sort.Partition;

public class DSAlgo {
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
//        mergeSort.init();
        Partition partition = new Partition();
//        partition.init();
        HeapSort heapSort = new HeapSort();
        heapSort.init();
    }
}
