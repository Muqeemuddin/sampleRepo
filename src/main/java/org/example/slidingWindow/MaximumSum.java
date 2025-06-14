package org.example.slidingWindow;

public class MaximumSum {
    public static int maxSum(int[] arr, int size, int window){
        int max = Integer.MIN_VALUE;
        int i=0,j=0,sum=0;
        while(j<size){
            sum += arr[j];
            if(j<window-1){
                j++;
            }else{
                max = Math.max(max, sum);
                sum -= arr[i];
                i++;
                j++;
            }
        }
        return max;
    }
}
