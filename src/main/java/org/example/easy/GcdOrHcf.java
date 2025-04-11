package org.example.easy;

public class GcdOrHcf {

    // method 1: Naive method

    public static int gcdMethodOne(int a, int b){
        int t = Math.min(a,b);
        while(t>0){
            if(a%t==0 && b%t==0){
                break;
            }
            t--;
        }
        return t;
    }
    // method 2: Euclidean method.
    // let b<a; gcd(a,b) = gcd(a-b,b).
    public static int gcdMethodtwo(int a,int b){
        while(a!=b){
            if(a>b){
                a= a-b;
            }else{
                b=b-a;
            }
        }
        return a;
    }

    // Optimised Euclidean method:
    public static int gcdMethodthree(int a, int b){
        if(b==0){
            return a;
        }else{
            return gcdMethodthree(b,a%b );
        }
    }

}
