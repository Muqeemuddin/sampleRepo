package org.example.recursion;

import java.util.ArrayList;

public class SortUsingRecursion {

    public static void sort(ArrayList<Integer> arrayList){
        if(arrayList.size()==1) {
            return;
        }
        int temp = arrayList.getLast();
        arrayList.removeLast();
        sort(arrayList);
        insert(arrayList, temp);
        return;
    }

    public static void insert(ArrayList<Integer> arrayList, int temp){
        if(arrayList.isEmpty() || arrayList.getLast()<=temp){
            arrayList.add(temp);
            return;
        }
        int last = arrayList.getLast();
        arrayList.removeLast();
        insert(arrayList, temp);
        arrayList.add(last);
        return;
    }
}
