package Lists.challenge;

import java.util.Currency;

public class EmployeeLinkedList{
    private EmployeeNode head;
    private int size;
    private EmployeeNode tail;

    public void addToFront(challenge1 employee)
    {
        EmployeeNode node = new EmployeeNode(employee);
        
        if(head == null)
        {
            tail = node;
        }
        else
        {
            head.setPrevious(node);
            node.setNext(head);
        }
        head = node;
        size++;
    }


    public void printList(){
        EmployeeNode current = head;
        System.out.println("Head->");
        while(current!=null)
        {
            System.out.print(current+" <-> ");
            current = current.getNext();
        }
        System.out.print("null");
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty()
    {
        return head==null;
    }

    public EmployeeNode getHead() {
        return this.head;
    }

    public void setHead(EmployeeNode head) {
        this.head = head;
    }
    public void setSize(int size) {
        this.size = size;
    }

    public EmployeeNode getTail() {
        return this.tail;
    }

    public void setTail(EmployeeNode tail) {
        this.tail = tail;
    }
    public EmployeeNode removeFromFront()
    {
        if(isEmpty())
        return null;

        EmployeeNode removedNode = head;
        
        if(head.getNext() ==null)
        {
            tail = null;
        }
        else{
            head.getNext().setPrevious(null);
        }

        head = head.getNext();
        size--;
        removedNode.setNext(null); //to completly remove the node
        return removedNode;
    }
    public void addToEnd(challenge1 employee)
    {
        EmployeeNode node = new EmployeeNode(employee);
        if(tail==null){
            head = node;
        }
        else{
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
        size++;
    }

    public EmployeeNode removeFromEnd(challenge1 employee)
    {
        if(isEmpty())
        {
            return null;
        }

        EmployeeNode removedNode = tail;

        if(tail.getPrevious() ==null)
        {
            head = null;
        }
        else{
            tail.getPrevious().setNext(null);
        }
        tail = tail.getPrevious();
        size--;
        removedNode.setPrevious(null);
        return removedNode;
    }


    public boolean addBefore(challenge1 newemployee, challenge1 existingEmployee)
    {
        EmployeeNode temp = head;
        EmployeeNode newemp = new EmployeeNode(newemployee);

            
            while(temp!=null && !temp.getEmployee().equals(existingEmployee))
            {
                temp = temp.getNext();
            }

            if(temp==null)
            {
                return false;
            }

            newemp.setPrevious(temp.getPrevious());
            newemp.setNext(temp);
            temp.setPrevious(newemp);

            if(head==temp)
            {
                head = newemp;
            }
            else{
                newemp.getPrevious().setNext(newemp);
            }
            size++;
            return true;
        
    }
}