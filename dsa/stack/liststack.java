class liststack
{
    class node
    {
        int data;
        node next;
        node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public node top=null;

    public void push(int x)
    {
        node newnode=new node(x);
        if(top==null)
        {
            top=newnode;
        }
        else
        {
            newnode.next=top;
            top=newnode;
        }
        
    }

    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack underflow");
            return -1;
        }
        else
        {
            int x=top.data;
            top=top.next;
            return x;

        }
        
    }

    public boolean isEmpty()
    {
        if(top==null)
        {
            return true;
        }
        else
        return false;
    }

    public void display()
    {
        node temp=top;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
        
    }

    public static void main(String args[])
    {
        liststack as=new liststack();
        System.out.println("Stack if it is empty");
        as.pop();
        as.display();
        System.out.println();
        System.out.println("Stack after push operation");
        as.push(15);
        as.push(90);
        as.push(5);
        as.push(9);
        as.display();
        System.out.println();
        System.out.println("Stack after pop operation of two items");
        as.pop();
        as.pop();
        as.display();
    }
}