package org.example.easy;

public class DigitsInFact {
    public static int digitsInFactorial(int N){
        // code here
        double res = 0;
        for(int i =1; i<=N ; i++){
            res += Math.log10((double)i);
        }
        return (int)Math.ceil(res);
    }


}
