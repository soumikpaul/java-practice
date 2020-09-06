package DP;

public class BinomialCoef {
    public void init(int n,int k){
        int x = binomailRecur(n,k);
        System.out.println(x);
        int y = binomialDP(n,k);
        System.out.println(y);
    }

    private int binomialDP(int n, int k) {
        int arr[][] = new int[n+1][k+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=Math.min(i,k);j++){
                if(i==j||j==0)
                    arr[i][j]=1;
                else
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
            }
        }
        return arr[n][k];
    }

    private int binomailRecur(int n, int k) {
        if(n==k||k==0)
            return 1;
        return binomailRecur(n-1,k-1)+binomailRecur(n-1,k);
    }
}
