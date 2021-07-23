package Lists;


import java.util.Objects;

public class single_linkedlist {

    private String firstname;
    private String lastname;
    private int id;

    public single_linkedlist(String firstname, String lastname, int id)
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
        return Objects.equals(firstname, array_list.firstname) && Objects.equals(lastname, array_list.lastname)
                && id == array_list.id;
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
        
        single_linkedlist oyus = new single_linkedlist("Oyus", "Verma", 6969);
        single_linkedlist unsa = new single_linkedlist("unsa", "sachan", 420);
        single_linkedlist dkarla = new single_linkedlist("dee", "Karla", 42069);

        EmployeeLinkedList list = new EmployeeLinkedList();
        list.addToFront(oyus);
        list.addToFront(unsa);
        list.addToFront(dkarla);

        list.printList();

        System.out.println(list.getSize());
        System.out.println(list.isEmpty());
    }
}
