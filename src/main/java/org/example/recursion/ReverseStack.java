package org.example.recursion;

import java.util.Stack;

public class ReverseStack {
    public static void reverse(Stack<Integer> stack){
        // Edge Case - If stack is empty
        if(stack.empty()){
            return;
        }
        // Base condition
        if(stack.size() == 1){
            return;
        }
        //hypothesis
        int temp = stack.pop();
        reverse(stack);
        // Induction
        insert(stack, temp);
        return;
    }

    public static void insert(Stack<Integer> stack, int temp){
        // Base Condition
        if(stack.empty()){
            stack.push(temp);
            return;
        }
        // Hypothesis
        int top = stack.pop();
        insert(stack, temp);
        // Induction
        stack.push(top);
        return;
    }
}
