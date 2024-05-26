import java.util.Scanner;
public class sl
{
    class node
    {
        int data;
        node next;
        node(int x)
        {
        this.data=x;
        this.next=null;
        }
    }
    public node head=null;

    public void insertatBeg(int x)
    {
        node newnode= new node(x);
        if(head==null)
        {
        head =newnode;
        }
        else 
        {
        newnode.next=head;
        head=newnode;
        }
    }

    public void insertatEnd(int x)
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
            temp=null;
        }
    }

    public void insertatpos(int x, int pos)
    {
        node newnode=new node(x);
        if(pos<1)
        {
            System.out.println("invalid insertion");
        }
        else if(pos==1)
        {
            newnode.next=head;
            head=newnode;
        }
        else 
        {
            node temp=head;
            for(int i=1;i<pos-1;i++)
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
            System.out.println("invalid");
            }
        }
    }
    public void display()
    {
        node temp=head;
        if (temp==null)
        {
            System.out.println("empty");
        }
        while(temp!=null)
        {
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    
    public void count()
    {
        int c=0;
        node temp=head;
        if (temp==null)
        {
            System.out.println("empty");
        }
        else
        {
            while(temp!=null)
            {
                c++;
                temp=temp.next;
            }
            System.out.println("The size of nodes is"+c);
        }
    }
    public void deleteatbeg()
    { 
        if(head==null)
        {
            System.out.println("Empty list");
        }
        else if(head.next==null)
        { 
           head =null;
        }
        else
        {
            head=head.next;
        }
    }
    public void deleteatEnd()
    { 
        if(head==null)
        {
            System.out.println("Empty list");
        }
        else if(head.next==null)
        { 
           head =null;
        }
        else
        { 
            node temp=head;
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
            temp.next=null;
          }
    }
     
    public void deleteatPos( int pos)
    {
        if(pos<1)
        {
            System.out.println("invalid");
        }
        else if(pos==1)
        {
            if(head==null)
            {
                System.out.println("empty");
            }
            else 
            {
                head=head.next;
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
                temp.next=temp.next.next;
            }
            else
            {
                System.out.println("invalid");
            }
        }
    }

        public static void main(String[] args)
        {
            sl n1=new sl();
            System.out.println("Press:");
            System.out.println("1: Insert at beginning");
            System.out.println("2: Insert at end");
            System.out.println("3: Insert at position");
            System.out.println("4: Count nodes");
            System.out.println("5: Deleteion at beginning");
            System.out.println("6: Deletion at end");
            System.out.println("7: Deletion at position");
            System.out.println();
            Scanner sc=new Scanner(System.in);
            System.out.print("enter any number");
            int a=sc.nextInt();
            switch(a)
            {
                case 1:
                {
                    n1.insertatBeg(1);
                    n1.display();
                    break;
                }
                case 2:
                {
                    n1.insertatBeg(1);
                    n1.display();
                    System.out.println("Inserting at end:");
                    n1.insertatEnd(4);
                    n1.display();
                    break;
                }
                case 3:
                {
                    n1.insertatBeg(1);
                    n1.insertatEnd(4);
                    n1.display();
                    System.out.println("Inserting at position:");
                    n1.insertatpos(2,2);
                    n1.insertatpos(3,1);
                    n1.insertatpos(5,5);
                    n1.display();
                    break;
                }
                case 4:
                {
                    n1.insertatBeg(1);
                    n1.insertatpos(2,2);
                    n1.insertatEnd(4);
                    n1.display();
                    System.out.println("Counting nodes...");
                    n1.count();
                    break;
                }
                case 5:
                {
                    n1.insertatBeg(1);
                    n1.insertatpos(2,2);
                    n1.insertatEnd(4);
                    n1.display();
                    System.out.println("Deletion at beginning");
                    n1.deleteatbeg();
                    n1.display();
                    break;
                }
                case 6:
                {
                    n1.insertatBeg(1);
                    n1.insertatpos(2,2);
                    n1.insertatEnd(4);
                    n1.display();
                    System.out.println("Deletion at end:");
                    n1.deleteatEnd();
                    n1.display();
                    break;
                }
                case 7:
                {
                    n1.insertatBeg(1);
                    n1.insertatpos(2,2);
                    n1.insertatEnd(3);
                    n1.insertatEnd(4);
                    n1.display();
                    System.out.println("Deletion at position");
                    n1.deleteatPos(-1);
                    n1.deleteatPos(3);
                    n1.deleteatPos(1);
                    n1.deleteatPos(5);
                    n1.display();
                    break;
                }
                default:
                {
                    System.out.println("Invalid please enter number 1 to 7");
                }
            }

        }
    }

             