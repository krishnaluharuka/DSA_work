import java.util.Scanner;
public class cdllcount
{
    class node{
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
        node temp=head;
    }

    public int count()
    {
        int c=0;
        if(head==null)
        {
            return c;
        }
        else
        {
            node temp=head;
            while(temp.next!=head)
            {
                c=c+1;
                temp=temp.next;
            }
            return c+1;
        }
    }

    public static void main(String args[])
    {
        cdllcount s=new cdllcount();
        System.out.println("A circular doubly linked list is given as:");
        s.add(5);
        s.add(10);
        s.add(15);
        s.display();
        System.out.println();
        System.out.println("The number of nodes in the linked list are:"+s.count());
    }
}