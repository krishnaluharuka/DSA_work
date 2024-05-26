import java.util.Scanner;
class cdlldelete
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

    public void deleteatbeg()
    {
        if(head==null)
        {
            System.out.println("Empty list");
        }
        else if(head.next==null)
        {
            head=null;
        }
        else
        {
            node temp=head.prev;
            temp.next=head.next;
            head=head.next;
            head.prev=temp;
        }
    }

    public void deleteatlast()
    {
        if(head==null)
        {
            System.out.println("Empty list");
        }
        else if(head.next==null)
        {
            head=null;
        }
        else
        {
            node temp=head.prev.prev;
            temp.next=head;
            head.prev=temp;
        }
    }

    

    public void deleteatpos(int pos)
    {
        if(pos<1)
        {
            System.out.println("pos<1 is invalid");
        }
        else if(pos==1)
        {
            if(head==null)
            {
                System.out.println("Empty list");
            }
            else if(head.next==null)
            {
                head=null;
            }
            else
            {
                node temp=head.prev;
                temp.next=head.next;
                head=head.next;
                head.prev=temp;
            }
        }
        
        else
        {
            node temp=head;
            for(int i=1;i<pos-1&&temp.next!=head;i++)
            {
                temp=temp.next;
            }
            if(temp.next!=head)
            {
                temp.next=temp.next.next;
                temp.prev=temp;
            }
            else
            {
                System.out.println("invalid position");
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
        cdlldelete d=new cdlldelete();
        Scanner input=new Scanner(System.in);
        d.add(1);
        d.add(2);
        d.add(3);
        d.add(4);
        d.add(5);
        d.add(6);
        System.out.println("This is circular doubly linked list:");
        d.display();
        int ch;
        do
        {
            System.out.println();
            System.out.println("From where do you want to delete your newnode?");
            System.out.println("From the beginning? Press 1");
            System.out.println("From the last? Press 2");
            System.out.println("From the specified position? Press 3");
            ch=input.nextInt();
            switch(ch)
            {
                case 1:
                {
                    System.out.println("Deleteing a node from the beginning.");
                    d.deleteatbeg();
                    d.display();
                    break;
                }
                case 2:
                {
                    System.out.println("Delete a node at last.");
                    d.deleteatlast();
                    d.display();
                    break;
                }
                case 3:
                {
                    System.out.println("Deletion at pos<1");
                    d.deleteatpos(-1);
                    d.display();
                    System.out.println();
                    System.out.println("Deletion at pos=1");
                    d.deleteatpos(1);
                    d.display();
                    System.out.println();
                    System.out.println("Deletion at position 2");
                    d.deleteatpos(2);
                    d.display();
                    System.out.println();
                    System.out.println("Deletion at position 10");
                    d.deleteatpos(10);
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

