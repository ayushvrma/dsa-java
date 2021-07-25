
package Lists.challenge;
public class EmployeeNode{

    private challenge1 employee;
    private EmployeeNode next;
    private EmployeeNode previous;
    public EmployeeNode(challenge1 employee)
    {
        this.employee = employee;
    }

    public challenge1 getEmployee() {
        return this.employee;
    }

    public void setEmployee(challenge1 employee) {
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