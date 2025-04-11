package org.example.easy;

import java.util.Arrays;

public class PrimeNumbers {
    public static void main(String[] args){
        int n = 50;
        printAllPrimes(n);
    }

    private static void printAllPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        for(int i=2; i<isPrime.length; i++){
            if(isPrime[i]){
                for(int j=2; i*j<n; j++){
                    isPrime[i*j] = false;
                }
            }
        }
        for(int i=2; i<isPrime.length; i++){
            if(isPrime[i]){
                System.out.print(i + " ");
            }
        }
    }
}
