
package Lists.challenge.challenge2;
public class IntegerNode{

    private challenge2 employee;
    private IntegerNode next;

    public IntegerNode(challenge2 employee)
    {
        this.employee = employee;
    }

    public challenge2 getEmployee() {
        return this.employee;
    }

    public void setEmployee(challenge2 employee) {
        this.employee = employee;
    }

    public IntegerNode getNext() {
        return this.next;
    }

    public void setNext(IntegerNode next) {
        this.next = next;
    }


    public String toString(){
        return employee.toString();
    }
}