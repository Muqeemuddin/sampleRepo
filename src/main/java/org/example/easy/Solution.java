package org.example.easy;

public class Solution {

    public long multiplicationUnderModulo(long a, long b){
        long M = 1000000007l;
        return ((a%M) * (b%M))%M;
    }

}
