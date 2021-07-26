package stack.Using_LinkedList;

public class Main {
    
    public static void main(String[] args) {
        
        
        Employee dkarla = new Employee("dee", "karla", 120);
        Employee unsa = new Employee("unsa", "sechen", 120);
        Employee oyus = new Employee("oyus", "vrma", 120);
        Employee raghav = new Employee("raghav", "chnna", 120);
        
        LinkedStack stack = new LinkedStack();

        stack.push(dkarla);
        stack.push(unsa);
        stack.push(oyus);
        stack.push(raghav);

        stack.pop();

        System.out.println("Peeked item: "+stack.peek());

        stack.printStack();

    }
}
