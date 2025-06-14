package org.example.recursion;

public class PermutationWithCaseChange {

    public static void solve(String input, String output){
        if(input.isEmpty()){
            System.out.println(output);
            return;
        }
        String output1 = output;
        String output2 = output;
        output1 += input.charAt(0);
        output2 += String.valueOf(input.charAt(0)).toUpperCase();
        input = input.substring(1);
        solve(input, output1);
        solve(input, output2);
        return;
    }
}
