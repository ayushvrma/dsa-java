
package Lists.Singly;
public class EmployeeNode{

    private single_linkedlist employee;
    private EmployeeNode next;

    public EmployeeNode(single_linkedlist employee)
    {
        this.employee = employee;
    }

    public single_linkedlist getEmployee() {
        return this.employee;
    }

    public void setEmployee(single_linkedlist employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return this.next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }


    public String toString(){
        return employee.toString();
    }
}