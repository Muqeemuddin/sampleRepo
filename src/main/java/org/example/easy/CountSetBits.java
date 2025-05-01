package org.example.easy;

import java.util.Calendar;

public class CountSetBits {

    // Time complexity of below method is O(d) where d is total bits till MSB set one. eg 001001 - O(4)
    public static int countSetBits(int n){
        int count=0;
        while(n>0){
//            if(n%2!=0){
//                count++;
//            }
            //OR
            if((n&1)!=0){
                count++;
            }
            n=n/2;
        }
        return count;
    }

    //Time Complexity is O(d) where d is number of set bits. eg 001001 - O(2)
    public static int countSetBitsBrianMethod(int n){
        int count = 0;
        while(n>0){
            //Since n is non-zero, I can safely say that there is atleast one bit set 1;
            count++;
            n = n & (n-1);
        }
        return count;
    }

}
