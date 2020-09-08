package DP;

public class Lcs {

    public void init(){
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        char[] X=s1.toCharArray();
        char[] Y=s2.toCharArray();
        int m = X.length;
        int n = Y.length;

        System.out.println("Length of LCS is" + " " +
                lcs( s1, s2, m, n ) );

        System.out.println("Length of LCS dp is" + " " +
                lcsDP( s1, s2, m, n ) );
    }

    private int lcsDP(String s1, String s2, int m, int n) {
        int dp[][] = new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0||j==0)
                    dp[i][j]=0;
                else if(s1.charAt(i-1)==s2.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1]+1;
                else
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);

            }
        }
        for(int i=0;i<=m;i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print(dp[i][j]);
            }
            System.out.println();
        }
        return dp[m][n];
    }

    private int lcs(String s1, String s2, int m, int n) {
        if( m==0 || n==0){
            return 0;
        }
        if(s1.charAt(m-1)==s2.charAt(n-1)){
            return 1+lcs(s1,s2,m-1,n-1);
        }
        return Math.max(lcs(s1,s2,m-1,n),lcs(s1,s2,m,n-1));
    }
}
