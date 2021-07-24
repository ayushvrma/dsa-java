package Lists.Doubly;
public class EmployeeLinkedList{
    private EmployeeNode head;
    private int size;
    private EmployeeNode tail;

    public void addToFront(doubly_linkedlist employee)
    {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        
        if(head == null)
        {
            tail = node;
        }
        else
        {
            head.setPrevious(node);
        }
        head = node;
        size++;
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
        head = head.getNext();
        size--;
        removedNode.setNext(null); //to completly remove the node
        return removedNode;
    }
}