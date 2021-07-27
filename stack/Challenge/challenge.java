package stack.Challenge;
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
        String initial="";
        String output = "";
        LinkedList<Character> list = new LinkedList<>();
        for(int i=0; i<input.length();i++)
        {
            if(Character.isLetter(input.charAt(i))){
                list.push(input.charAt(i));
                initial+= input.charAt(i);
            }
        }
        //System.out.println(list);
        // System.out.println(list.pop().toString());
        for(int i=0; i<initial.length();i++)
        {
            output+=list.pop();
            //System.out.println(output);
        }
        //  System.out.println(initial);
        // System.out.println(output);
        if(initial.equals(output))
            return true;
        return false;
    }
}
