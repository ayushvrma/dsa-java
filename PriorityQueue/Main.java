package PriorityQueue;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(); //implemetation is min heap
        
        pq.add(25);
        pq.add(-22);
        pq.add(1343);
        pq.add(54);
        pq.add(0);
        pq.add(-3492);
        pq.add(429);

        
        System.out.println(pq.remove()); //removes the highest priority
        
        System.out.println(pq.poll()); ///same as remove

        System.out.println(pq.peek());//gives the highest priority

        Object ints[] = pq.toArray();
        for(Object nums:ints){
            System.out.println(nums);
        }
    }
}
