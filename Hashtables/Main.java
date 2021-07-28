package Hashtables;

public class Main {
    public static void main(String[] args) {
        Employee dkarla = new Employee("dee", "karla", 120);
        Employee unsa = new Employee("unsa", "sechen", 120);
        Employee oyus = new Employee("oyus", "vrma", 120);
        Employee raghav = new Employee("raghav", "chnna", 120);
    }
}
/*
Abstract Data Type
key value pairs- data types dont have to match
Optimised for retrieval (when you know the key)
Associative array is a type of hash table

To convert String keys to integers we use Object.hasCode() method - Hashing
Collision occurs when more than one value has the same hash value

Load factor- tells how much the table is full, can play role determining the time complexity for retrival
eg - 0.4 (table 40% full)
*/