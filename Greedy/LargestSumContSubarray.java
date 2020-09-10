package Greedy;

//Kadane
public class LargestSumContSubarray {

    public void init(){
        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous sum is " +
                maxSubArraySum(a));
    }

    private int maxSubArraySum(int[] a) {
        int max_end_here =0;
        int max_so_far = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            max_end_here+=a[i];
            if(max_end_here>max_so_far)
                max_so_far=max_end_here;
            if(max_end_here<0){
                max_end_here = 0;
//                max_so_far=0;
            }
        }
        return max_so_far;
    }
}
