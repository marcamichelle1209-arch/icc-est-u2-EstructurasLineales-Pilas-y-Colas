package utils;

public class QueuePalindrome {
    
    public boolean isPalindrome(String text){
      text = text.replaceAll("\\text +", "").toLowerCase();
        
      
        java.util.Queue<Character> queue = new java.util.LinkedList<>();
        java.util.Stack<Character> stack = new java.util.Stack<>();
        
   
        for (char c : text.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }
        
    
        while (!queue.isEmpty()) {
            if (queue.poll() != stack.pop()) {
                return false; 
            }
        }
        
        return true;  

    }
}
