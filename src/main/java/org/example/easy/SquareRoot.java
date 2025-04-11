package org.example.easy;

public class SquareRoot {
    // finding nearest smaller integer square root of x.

    public int findSquareRoot(int x){
        // Using binary approach
        int low = 0;
        int high = x;
        int res = 0;
        while(low<=high){
            int mid = (low + (high-low)/2);
            if(mid*mid>x){
                high = mid -1;
            }
            else if(mid*mid<x){
                res = mid;
                low = mid +1;
            }
            else{
                return mid;
            }
        }
        return res;
    }

    public int findSquareRoot(int x, int methodType){
        for(int i =0; i<x; i++){
            if(i*i>x){
                return i-1;
            }
        }
        return 0;
    }
}
