package DP;

public class MaxSumNo2Adjacent {

    public void init(){
        int arr[] = new int[]{5, 5, 10, 100, 10, 5};
        System.out.println(findMaxSum(arr, arr.length));
    }

    private int findMaxSum(int[] arr, int length) {

        int incl = arr[0];
        int excl = 0;
        int excl_new;
        for(int i=1;i<arr.length;i++){
            excl_new = incl>excl? incl:excl;

            incl = excl+arr[i];
            excl = excl_new;
        }
        return Math.max(incl,excl);
    }
}
