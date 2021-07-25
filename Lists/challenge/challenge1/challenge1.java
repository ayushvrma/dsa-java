//implement the addBefore() method for doubly linked list class

package Lists.challenge.challenge1;

import java.util.Objects;

import Lists.array_list;

public class challenge1 {
    private String firstname;
    private String lastname;
    private int id;

    public challenge1(String firstname, String lastname, int id)
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
        return Objects.equals(firstname, array_list.getFirstname())
                && Objects.equals(lastname, array_list.getLastname()) && id == array_list.getId();
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
        
        challenge1 oyus = new challenge1("Oyus", "Verma", 6969);
        challenge1 unsa = new challenge1("unsa", "sachan", 420);
        challenge1 dkarla = new challenge1("dee", "Karla", 42069);
        
        EmployeeLinkedList list = new EmployeeLinkedList();
        list.addToFront(oyus);
        list.addToFront(unsa);
        list.addToFront(dkarla);

        //list.printList();

        boolean added= list.addBefore(new challenge1("MR Add", "before", 1234), dkarla);

        list.printList();
        System.out.println(added);
        
    }
}
