package org.example.recursion;

public class BalancedParenthesis {

    public static void solve(int open, int close, String output){
        if(open == 0 && close == 0){
            System.out.println(output);
            return;
        }
        if(open==close){
            output += "(";
            solve(open-1, close, output);
            return;
        }
        if(open<close){
            if(open!=0){
                String output1 = output;
                String output2 = output;
                output1 += "(";
                output2 += ")";
                solve(open-1, close,output1 );
                solve(open, close-1,output2);
                return;
            }
            else{
                output += ")";
                solve(open, close-1, output);
                return;
            }
        }
        return;
    }

}
