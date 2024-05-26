
import java.util.Scanner;
class SLL
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
    public node head=null;

    public void insertatbeg(int x)
    {
        node newnode=new node(x);
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            newnode.next=head;
            head=newnode;
        }
    }

    public void insertatlast(int x)
    {
        node newnode=new node(x);
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }

    public void insertatpos(int x,int pos)
    {
        node newnode=new node(x);
        if(pos<1)
        {
            System.out.println("position less than 1 is invalid");
        }
        else if(pos==1)
        {
            if(head==null)
            {
                head=newnode;
            }
            else
            {
                newnode.next=head;
                head=newnode;
            }  
        }
        else
        {
            node temp=head;
            for(int i=1;i<pos-1&&temp!=null;i++)
            {
                temp=temp.next;
            }
            if(temp!=null)
            {
            newnode.next=temp.next;
            temp.next=newnode;
            }
            else
            {
                System.out.println("invalid position for insert");
            }
        }
    }

    public void display()
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print(temp+"\n");
        System.out.println("*******************************");
        System.out.print("\n");

    }
   
    public static void main(String args[])
    {
        SLL s=new SLL();
        System.out.println("press 1 for insertion at beginning");
        System.out.println("press 2 for insertion at last");
        System.out.println("press 3 for insertion at position");
        System.out.println("enter your choice");
        Scanner input=new Scanner(System.in);
        int ch=input.nextInt();
        switch(ch)
        {
            case 1:
            {
                s.insertatbeg(9);
                s.insertatbeg(10);
                s.display();
                break;

            }
            case 2:
            {
                s.insertatlast(11);
                s.insertatlast(15);
                s.display();
                break;
            }
            case 3:
            {
                s.insertatpos(1, -1);
                s.insertatpos(1,1);
                s.insertatpos(3,2);
                s.insertatpos(6,2);
                s.insertatpos(10,10);
                s.display();
                break;
            }
            default:
            {
                System.out.println("please enter your choice properly");
            }
        }
    }
}