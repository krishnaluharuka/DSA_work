import java.util.Scanner;
class dllinsert
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

    public void insertatbeg(int x)
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
            newnode.prev=temp;
        }
    }

    public void insertatpos(int x,int pos)
    {
        node newnode=new node(x);
        if(pos<1)
        {
            System.out.println("pos<1 is invalid");
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
               head.prev=newnode;
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
            if(temp==null)
            {
                System.out.println("Invalid position");
            }
            else if(temp.next==null)
            {
                temp.next=newnode;
                newnode.prev=temp;
            }
            else
            {
                newnode.next=temp.next;
                temp.next.prev=newnode;
                temp.next=newnode;
                newnode.prev=temp;
            }
            
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
            System.out.println(temp);

        }
    }

    public static void main(String args[])
    {
        dllinsert d=new dllinsert();
        Scanner input=new Scanner(System.in);
        d.add(1);
        d.add(2);
        d.add(3);
        System.out.println("This is doubly linked list:");
        d.display();
        int ch;
        do
        {
            System.out.println();
            System.out.println("Where do you want to insert your newnode?");
            System.out.println("At the beginning? Press 1");
            System.out.println("At the last? Press 2");
            System.out.println("At your specified position? Press 3");
            ch=input.nextInt();
            switch(ch)
            {
                case 1:
                {
                    System.out.println("Inserting a node at beginning.");
                    System.out.println("What is the data of your newnode?");
                    int a=input.nextInt();
                    d.insertatbeg(a);
                    d.display();
                    break;
                }
                case 2:
                {
                    System.out.println("Inserting a node at last.");
                    System.out.println("What is the data of your newnode?");
                    int a=input.nextInt();
                    d.insertatlast(a);
                    d.display();
                    break;
                }
                case 3:
                {
                    System.out.println("Inserting a node at specified position");
                    System.out.println("What is the data of your newnode?");
                    int a=input.nextInt();
                    System.out.println("What is the position of your newnode?");
                    int b=input.nextInt();
                    d.insertatpos(a,b);
                    d.display();
                    break;
                }
                default:
                {
                    System.out.println("Enter your choice from 1 to 3.");
                }
            }
        }while(ch<=3);
    }
}
