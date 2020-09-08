package DP;

public class SubsetSumPresent {
    public void init(){
        int set[] = { 33, 34, 4, 12, 5, 22 };
        int sum = 13;
        int n = set.length;
        if (isSubsetSum(set, n, sum) == true)
            System.out.println("Found a subset"
                    + " with given sum");
        else
            System.out.println("No subset with"
                    + " given sum");

//        if (isSubsetSumDP(set, n, sum) == true)
//            System.out.println("Found a subset"
//                    + " with given sum");
//        else
//            System.out.println("No subset with"
//                    + " given sum");
    }

//    private boolean isSubsetSumDP(int[] set, int n, int sum) {
//
//    }

    private boolean isSubsetSum(int[] set, int n, int sum) {
        if(sum==0)
            return true;
        if(sum<0||n==0)
            return false;
        return isSubsetSum(set,n-1,sum)||isSubsetSum(set,n-1,sum-set[n-1]);
    }
}

