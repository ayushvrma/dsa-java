
package Lists.Doubly;
public class EmployeeNode{

    private doubly_linkedlist employee;
    private EmployeeNode next;
    private EmployeeNode previous;
    public EmployeeNode(doubly_linkedlist employee)
    {
        this.employee = employee;
    }

    public doubly_linkedlist getEmployee() {
        return this.employee;
    }

    public void setEmployee(doubly_linkedlist employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return this.next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    public EmployeeNode getPrevious() {
        return this.previous;
    }

    public void setPrevious(EmployeeNode previous) {
        this.previous = previous;
    }



    public String toString(){
        return employee.toString();
    }
}