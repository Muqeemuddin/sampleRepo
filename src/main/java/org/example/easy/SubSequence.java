package org.example.easy;
import java.util.ArrayList;

public class SubSequence {
    // Time complexity of this method is O(n^2) where n is the number of characters in a string.
    public ArrayList<String> subSeq(String str){
        ArrayList<String> result = new ArrayList<>();
        result.add("");
        char[] characters = str.toCharArray();
        for(int i=0; i<characters.length; i++){
            for(int j = i; j<characters.length; j++){
                if(i==j){
                    result.add(String.valueOf(characters[i]));
                }
                else{
                    result.add(String.valueOf(characters[i])+String.valueOf(characters[j]));
                }

            }
        }
        result.add(str);
        return result;
    }

    //Another method using recursion.
    ArrayList<String> result = new ArrayList<>();
    public ArrayList<String> powerSet(String str){
        subSet(str, "", 0);
        return result;
    }

    public void subSet(String str, String curr, int index){
        if(index == str.length()){
            result.add(curr);
            return;
        }
        subSet(str, curr, index +1);
        subSet(str, curr+str.charAt(index), index +1);
    }

}
