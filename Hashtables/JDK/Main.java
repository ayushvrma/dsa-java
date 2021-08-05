package Hashtables.JDK;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        
        Employee dkarla = new Employee("dee", "karla", 120);
        Employee unsa = new Employee("unsa", "sechen", 120);
        Employee oyus = new Employee("oyus", "vrma", 120);
        Employee raghav = new Employee("raghav", "chnna", 120);

        Map<String, Employee> hashMap = new HashMap<String,Employee>();
        hashMap.put("divij", dkarla);
        hashMap.put("unnayan",unsa);
        hashMap.put("ayush",oyus);
        hashMap.put("raghav",raghav);

        System.out.println(hashMap.containsKey("divij")); //faster
        System.out.println(hashMap.containsValue(oyus));

        // Iterator<Employee> iterator = hashMap.values().iterator();
        // while(iterator.hasNext())
        // {
        //     System.out.println(iterator.next());
        // }
        
        //new forEach method printing
        hashMap.forEach((k,v)->System.out.println("Key= "+k+" Value= "+v));

    }
}

/*
implements the Maps interface
implementation is not synchronised
load factor 0.75 is default
*/