package org.example.recursion;

import java.util.Stack;

public class SortStackUsingRecursion {

    public static void sort(Stack<Integer> stack){
        if(stack.size() == 1){
            return;
        }
        int last = stack.pop();
        sort(stack);
        insert(stack, last);
        return;
    }

    public static void insert(Stack<Integer> stack, int last){
        if(stack.empty() || stack.lastElement()<=last){
            stack.push(last);
            return;
        }
        int temp = stack.pop();
        insert(stack, last);
        stack.push(temp);
        return;
    }
}
