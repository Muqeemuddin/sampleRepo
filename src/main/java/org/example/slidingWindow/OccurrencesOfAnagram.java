package org.example.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class OccurrencesOfAnagram {
    // Brute Force approach
    public static int countOccurrences(String str, String pattern){
        Map<Character, Integer> pMap = new HashMap<>();
        int count= 0;
        for(int i =0; i<pattern.length(); i++){
            if(!pMap.containsKey(pattern.charAt(i))){
                pMap.put(pattern.charAt(i), 1);
            }
            else{
               pMap.put(pattern.charAt(i), pMap.get(pattern.charAt(i))+1);
            }
        }
        for(int i=0; i<str.length()-pattern.length()+1; i++){
            String subString = str.substring(i, i+pattern.length());
            Map<Character, Integer> sMap = new HashMap<>();
            for(int j =0; j<subString.length(); j++){
                if(!sMap.containsKey(subString.charAt(j))){
                    sMap.put(subString.charAt(j), 1);
                }
                else{
                    sMap.put(subString.charAt(j), sMap.get(subString.charAt(j))+1);
                }
            }
            if(sMap.equals(pMap)){
                count++;
            }

        }
        return count;
    }

    //Using Sliding Window
    public static int countOccurrencesSW(String str, String pattern){
        Map<Character, Integer> pMap = new HashMap<>();
        for(int i=0; i<pattern.length(); i++){
            if(!pMap.containsKey(pattern.charAt(i))){
                pMap.put(pattern.charAt(i), 1);
            }else{
                pMap.put(pattern.charAt(i), pMap.get(pattern.charAt(i))+1);
            }
        }
        Map<Character, Integer> sMap = new HashMap<>();
        int i =0, j=0, count = 0;
        while(j<str.length()){
            if(!sMap.containsKey(str.charAt(j))){
                sMap.put(str.charAt(j), 1);
            }else{
                sMap.put(str.charAt(j), sMap.get(str.charAt(j))+1);
            }
            if(j-i+1<pattern.length()){
                j++;
            }
            else if(j-i+1 == pattern.length()){
                if(sMap.equals(pMap)){
                    count++;
                    if(sMap.get(str.charAt(i))>1){
                        sMap.put(str.charAt(i), sMap.get(str.charAt(i))-1);
                    }else{
                        sMap.remove(str.charAt(i));
                    }
                    i++;
                    j++;
                }else{
                    if(sMap.get(str.charAt(i))>1){
                        sMap.put(str.charAt(i), sMap.get(str.charAt(i))-1);
                    }else{
                        sMap.remove(str.charAt(i));
                    }
                    i++;
                    j++;
                }
            }
        }
        return count;
    }
}
