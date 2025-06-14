package org.example.slidingWindow;

import java.util.ArrayList;
import java.util.List;

public class FirstNegativeNumber {

    // Brute force approach
    public static void print(int[] arr, int length, int window){
        for(int i=0; i<length-window +1; i++){
            for(int j=i; j<window +i; j++) {
                if (arr[j] < 0) {
                    System.out.println(arr[j]);
                    break;
                }
            }
        }
    }

    // Sliding Window approach
    public static void printSW(int[] arr, int length, int window){
        int i= 0, j=0;
        List<Integer> list = new ArrayList<>();
        while(j<length){
            if(arr[j]<0){
                list.add(arr[j]);
            }
            if(j-i+1<window){
                j++;
            }
            else if(j-i+1==window){
                if(list.isEmpty()){
                    System.out.println(0);
                }else{
                    System.out.println(list.getFirst());
                    if(arr[i] == list.getFirst()){
                        list.removeFirst();
                    }
                    i++;
                    j++;
                }
            }
        }
    }
}
