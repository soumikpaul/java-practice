package DP;

import java.util.Arrays;

public class LIS {
    public void init(){
        int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
        int n = arr.length;
        System.out.println("Length of lis is "
                + lis(arr, n) + "\n");
    }
    private int lis(int[] arr, int n) {
        int dp[]= new int[n];
        Arrays.fill(dp,1);

        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]&&dp[i]<=dp[j])
                    dp[i] = dp[j]+1;
            }
        }
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,dp[i]);
        }
        return max;
    }
}
