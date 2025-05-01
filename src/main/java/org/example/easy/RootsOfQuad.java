package org.example.easy;

import java.util.ArrayList;
import java.util.List;

public class RootsOfQuad {
    public static ArrayList<Integer> findRoots(int a , int b, int c){
        ArrayList<Integer> roots = new ArrayList<>();
        int t1 = b*b - (4*a*c);
        if(t1<0){
            return new ArrayList<>(List.of(-1));
        }
        double k = Math.sqrt(t1);
        int root1 = (int) Math.floor( ((-1*b + k)/(2*a)));
        int root2 = (int) Math.floor(((-1*b - k)/(2*a)));

        if(root1>root2){
            roots.add(root1);
            roots.add(root2);
        }
        else{
            roots.add(root2);
            roots.add(root1);
        }
        return roots;
    }


}
