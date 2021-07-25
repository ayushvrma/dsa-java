package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.*;

public class array_list {
    String firstname;
    String lastname;
    public int id;

    public array_list(String firstname, String lastname, int id)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
    }


    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof array_list)) {
            return false;
        }
        array_list array_list = (array_list) o;
        return Objects.equals(firstname, array_list.firstname) && Objects.equals(lastname, array_list.lastname) && id == array_list.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, id);
    }


    @Override
    public String toString(){
        return("First name: "+ firstname + "\n"+ "Last name: "+lastname +"\n"+ "id: "+id);
    }
    

    public static void main(String[] args) {
        List<array_list> employeeList = new ArrayList<>(); //by default the capacity is 10

        employeeList.add(new array_list("Oyus", "Verma", 6969));
        employeeList.add(new array_list("unsa", "sachan", 420));
        employeeList.add(new array_list("dee", "Karla", 42069));


        //employeeList.forEach(employee-> System.out.println(employee)); //to loop over all employee objects stored in the arraylist

        //System.out.println(employeeList.get(1)); //to get and print the 2nd employee object

        //System.out.println(employeeList.isEmpty());

        employeeList.set(1, new array_list("gzn", "shrma", 786));
        //System.out.println(employeeList.get(1));

        employeeList.add(2, new array_list("shreshtha", "sharma", 777));
        //employeeList.forEach(employee -> System.out.println(employee));


        array_list employeeArray[]= employeeList.toArray(new array_list[employeeList.size()]); // to convert the arraylist into an array of objects

        for(array_list employee: employeeArray)
        {
            System.out.println(employee);
        }

        System.out.println(employeeList.contains(new array_list("Oyus", "Verma", 6969))); //we get false if we havent implemented the isequals method, in this case it is creating another object to compare it to it.


        employeeList.remove(2); //elements are shifted back to 1 position therefore O(n)

    }
}


/*
arraylists have the advantages and disadvantages that arrays have
itll be easier to process data if its index is known
*/