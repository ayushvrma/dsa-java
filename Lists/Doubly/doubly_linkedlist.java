package Lists.Doubly;
import java.util.Objects;

import Lists.array_list;

public class doubly_linkedlist {private String firstname;
    private String lastname;
    private int id;

    public doubly_linkedlist(String firstname, String lastname, int id)
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
        return Objects.equals(firstname, array_list.getFirstname()) && Objects.equals(lastname, array_list.getLastname())
                && id == array_list.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, id);
    }

    @Override
    public String toString() {
        return ("First name: " + firstname + "\n" + "Last name: " + lastname + "\n" + "id: " + id);
    }


    public static void main(String[] args) {
        
        doubly_linkedlist oyus = new doubly_linkedlist("Oyus", "Verma", 6969);
        doubly_linkedlist unsa = new doubly_linkedlist("unsa", "sachan", 420);
        doubly_linkedlist dkarla = new doubly_linkedlist("dee", "Karla", 42069);

        EmployeeLinkedList list = new EmployeeLinkedList();
        list.addToFront(oyus);
        list.addToFront(unsa);
        list.addToFront(dkarla);

        list.printList();

        System.out.println(list.getSize());
        System.out.println(list.isEmpty());
    }
}

    
