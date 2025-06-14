package org.example.recursion;

public class PrintNBitBinary {
    public static void print(int N, int zeros, int ones, String output){
        if(N==0){
            System.out.println(output);
            return;
        }
        if(ones ==zeros){
            String output1 = output;
            output1 += "1";
            print(N-1, zeros, ones +1, output1);
            return;
        }
        else{
            String output1 = output;
            String output2 = output;
            output1+="0";
            output2 +="1";
            print(N-1,zeros+1,ones,output1);
            print(N-1,zeros, ones+1, output2);
            return;
        }
    }
}
