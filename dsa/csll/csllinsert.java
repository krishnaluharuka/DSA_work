import java.util.Scanner;
class csllinsert
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

    public void insertatbeg(int x)
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

    public void insertatlast(int x)
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
        else if(pos>(count()+1))
            {
                System.out.println("invalid position");
            }
        else
        {
            node temp=head;
            int i;
            for(i=1;i<pos-1&&i<=count();i++)
            {
                temp=temp.next;
            }
            if(temp.next!=head)
            {
                newnode.next=temp.next;
                temp.next=newnode;
            }
            else
            {
                temp.next=newnode;
                newnode.next=head;
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
            while(temp.next!=head)
            {
                System.out.print(temp.data+"-->");
                temp=temp.next;
            }
            System.out.print(temp.data);

        }
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
        csllinsert s=new csllinsert();
        System.out.println("A circular singly linked list is given as:");
        s.add(5);
        s.add(10);
        s.add(15);
        s.display();
        
        int ch;
        do{
        System.out.println();
        System.out.println("press 1 for insertion at beginning");
        System.out.println("press 2 for insertion at last");
        System.out.println("press 3 for insertion at position");
        System.out.println("enter your choice");
        Scanner input=new Scanner(System.in);
        ch=input.nextInt();
        switch(ch)
        {
            case 1:
            {
                s.insertatbeg(9);
                s.display();
                break;

            }
            case 2:
            {
                s.insertatlast(11);
                s.display();
                break;
            }
            case 3:
            {
                System.out.println("Insertion at pos<1");
                s.insertatpos(1, -1);
                s.display();
                System.out.println();
                System.out.println("Insertion at pos=1");
                s.insertatpos(1,1);
                s.display();
                System.out.println();
                System.out.println("Insertion at position 2");
                s.insertatpos(3,2);
                s.display();
                System.out.println();
                System.out.println("Insertion at position 10");
                s.insertatpos(10,10);
                s.display();
                break;
            }
            default:
            {
                System.out.println("please enter your choice properly");
            }
        }
        }while(ch<=3);
    }
}

    
