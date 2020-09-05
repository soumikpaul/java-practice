package Sort;



public class MergeSort {

    public void init(){
        int arr[] = new int[]{1,5,7,8,3,4,6,1,546,45,2};
        int r=arr.length - 1;
        mergeSort(arr,0,r);
        for (int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }

    private void mergeSort(int[] arr, int l, int r) {
        if(l<r) {
            int mid = (l + r) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }

    }

    private void merge(int[] arr, int l, int mid, int r) {
        int firstHalf = mid - l +1;
        int secondHalf = r-mid;
        int tempFirst[] = new int[firstHalf];
        int tempSecond[] = new int[secondHalf];
        for(int i=0;i<firstHalf;i++){
            tempFirst[i] = arr[l+i];
        }
        for(int i=0;i<secondHalf;i++){
            tempSecond[i] = arr[mid+1+i];
        }
        int i =0 , j =0;
        int k=l;
        while(i<firstHalf&&j<secondHalf){
            if(tempFirst[i]<=tempSecond[j]){
                arr[k] = tempFirst[i];
                i++;
            }
            else {
                arr[k] = tempSecond[j];
                j++;
            }
            k++;
        }
        while (i < firstHalf) {
            arr[k] = tempFirst[i];
            i++;
            k++;
        }
        while (j < secondHalf) {
            arr[k] = tempSecond[j];
            j++;
            k++;
        }
    }


}
