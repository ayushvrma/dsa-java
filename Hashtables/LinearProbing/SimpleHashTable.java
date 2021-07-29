package Hashtables.LinearProbing;

public class SimpleHashTable{

    private StoredEmployee[] hashtable;

    public SimpleHashTable()
    {
        hashtable = new StoredEmployee[10];
    }

    private int hashKey(String key){
        return key.length() % hashtable.length;
    }

    public void put(String key, Employee employee){
        int hashedkey = hashKey(key);

        if(occupied(hashedkey))
        {
            int stopIndex = hashedkey;
            if(hashedkey==hashtable.length-1)
            {
                hashedkey=0;
            }
            else{
                hashedkey++;
            }
            while(occupied(hashedkey)&&hashedkey !=stopIndex)
            {
                hashedkey = (hashedkey+1)% hashtable.length;
            }
        }

        if(occupied(hashedkey))
        {
            System.out.println("Already an employee at position "+ hashedkey);
        }
        else{
            hashtable[hashedkey]=new StoredEmployee(key,employee);
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

    private boolean occupied(int index){
        return hashtable[index]!=null;
    }
}