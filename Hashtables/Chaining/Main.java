package Hashtables.Chaining;

public class Main {
    public static void main(String[] args) {
        Employee dkarla = new Employee("dee", "karla", 420);
        Employee unsa = new Employee("unsa", "sechen", 690);
        Employee oyus = new Employee("oyus", "vrma", 888);
        Employee raghav = new Employee("raghav", "chnna", 969);

        ChainedHashTable ht = new ChainedHashTable();

        ht.put("karla", dkarla);
        ht.put("unsa", unsa);
        ht.put("ayush", oyus);
        ht.put("raghav", raghav);

        //ht.printTable();

        System.out.println("Retrieving raghav"+ ht.get("raghav"));

        ht.remove("raghav");
        ht.remove("dkarla");
        ht.printTable();
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