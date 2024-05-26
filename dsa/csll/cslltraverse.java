class cslltraverse
{
    class node
    {
        int data;
        node next;
        node(int data)
        {
            this.data=data;
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
            head.next=head;
        }
        else
        {
            node temp=head;
            while(temp.next!=head)
            {
                temp=temp.next;
            }
            temp.next=newnode;
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
            while(temp.next!=head)
            {
                System.out.print(temp.data+"-->");
                temp=temp.next;
            }
            System.out.print(temp.data);

        }
        node temp=head;
    }

    public static void main(String args[])
    {
        cslltraverse d=new cslltraverse();
        System.out.println("A circular singly linked list traversed as:");
        d.add(5);
        d.add(10);
        d.add(15);
        d.display();
    }
    
}