package stack.Challenge;
import java.util.*;

public class challenge {
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
    }

    public static boolean isPalindrome(String input){
        input = input.toLowerCase();
        String initial="";
        String output = "";
        LinkedList<Character> list = new LinkedList<>();
        for(int i=0; i<input.length();i++)
        {
            if(Character.isLetter(input.charAt(i))){
                list.add(input.charAt(i));
                initial+= input.charAt(i);
            }
        }
        for(int i=0; i<initial.length();i++)
        {
            output+=list.pop();
            //System.out.println(output);
        }
        System.out.println(initial);
        System.out.println(output);
        if(initial.equals(output))
            return true;
        else
            return false;
    }
}
