package DP;

public class ArrayEndScore {

    public void init(){
        int arr[] = {1, 3, 1, 5, 2};
        int n = arr.length;

//        int dp[][] = new int[MAX][MAX];

//        System.out.println(solve(dp, arr, 0, n - 1, 1));
        System.out.println(solve(arr,n));
    }

    private int solve(int[] arr, int n) {
        int l=0,r=n-1;
        int score=0;
        int loop = 0;
        while(l!=r){
            loop++;
            int p = Math.min(arr[l],arr[r]);
            if(p==arr[l]){
                score+=loop*arr[l];
                l++;
            }
            else if(p==arr[r]){
                score+=loop*arr[r];
                r--;
            }
        }
        score+=(loop+1)*arr[l];
        return score;
    }
}
