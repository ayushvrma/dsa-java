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

        intTree.traverseInOrder(); //should come out in sorted order
    }
}
/*
can perform insertions, deletions and retrievals in O(log n) time
left child has less value than parent, right has more
*/
