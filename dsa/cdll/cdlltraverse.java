class cdlltraverse
{
    class node
    {
        int data;
        node next;
        node prev;
        node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
;       }
    }
    public node head=null;

    public void add(int x)
    {
        node newnode=new node(x);
        if(head==null)
        {
            head=newnode;
            head.prev=head;
            head.next=head;
        }
        else
        {
            node temp=head.prev;
            temp.next=newnode;
            newnode.next=head;
            newnode.prev=temp;
            head.prev=newnode;
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
            while(temp.next!=head)
            {
                System.out.print(temp.data+"<-->");
                temp=temp.next;
            }
            System.out.print(temp.data);
        }
    }

    public static void main(String args[])
    {
        cdlltraverse d=new cdlltraverse();
        System.out.println("A circular doubly linked list traversed as:");
        d.add(5);
        d.add(10);
        d.add(15);
        d.display();
    }
}