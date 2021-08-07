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
        System.out.print("Data = "+ data+ ", ");
        if(rightChild!=null){
            rightChild.traverseInOrder();
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
