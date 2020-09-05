package Sort;

public class Partition {
    public void init(){
        int arr[] = new int[]{1,5,7,8,3,4,6,1,546,45,2};
        int r=arr.length - 1;
        quickSort(arr,0,r);
        for (int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }

    private void quickSort(int[] arr, int l, int r) {
        if(l<r){
            int p = partition(arr,l,r);
            quickSort(arr,l,p-1);
            quickSort(arr,p+1,r);
        }
    }

    private int partition(int[] arr, int l, int r) {
        int p = arr[r];
        int i = l-1;
        for(int j=l;j<r;j++){
            if(arr[j]<p){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = temp;

        return i+1;
    }
}
