package Searching.Trees;

public class Main {
    public static void main(String[] args) {
        Tree intTree = new Tree();
        //insertion
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);
        intTree.insert(17);

        intTree.traverseInOrder(); //should come out in sorted order
        System.out.println();

        System.out.println(intTree.get(27));

        System.out.println(intTree.max());
        System.out.println(intTree.min());

        intTree.delete(15); //case 1
        intTree.traverseInOrder(); 
        System.out.println();

        intTree.delete(17);//case 2
        intTree.traverseInOrder();
        System.out.println();

        intTree.delete(25);// case 3
        intTree.traverseInOrder();
        System.out.println();
    }
}
/*
can perform insertions, deletions and retrievals in O(log n) time
left child has less value than parent, right has more
*/
