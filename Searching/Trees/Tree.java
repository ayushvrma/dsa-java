package Searching.Trees;

public class Tree {
    private TreeNode root;

    public void insert(int value)
    {
        if(root==null)
        {
            root= new TreeNode(value);
        }
        else{
            root.insert(value);
        }
    }
    public void traverseInOrder()
    {
        if(root!=null)
        {
            root.traverseInOrder();
        }
    }
    public TreeNode get(int value){
        if(root!=null){
            return root.get(value);
        }
        return null;
    }

    public int min(){
        if(root==null)
        {
            return Integer.MIN_VALUE;
        }
        else{
            return root.min();
        }
    }

    public int max(){
        if(root==null)
        {
            return Integer.MAX_VALUE;
        }
        else{
            return root.max();
        }
    }

    public void delete(int value){
        root = delete(root, value); //another reccursive method
    }

    private TreeNode delete(TreeNode subTreeNode, int value){
        if(subTreeNode == null)
        {
            return subTreeNode;
        }
        if(value< subTreeNode.getData()){
            subTreeNode.setLeftChild(delete(subTreeNode.getLeftChild(), value));;
        }
        else if(value>subTreeNode.getData())
        {
            subTreeNode.setRigNode(delete(subTreeNode.getRigNode(), value));
        }
        else{
            if(subTreeNode.getLeftChild()==null){
                return subTreeNode.getRigNode(); //null if it has no children, replaced if it has a right child
            }
            else if(subTreeNode.getRigNode()==null){
                return subTreeNode.getLeftChild();
            }
            //largest value of left sub tree or smallest value of right sub tree
            //case 3: to delete node havin 2 children
            subTreeNode.setData(subTreeNode.getRigNode().min());

            //then delete the node that has the smallest value in the right sub tree
            subTreeNode.setRigNode(delete(subTreeNode.getRigNode(), subTreeNode.getData()));
        }
        return subTreeNode; //when this is not the node we want to delete
    }
}
