class dllsort
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
        } 
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
            newnode.next=head;
            head.prev=newnode;
            head=newnode;
        }
    }

    public void sort()
    {
        node temp;
        node last=null;
        int swap;
        do
        {
            swap=0;
            temp=head;
            while(temp.next!=last)
            {
                if(temp.data>temp.next.data)
                {
                    int t=temp.data;
                    temp.data=temp.next.data;
                    temp.next.data=t;
                    swap=1;
                }
                temp=temp.next;
            }
            last=temp;
        }while(swap!=0);
    }

    public void display()
    {
        node temp=head;
        System.out.print("null<-->");
        while(temp!=null)
        {
            System.out.print(temp.data+"<-->");
            temp=temp.next;
        }
        System.out.println(temp);
    }

    public static void main(String args[])
    {
        dllsort d=new dllsort();
        d.add(1);
        d.add(2);
        d.add(3);
        System.out.println("The linked list before sorting:");
        d.display();
        d.sort();
        System.out.println("The linked list after sorting:");
        d.display();
    }
}