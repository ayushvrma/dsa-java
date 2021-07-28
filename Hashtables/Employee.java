package Hashtables;

import java.util.Objects;

public class Employee {
    
    private String firstname;
    private String lastname;
    private int id;

    public Employee(String firstname, String lastname, int id)
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
        if (!(o instanceof Employee)) {
            return false;
        }
        Employee Employee = (Employee) o;
        return Objects.equals(firstname, Employee.getFirstname())
                && Objects.equals(lastname, Employee.getLastname()) && id == Employee.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, id);
    }

    @Override
    public String toString() {
        return ("First name: " + firstname + "\n" + "Last name: " + lastname + "\n" + "id: " + id);
    }

}
