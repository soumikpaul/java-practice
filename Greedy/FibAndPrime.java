package Greedy;

public class FibAndPrime {
    
    public static void main(String args[]){
        int n=11;
        if(n%2==0)
            System.out.println(fib(n/2));
        else{
            System.out.println(prime(n/2+1));
        }
    }

    private static int prime(int n) {
        int i, j, flag, count =0;
        for (i=2; i<=1000; i++)
        {
            flag = 0;
            for (j=2; j<i; j++)
            {
                if(i%j == 0)
                {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                if(++count == n)
                {
                    return i;
                }
        }
        return 0;
    }

    private static int fib(int n) {
        int  t1 = 0, t2 = 1, nextTerm;
        for (int i = 1; i<=n; i++)
        {
            nextTerm = t1 + t2;
            t1 = t2;
            t2 = nextTerm;
        }
        return t1;
    }


}

