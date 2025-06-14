package org.example.slidingWindow;

public class LargestSubArrayOfK {


    // Only works for positive numbers.
    public static int solve(int[] arr, int cond){
        long sum = 0;
        int maxSize =0, i= 0, j= 0;
        while(j<arr.length){
            sum += arr[j];
            if(sum<cond){
                j++;
            }
            else if( sum == cond){
                if(j-i+1>maxSize){
                    maxSize = j-i+1;
                }
                j++;
            }
            else if( sum > cond){
                while(sum > cond){
                    sum -= arr[i];
                    i++;
                }
                if(sum == cond){
                    if(j-i+1>maxSize){
                        maxSize = j-i+1;
                    }
                }
                j++;
            }
        }

        return maxSize;
    }
}
