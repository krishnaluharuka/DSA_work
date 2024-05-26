class SllForSearch
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

    public boolean search(int key)
    {
        node temp=head;
        while(temp!=null)
        {
            if(temp.data==key)
            {
                return true;
            }
            temp=temp.next;
        }
        return false;
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
        SllForSearch s=new SllForSearch();
        s.head= new node(11);
        node second=new node(12);
        node third=new node(13);
        node fourth=new node(14);
        s.head.next=second;
        second.next=third;
        third.next=fourth;
        System.out.println("Given singly linked list:");
        s.display();
        System.out.println("Search 11");
        
        if(s.search(11))
        {
            System.out.println("element found");
        }
        else{
            System.out.println("Element not found");
        }
        System.out.println("Search 1");
        if(s.search(1))
        {
            System.out.println("element found");
        }
        else{
            System.out.println("Element not found");
        }
        
    }
}