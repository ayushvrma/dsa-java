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
        int hashedkey = findKey(key);
        if(hashedkey==-1)
        {
            return null;
        }
        return hashtable[hashedkey].employee;
    }

    public void printTable()
    {
        for(int i=0 ;i<hashtable.length;i++ )
        {
            if(hashtable[i]!=null){
                System.out.println("empty");
            }
            System.out.println("position "+i+": "+hashtable[i].employee);
        }
    }

    private int findKey(String key){
        int hashedKey = hashKey(key);
        if(hashtable[hashedKey]!=null && hashtable[hashedKey].key.equals(key)){
            return hashedKey;
        }


        int stopIndex = hashedKey;
        if (hashedKey == hashtable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }
        while (hashedKey != stopIndex && hashtable[hashedKey]!=null && !hashtable[hashedKey].key.equals(key)) {
            hashedKey = (hashedKey + 1) % hashtable.length;

        }
        if(hashtable[hashedKey]!=null && hashtable[hashedKey].key.equals(key)){
            return hashedKey;
        }
        else{
            return -1;
        }

    }
    

    private boolean occupied(int index){
        return hashtable[index]!=null;
    }

    public Employee remove(String key){
        int hashedKey = findKey(key);
        if(hashedKey==-1){
            return null;
        }
        Employee employee = hashtable[hashedKey].employee;
        //hashtable[hashedKey]= null;
        
        StoredEmployee[] oldHashtable = hashtable;
        hashtable = new StoredEmployee[oldHashtable.length];

        for(int i=0; i<oldHashtable.length;i++) //rehashing
        {
            if(oldHashtable[i]!=null)
            {
                put(oldHashtable[i].key, oldHashtable[i].employee);
            }
        }
        return employee;
    }
}