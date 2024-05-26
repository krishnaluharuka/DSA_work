class SllForTraverse
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
        SllForTraverse s=new SllForTraverse();
        s.head= new node(11);
        node second=new node(12);
        node third=new node(13);
        node fourth=new node(14);
        s.head.next=second;
        second.next=third;
        third.next=fourth;
        System.out.println("A singly linked list traversed is given as:");
        s.display();
    }}