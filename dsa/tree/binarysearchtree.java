class binarysearchtree
{
    class node
    {
        node left;
        node right;
        int data;
        node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    
    public node root=null;

    public void insert(int data)
    {
        root=insertNode(root,data);
    }

    public void delete(int data)
    {
        root=deleteNode(root,data);
    }

    public boolean search(int data)
    {
        return searchNode(root,data);
    }

    node insertNode(node root,int data)
    {
        if(root==null)
        {
            return new node(data);
        }
        else if(data<root.data)
        {
            root.left=insertNode(root.left,data);
        }
        else if(data>root.data)
        {
            root.right=insertNode(root.right,data);
        }
        return root;
    }

    node deleteNode(node root,int data)
    {
        if(root==null)
        {
            return null;
        }
        else if(data<root.data)
        {
            root.left=deleteNode(root.left,data);
        }
        else if(data>root.data)
        {
            root.right=deleteNode(root.right,data);
        }
        else
        {
            if(root.left==null)
            {
                return root.right;
            }
            else if(root.right==null)
            {
                return root.left;
            }
            node temp=minNode(root);
            root.data=temp.data;
            root.right=deleteNode(root.right,root.data);
        }
        return root;
    }

    private node minNode(node root)
    {
        if(root.left!=null)
        {
            return minNode(root.left);
        }
        else
        {
            return root;
        }
    }

    private boolean searchNode(node root,int data)
    {
        if(root==null)
        return false;
        else if(root.data==data)
        return true;
        else if(data<root.data)
        return searchNode(root.left,data);
        else
        return searchNode(root.right,data);
    }

    public void inorder()
    {
        inorderTraverse(root);
    }

    private void inorderTraverse(node root)
    {
        if(root!=null)
        {
            inorderTraverse(root.left);
            System.out.print(root.data+" ");
            inorderTraverse(root.right);
        }
    }
    public static void main(String args[])
    {
        binarysearchtree bst=new binarysearchtree();
        bst.insert(11);
        bst.insert(21);
        bst.insert(31);
        System.out.println("Inorder traverse of binary tree");
        bst.inorder();
        System.out.println();
        int searchValue=31;
        boolean isFound=bst.search(searchValue);
        if(isFound)
        System.out.println(searchValue+"is found");
        else
        System.out.println(searchValue+"not found");
        int deleteValue=21;
        bst.delete(deleteValue);
        System.out.println("After deleting"+deleteValue+"the inorder traverse:");
        bst.inorder();
    }
}