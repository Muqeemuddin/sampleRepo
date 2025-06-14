package org.example.recursion;

public class PermutationWithSpaces {

    public static void solve(String str, String out){
        if(str.isEmpty()){
            System.out.println(out);
            return;
        }
        String out1 = out;
        String out2 = out;
        out1 = out1 + str.charAt(0);
        out2 = out2 + " " + str.charAt(0);
        str = str.substring(1);
        solve(str, out1);
        solve(str, out2);
        return;

    }
}
