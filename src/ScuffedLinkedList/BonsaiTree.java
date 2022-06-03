package ScuffedLinkedList;

public class BonsaiTree {
    public BonsaiLeaf root;



    public void add(int value)
    {
        root = add(value,this.root);
    }
    public BonsaiLeaf add(int value,BonsaiLeaf root)
    {

        if(root == null)

            root = new BonsaiLeaf(value);

        else if(value > root.value)
             root.right = add(value, root.right);
        else
             root.left = add(value,root.left);

        return root;
    }
    public void search(int value)
    {
        search(value,root);
    }
    public void search(int value,BonsaiLeaf root)
    {
        if(root == null)
        System.out.println("NOT FOUND!!!!!!!!!!!!!");
        else if(root.value == value)
        System.out.println("Found!");
        else if(value>root.value)
            search(value,root.right);
        else if(value<root.value)
            search(value,root.left);

    }
    public boolean isLeaf(BonsaiLeaf node)
    {
        if(node.right == null && node.left == null)
            return true;
        else
            return false;
    }
    public boolean isRoot(BonsaiLeaf node)
    {
        return !isLeaf(node);
    }

}
