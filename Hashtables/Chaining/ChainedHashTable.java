package Hashtables.Chaining;

import java.util.LinkedList;

public class ChainedHashTable{
    private LinkedList<StoredEmployee>[] hashtable;

    public ChainedHashTable(){
        hashtable = new LinkedList[10];
        for(int i=0; i<hashtable.length;i++)
            hashtable[i] = new LinkedList<StoredEmployee>();
    }

    private int hashKey(String key){
        return key.length() % hashtable.length;
    }

    public void put(String key, Employee employee)
    {
        int hashedKey = hashKey(key);
        hashtable[hashedKey].add(new StoredEmployee(key, employee));
    }
}