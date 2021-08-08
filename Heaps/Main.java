package Heaps;

public class Main {
    public static void main(String[] args) {
        Heap heap = new Heap(10);

        heap.insert(80);
        heap.insert(75);
        heap.insert(60);
        heap.insert(68);
        heap.insert(55);
        heap.insert(40);
        heap.insert(52);
        heap.insert(67);

        heap.printHeap();

       // heap.delete(1); //delete 75

        heap.sort(); //worst time complexity is O(nlogn)

        heap.printHeap();
    }
}
/*
Heaps are binary trees where every parent is greater than or equal to its children (max heap)
Heaps are complete trees
children are added from left to right
heapify: process of converting a binary tree into heap
*/