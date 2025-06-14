package org.example.recursion;

import java.util.Stack;

public class RemoveMiddleElement {

    public static void remove(Stack<Integer> stack, int size){
        if(stack.empty()){
            return;
        }
        if(stack.size()==size/2+1){
            stack.pop();
            return;
        }
        int last = stack.pop();
        remove(stack, size);
        stack.push(last);
        return;
    }
}
