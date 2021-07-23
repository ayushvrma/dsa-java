package Lists;
public class EmployeeLinkedList{
    private EmployeeNode head;
    private int size;


    public void addToFront(single_linkedlist employee)
    {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
    }


    public void printList(){
        EmployeeNode current = head;
        System.out.println("Head->");
        while(current!=null)
        {
            System.out.print(current+" --> ");
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

    public EmployeeNode removeFromFront()
    {
        if(isEmpty())
        return null;

        EmployeeNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null); //to completly remove the node
        return removedNode;
    }
}