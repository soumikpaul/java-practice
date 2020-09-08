package DP;

public class BinSeqFirstSecondHalfSame {

    public void init(){
        int n=2;
        int diff=0;
        System.out.println(res(n,diff));
    }

    private int res(int n, int diff) {
        if(n==1){
            if(diff==0)
                return 2;
            if(Math.abs(diff)==1)
                return 1;
        }
        if(Math.abs(diff)>n)
            return 0;

        return 2*res(n-1,diff)+res(n-1,diff-1)+res(n-1,diff+1);
    }
}
