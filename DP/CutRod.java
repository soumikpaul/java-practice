package DP;

public class CutRod {
    public void init(){
        int arr[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20};
        int size = arr.length;
        System.out.println("Maximum Obtainable Value is "+
                cutRod(arr, size));
        System.out.println("Maximum Obtainable Value is "+
                cutRodDP(arr, size));
    }

    private int cutRodDP(int[] arr, int size) {
        int val[] =new int[size+1];
        val[0]=0;
        for(int i=1;i<=size;i++){
            int max=0;
            for(int j=0;j<i;j++){
                max = Math.max(max,arr[j]+val[i-j-1]);
            }
            val[i] = max;
        }
        return val[size];
    }

    private int cutRod(int[] arr, int size) {
        if(size<=0)
            return 0;
        int max =0;

        for(int i=0;i<size;i++){
            max= Math.max(max,arr[i]+cutRod(arr,size-i-1));
        }
        return max;
    }
}
