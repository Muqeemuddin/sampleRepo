package org.example.easy;

public class IsPrime {

    //Naive approach
    // Time Complexity = O(n)
    public static boolean isPrimeMethodOne(int num){
        if(num ==1){
            return false;
        }
        for(int i=2; i<num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    // Efficient approach
    // iterate from 2 to sqrt(n)
    // Time Complexity O(sqrt(n))
    public static boolean isPrimeMethodTwo(int num){
        if(num == 1){
            return false;
        }
        for(int i=2; i*i<= num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    // More optimisation to the efficient solution.
    public static boolean isPrimeMethodThree(int num){
        if(num == 1){
            return false;
        }
        //edge cases handled
        if(num==2 || num == 3){
            return true;
        }
        if(num%2 ==0 || num%3==0){
            return false;
        }
        for(int i = 5; i*i<=num; i=i+6){
            if(num%i==0 || num%(i+2)==0){
                return false;
            }
        }
        return true;

    }

}
