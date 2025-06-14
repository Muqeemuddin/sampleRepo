package org.example.slidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LargestSubStringOfUniqueChar {

    //Brute Force approach
    public static int solve(String str){
        int maxLength = 0;
        for(int i=0; i<str.length(); i++){
            Set<Character> seen = new HashSet<>();
            for(int j = i; j<str.length(); j++){
                char ch = str.charAt(j);
                if(seen.contains(ch)){
                    break;
                }
                seen.add(ch);
                maxLength = Math.max(maxLength, j-i+1);
            }
        }
        return maxLength;
    }

    // Sliding window approach
    public static int solveWithSW(String str){
        int maxLength = 0, i=0, j=0;
        Map<Character, Integer> strMap = new HashMap<>();
        while(j<str.length()){
            if(!strMap.containsKey(str.charAt(j))){
                strMap.put(str.charAt(j), 1);
            }else{
                strMap.put(str.charAt(j), strMap.get(str.charAt(j))+1);
            }

            if(strMap.size() == j-i+1){
                maxLength = Math.max(maxLength, j-i+1);
                j++;
            }else if(strMap.size() < j-i+1){
                while(strMap.size()< j-i+1){
                    if(strMap.get(str.charAt(i))>1){
                        strMap.put(str.charAt(i), strMap.get(str.charAt(i))-1);
                    }else{
                        strMap.remove(str.charAt(i));
                    }
                    i++;
                }
                if(strMap.size() == j-i+1){
                    maxLength = Math.max(maxLength, j-i+1);
                }
                j++;
            }
        }
        return maxLength;
    }
}
