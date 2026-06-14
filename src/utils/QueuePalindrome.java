package utils;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueuePalindrome {
    
    public boolean isPalindrome(String text){
      Queue<Character> queue = new LinkedList<>();
        
      Stack<Character> stack = new Stack<>();
    
        for (char c : text.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }
        
    
        while (!queue.isEmpty()) {
            if (!queue.poll().equals(stack.pop())) {
                return false; 
            }
        }
        
        return true;  

    }
}
