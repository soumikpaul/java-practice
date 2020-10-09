package DP;

public class LongestCommonSusbtring {
    public void init(){
        String X = "OldSite:GeeksforGeeks.org";
        String Y = "NewSite:GeeksQuiz.com";

        int m = X.length();
        int n = Y.length();

        System.out.println("Length of Longest Common Substring is "
                + LCSubStr(X, Y, m, n));
    }

    private int LCSubStr(String x, String y, int m, int n) {
        int[][] dp = new int[m+1][n+1];
        int res = 0;
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0||j==0) {
                    dp[i][j] = 0;
                }
                else if(x.charAt(i-1)==y.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    res = Math.max(res, dp[i][j]);
                }
                else {
                    dp[i][j]=0;
                }
            }
        }
        return res;
    }
}
