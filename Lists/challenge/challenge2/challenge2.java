//make addSorted method

package Lists.challenge.challenge2;


public class challenge2 {
    int value;


    public challenge2(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static void main(String[] args) {

        IntegerLinkedList list = new IntegerLinkedList();
        // list.addToFront(8);
        // list.addToFront(6);
        // list.addToFront(4);
        // list.addToFront(2);

        list.addSorted(5);
        list.addSorted(3);
        list.addSorted(8);
        list.addSorted(4);
        list.addSorted(9);

        list.printList();
    }
    
}
