package org.example.Service;

import java.util.ArrayList;
import java.util.List;

public class Solution {
        public int removeDuplicates(int[] nums) {
            List<Integer> numbers = new ArrayList<>();
            numbers.add(nums[0]);
            for(int i=1; i<nums.length; i++ ){
                if(nums[i]!=nums[i-1]){
                    numbers.add(nums[i]);
                }
            }
            System.out.println(numbers);
            int num[] = new int[numbers.size()];
            for(int i=0; i<numbers.size(); i++){
                num[i] = numbers.get(i);
            }
            for(int i: num){
                System.out.println(i);
            }
            for(int i: nums){
                System.out.println(i);
            }
            return numbers.size();
        }
}

