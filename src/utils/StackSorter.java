package utils;

import java.util.Stack;

public class StackSorter{
    
    public void sortStack(Stack<Integer> stack){
       Stack<Integer> temIntegers = new Stack<>();
        while (!stack.isEmpty()) {
            int temp = stack.pop();
            
            while (!temp Stack.isEmpty() && tempStack.peek() > temp) {
                stack.push(temp Stack.pop());
            }
            
            tempStack.push(temp);
        }
        
        while (!tempStack .isEmpty()) {
            stack.push(tempStack .pop());
        }
    }

}