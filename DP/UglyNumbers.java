package DP;

import java.util.Arrays;

public class UglyNumbers {
//    divide by 2,3,5 to get 1 ret true
    public void ugly(int n){
        int ugly[] = new int[n];  // To store ugly numbers
        int i2 = 0, i3 = 0, i5 = 0;
        int next_multiple_of_2 = 2;
        int next_multiple_of_3 = 3;
        int next_multiple_of_5 = 5;
        int x = 1;

        ugly[0] = 1;
        for(int i=1;i<n;i++){
            x = Math.min(next_multiple_of_2, Math.min(next_multiple_of_3,next_multiple_of_5));
            ugly[i]=x;
            if(x==next_multiple_of_2){
                i2++;
                next_multiple_of_2 = ugly[i2]*2;
            }
            if(x==next_multiple_of_3){
                i3++;
                next_multiple_of_3 = ugly[i3]*3;
            }
            if(x==next_multiple_of_5){
                i5++;
                next_multiple_of_5 = ugly[i5]*5;
            }

        }
        System.out.println(x);

    }
}
