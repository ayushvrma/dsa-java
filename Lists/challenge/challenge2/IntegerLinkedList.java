package Lists.challenge.challenge2;
public class IntegerLinkedList{
    private IntegerNode head;
    private int size;


    public void addToFront(int value)
    {
        IntegerNode node = new IntegerNode(new challenge2(value));
        node.setNext(head);
        head = node;
    }


    public void printList(){
        IntegerNode current = head;
        System.out.println("Head->");
        while(current!=null)
        {
            System.out.print(current.getEmployee().value+" --> ");
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

    public IntegerNode removeFromFront()
    {
        if(isEmpty())
        return null;

        IntegerNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null); //to completly remove the node
        return removedNode;
    }

    public void addSorted(int value)
    {
        IntegerNode node = new IntegerNode(new challenge2(value));

        IntegerNode temp = head;

        if(head==null || head.getEmployee().value >=value)
        {
            addToFront(value);
            return;
        }

        IntegerNode current = head.getNext();
        IntegerNode prev = head;

            while(current!=null && current.getEmployee().value <=value)
            {
                prev = current;
                current = current.getNext();
            }
            node.setNext(current);
            prev.setNext(node);
            size++;
            return;
        }
    
}