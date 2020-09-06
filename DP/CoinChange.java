package DP;

public class CoinChange {

    public void init(){
        int arr[] = {1, 2, 3};
        int m = arr.length;
        System.out.println( count(arr, m, 4));
        System.out.println(CountDp(arr,m,4));
    }

    private int CountDp(int[] arr, int m, int n) {
        int dp[] = new int[n+1];
        dp[0]=1;
        for(int i=0;i<m;i++){
            for(int j=arr[i];j<=n;j++){
                dp[j]+=dp[j-arr[i]];
            }
        }
        return dp[n];
    }

    private int count(int[] arr, int m, int n) {

        if(n==0)
            return 1;
        if(n<0)
            return 0;
        if (m <=0 && n >= 1)
            return 0;
//        if(arr[m-1]>n)
//            return count(arr,m-1,n);
        return count(arr,m-1,n)+count(arr,m,n-arr[m-1]);
    }

}
