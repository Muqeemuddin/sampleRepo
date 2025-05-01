package org.example.easy;

import static java.lang.Math.pow;

public class KbitSolution {
// Check Kth bit of n is one.
    public static boolean isKBitOne(int n, int k){
        int t = (int)Math.pow(2,k-1);
        if((n&t)==0){
            return false;
        }
        return true;
    }
}
