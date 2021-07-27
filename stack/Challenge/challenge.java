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
            if(Character.isLetter(input.charAt(i)))
                list.add(input.charAt(i));
                initial+= input.charAt(i);
        }
        for(int i=0; i<list.size();i++)
        {
            list2.add(list.pop());
            output+=temp.pop();
        }
        if(initial==output)
            return true;
        else
            return false;
    }
}
