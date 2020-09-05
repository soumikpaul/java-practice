package Sort;

public class HeapSort {

    public void init(){
        int arr[] = new int[]{1,5,7,8,3,4,6,1,546,45,2};
//        int r=arr.length - 1;
        heapSort(arr,arr.length);
        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i]);
    }

    private void heapSort(int[] arr, int n) {
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
//        for (int i=0;i<arr.length;i++)
//            System.out.print(arr[i]);
//        System.out.println();
        for(int i=n-1;i>0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    private void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int l = 2*i + 1; // left = 2*i + 1
        int r = 2*i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
}
