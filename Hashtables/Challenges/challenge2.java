//remove duplicate values

package Hashtables.Challenges;

import java.util.*;

public class challenge2 {
    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();
        
        employees.add(new Employee("dee", "karla", 120));
        employees.add(new Employee("unsa", "sechen", 69));
        employees.add(new Employee("oyus", "vrma", 420));
        employees.add(new Employee("raghav", "chnna", 10));
        
        employees.add(new Employee("oyus", "vrma", 420));
        employees.add(new Employee("raghav", "chnna", 10)); //duplicate values

        Map<String, Employee> hashMap = new HashMap<String,Employee>();
    }
}
