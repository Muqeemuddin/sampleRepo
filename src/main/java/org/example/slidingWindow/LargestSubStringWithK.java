package org.example.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LargestSubStringWithK {

    // This method uses O(n^2) time complexity. This is not based on sliding window concept.
    public static int solve(String str, int cond){
        int i=0, j=0, maxLength=0;
        StringBuilder tempStr = new StringBuilder();
        while(j<str.length()){
            tempStr.append(str.charAt(j));
            //long count = tempStr.chars().mapToObj(c -> (char) c).distinct().count();
            if(tempStr.chars().mapToObj(c -> (char) c).distinct().count() < cond){
                j++;
            }
            else if(tempStr.chars().mapToObj(c -> (char) c).distinct().count() == cond){
                maxLength = (int) Math.max(maxLength, tempStr.length());
                j++;
            }
            else if(tempStr.chars().mapToObj(c -> (char) c).distinct().count() > cond){
                while(tempStr.chars().mapToObj(c -> (char) c).distinct().count()>cond){
                    tempStr = new StringBuilder(tempStr.substring(1));
                    i++;
                }
                if(tempStr.chars().mapToObj(c -> (char) c).distinct().count() == cond){
                    maxLength = (int) Math.max(maxLength, tempStr.length());
                    j++;
                }else{
                    j++;
                }

            }
        }
        return maxLength;
    }

    // Create one more method that takes O(n) time complexity but uses extra space. Use Map Data Structure.

    public static int solveSW(String str, int cond){
        int i =0, j=0, maxLength=0;
        Map<Character, Integer> strMap = new HashMap<>();
        while(j<str.length()){
            if(strMap.get(str.charAt(j))!=null){
                strMap.put(str.charAt(j), strMap.get(str.charAt(j))+1);
            }else{
                strMap.put(str.charAt(j), 1);
            }
            if(strMap.size() < cond){
                j++;
            }
            else if (strMap.size() == cond){
                maxLength = Math.max(maxLength, j-i+1);
                j++;
            }
            else if (strMap.size()>cond){
                while(strMap.size()>cond){
                    if(strMap.get(str.charAt(i))>1){
                        strMap.put(str.charAt(i), strMap.get(str.charAt(i))-1);
                        i++;
                    }else{
                        strMap.remove(str.charAt(i));
                        i++;
                    }
                }
                if(strMap.size() == cond){
                    maxLength = Math.max(maxLength, j-i+1);
                }
                j++;
            }
        }
        return maxLength;
    }
}
