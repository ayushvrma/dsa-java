package Queue.CircularQueue;

public class Main {
    public static void main(String[] args) {
        Employee dkarla = new Employee("dee", "karla", 120);
        Employee unsa = new Employee("unsa", "sechen", 120);
        Employee oyus = new Employee("oyus", "vrma", 120);
        Employee raghav = new Employee("raghav", "chnna", 120);

        ArrayQueue queue = new ArrayQueue(10);

        queue.add(dkarla);
        queue.add(unsa);
        queue.add(oyus);
        queue.add(raghav);

        queue.remove();
        System.out.println(queue.peek());

        queue.printQueue();
    }
}
