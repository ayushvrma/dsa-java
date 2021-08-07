package Searching.Trees;

public class TreeNode {
    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;


    public void insert(int value)
    {
        if(value==data){
            return; //cause our tree doesnt support duplicate values
        }
        if(value<data)
        {
            if(leftChild==null){
                leftChild= new TreeNode(value);
            }
            else{
                leftChild.insert(value);
            }
        }
        else{
            if(rightChild == null)
            {
                rightChild = new TreeNode(value);
            }
            else{
                rightChild.insert(value);
            }
        }
    }

    public void traverseInOrder(){
        if(leftChild!=null)
        {
            leftChild.traverseInOrder();
        }
        System.out.print(data+ ", ");
        if(rightChild!=null){
            rightChild.traverseInOrder();
        }
    }

    public TreeNode get(int value){
        if(value==data)
        {
            return this; //return the current node (this node)
        }
        if(value<data)
        {
            if(leftChild!=null){
                return leftChild.get(value);
            }
        }
        else{
            if(rightChild!=null)
            {
                return rightChild.get(value);
            }
        }
        return null;
    }

    public int min(){
        if(leftChild==null)
        {
            return data;
        }
        else{
            return leftChild.min();
        }
    }
    
    public int max(){
        if(rightChild==null)
        {
            return data;
        }
        else{
            return rightChild.max();
        }
    }

    public TreeNode(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return this.leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRigNode() {
        return this.rightChild;
    }

    public void setRigNode(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

}
