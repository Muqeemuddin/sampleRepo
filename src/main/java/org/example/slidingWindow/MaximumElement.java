package org.example.slidingWindow;

import java.util.ArrayList;

public class MaximumElement {

    public static ArrayList<Integer> solve(int[] arr, int size, int window){
        ArrayList<Integer> result = new ArrayList<>();
        int i=0, j=0, max=Integer.MIN_VALUE;
        int maxPos = 0, secondLarg = Integer.MIN_VALUE+1;
        while(j<arr.length){
            if(arr[j]>max){
                max = arr[j];
                maxPos = j;
            }
            if(arr[j]<max && arr[j]>secondLarg){
                secondLarg = arr[j];
            }
            if(j-i+1<window){
                j++;
            }
            else if(j-i+1 == window){
                result.add(max);
                if(maxPos == i){
                    max = secondLarg;
                    i++;
                    j++;
                }else{
                    i++;
                    j++;
                }

            }
        }
        return result;
    }
}
