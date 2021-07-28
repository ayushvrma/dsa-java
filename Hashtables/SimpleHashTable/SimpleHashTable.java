package Hashtables.SimpleHashTable;

public class SimpleHashTable{

    private Employee[] hashtable;

    public SimpleHashTable()
    {
        hashtable = new Employee[10];
    }

    private int hashKey(String key){
        return key.length() % hashtable.length;
    }

    public void put(String key, Employee employee){
        int hashedkey = hashKey(key);

        if(hashtable[hashedkey] != null)
        {
            System.out.println("Already an employee at position "+ hashedkey);
        }
        else{
            hashtable[hashedkey]=employee;
        }
    }

    public Employee get(String key)
    {
        int hashedkey = hashKey(key);
        return hashtable[hashedkey];
    }

    public void printTable()
    {
        for(int i=0 ;i<hashtable.length;i++ )
        {
            System.out.println(hashtable[i]);
        }
    }
}