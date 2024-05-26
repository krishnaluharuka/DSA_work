class dlldisplay
{
    class node
    {
        int data;
        node prev;
        node next;
        node(int data)
        {
            this.data=data;
            this.prev=null;
            this.next=null;
;       }
    }
    public node head=null;

    public void add(int x)
    {
        node newnode=new node(x);
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            head.prev=newnode;
            newnode.next=head;
            head=newnode;
        }
    }

    public void display()
    {
        if(head==null)
        {
            System.out.println("empty list");
        }
        else
        {
            node temp=head;
            System.out.print("null<-->");
            while(temp!=null)
            {
                System.out.print(temp.data+"<-->");
                temp=temp.next;
            }
            System.out.print(temp);

        }
    }

    public static void main(String args[])
    {
        dlldisplay d=new dlldisplay();
        System.out.println("A doubly linked list traversed as:");
        d.add(5);
        d.add(10);
        d.add(15);
        d.display();
    }
    
}