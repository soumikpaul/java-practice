package DP;

public class Fibonacci {

    public void init(int n){
        int x = getFibonacci(n);
        System.out.println(x);
    }

    private int getFibonacci(int n) {
        if(n==0||n==1)
            return n;
        return getFibonacci(n-1)+getFibonacci(n-2);
    }
}
