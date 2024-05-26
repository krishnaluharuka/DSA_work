import java.util.Scanner;
class SLLfordelete
{
    private static class node
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
            head=head.next;
        }
    }

    public void deleteatlast()
    {
        if(head==null)
        {
            System.out.print("empty list");
        }
        else if(head.next==null)
        {
            head=null;
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

    public void deleteatpos(int pos)
    {
      if(pos<1)
      {
        System.out.println("pos invalid");
      }
      else if(pos==1)
      {
        if(head==null)
        {
            System.out.print("empty list");
        }
        else if(head.next==null)
        {
            head=null;
        }
        else
        {
            head=head.next;
        }
      }
      else
      {
         node temp=head;
         for(int i=1;i<pos-1&&temp.next!=null;i++)
         {
            temp=temp.next;
         }
         if(temp.next!=null)
         {
            temp.next=temp.next.next;
         }
         else{
            System.out.println("invalid pos");
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
        SLLfordelete s=new SLLfordelete();
        s.head= new node(11);
        node second=new node(12);
        node third=new node(13);
        node fourth=new node(14);
        s.head.next=second;
        second.next=third;
        third.next=fourth;
        System.out.println("Given a singly linked list:");
        s.display();
        System.out.println("press 1 for deletion from the beginning");
        System.out.println("press 2 for deletion from the last");
        System.out.println("press 3 for delete from the certain position");
        System.out.print("enter your choice \t");
        Scanner input=new Scanner(System.in);
        int ch=input.nextInt();
        switch(ch)
        {
            case 1:
            {
                s.deleteatbeg();
                s.display();
                break;

            }
            case 2:
            {
               
                s.deleteatlast();
                s.display();
                break;
            }
            case 3:
            {
                s.deleteatpos(-1);
                s.deleteatpos(1);
                s.deleteatpos(2);
                s.deleteatpos(10);
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