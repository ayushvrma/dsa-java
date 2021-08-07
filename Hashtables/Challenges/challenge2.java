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

        employees.forEach(e -> System.out.println(e));

        Map<Integer, Employee> employeeTable = new HashMap<Integer,Employee>();
        ListIterator<Employee> iterator = employees.listIterator();

        List<Employee> remove = new ArrayList<>();
        while(iterator.hasNext())
        {
            Employee employee = iterator.next();
            if(employeeTable.containsKey(employee.getId())){
                remove.add(employee);
            }
            else{
                employeeTable.put(employee.getId(), employee);
            }
        }
        for(Employee employee:remove){
            employees.remove(employee);
        }
        System.out.println("-------");
        employees.forEach(e->System.out.println(e));
    }
}
