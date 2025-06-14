package org.example.recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LetterCaseChange {
    public static void solve(String input, String output, ArrayList<String> list){
        if(input.isEmpty()){
            list.add(output);
            return;
        }
        int charAt = input.charAt(0);
        if(charAt>=48 && charAt<=57){
            output += input.charAt(0);
            input=input.substring(1);
            solve(input, output, list);
            return;
        }
        String output1 = output;
        String output2 = output;
        output1 += String.valueOf(input.charAt(0)).toLowerCase();
        output2 += String.valueOf(input.charAt(0)).toUpperCase();
//        if(charAt>=65 && charAt<=90){
//            output1 += String.valueOf(input.charAt(0)).toLowerCase();
//            output2 += input.charAt(0);
//        }
//        else{
//            output1 += input.charAt(0);
//            output2 += String.valueOf(input.charAt(0)).toUpperCase();
//        }
        input = input.substring(1);
        solve(input, output1, list);
        solve(input, output2, list);
        return;
    }
}
