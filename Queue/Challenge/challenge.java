package Queue.Challenge;
import java.util.*;

public class challenge {
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("bullshit"));
        System.out.println(isPalindrome("I am mai"));
    }


    public static boolean isPalindrome(String input){
        input = input.toLowerCase();
        LinkedList<Character> stack = new LinkedList<>();
        LinkedList<Character> queue = new LinkedList<>();

        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                stack.push(input.charAt(i));
                queue.addLast(input.charAt(i));
            }
        }

        for(int i=0; i<stack.size();i++)
        {
            //System.out.println(stack.pop()+ ","+ queue.pop());
            if(!(stack.pop() == queue.pop())){
                return false;}
        }
        return true;
    }
}
