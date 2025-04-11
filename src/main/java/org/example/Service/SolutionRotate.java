package org.example.Service;

public class SolutionRotate {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        for(int i=1; i<=k; i++){
            int last = nums[nums.length-1];
            for(int j=nums.length-1; j>0; j--){
                nums[j]= nums[j-1];
            }
            nums[0] = last;
        }
    }
}
