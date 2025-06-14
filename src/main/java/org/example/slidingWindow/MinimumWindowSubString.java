package org.example.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubString {
    //Brute Force Approach
    public static int solve(String str, String pattern){
        int minLength = Integer.MAX_VALUE;
        String result = "";
        for(int i =0; i<str.length(); i++){
            for(int j = i; j<=str.length(); j++){
                String subString = str.substring(i, j);
                if(containsChars(subString, pattern)){
                    if(subString.length()<minLength){
                        minLength = subString.length();
                        result = subString;
                    }
                }
            }
        }
        System.out.println(result);
        return minLength;
    }

    public static boolean containsChars(String subString, String pattern){
        Map<Character, Integer> subStringMap = new HashMap<>();
        Map<Character, Integer> patternMap = new HashMap<>();
        for(int i = 0; i <pattern.length(); i++){
            patternMap.put(pattern.charAt(i), patternMap.getOrDefault(pattern.charAt(i), 0)+1);
        }
        for(char ch:subString.toCharArray()){
            subStringMap.put(ch, subStringMap.getOrDefault(ch, 0)+1);
        }
        for(Map.Entry<Character, Integer> i : patternMap.entrySet()){
            if(!subStringMap.containsKey(i.getKey())){
                return false;
            }else if(subStringMap.get(i.getKey()) != i.getValue()){
                return false;
            }
        }
        return true;
    }

    // Using Sliding Window approach
    public static int solveWithSW(String str, String pattern){
        Map<Character, Integer> patternMap = new HashMap<>();
        for(char ch:pattern.toCharArray()){
            patternMap.put(ch, patternMap.getOrDefault(ch, 0) +1);
        }
        int i =0, j=0, minLenth = Integer.MAX_VALUE;
        while(j<str.length()){
            if(patternMap.containsKey(str.charAt(j))){
                if(patternMap.get(str.charAt(j))>1){
                    patternMap.put(str.charAt(i), patternMap.get(str.charAt(j))-1);
                }else{
                    patternMap.remove(str.charAt(j));
                }
            }
            if(patternMap.size()>0){
                j++;
            }else if(patternMap.size()==0){
                minLenth = Math.min(minLenth, j-i+1);
                j++;

            }
        }
        return 0;
    }
}
