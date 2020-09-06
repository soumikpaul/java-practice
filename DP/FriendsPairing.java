package DP;

public class FriendsPairing {
    public void init(){
        int n=3;
        System.out.println(friendsPair(n));
        System.out.println(friendsPairDP(n));
    }

    private int friendsPairDP(int n) {
        int dp[]=new int[n+1];
        for(int i=0;i<=n;i++){
            if(i<=2)
                dp[i]=i;
            else {
                dp[i]=dp[i-1]+(i-1)*dp[i-2];
            }
        }
        return dp[n];
    }

    private int friendsPair(int n) {
        if(n<=2){
            return n;
        }
        return friendsPair(n-1)+(n-1)*friendsPair(n-2);
    }
}
