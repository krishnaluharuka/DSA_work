class arraystack
{
    int top=-1;
    int size=4;
    int a[]=new int[size];
   
    public void push(int x)
    {
        if(isFull())
        {
            System.out.println("Stack Overflow");
        }
        else
        {
            top++;
            a[top]=x;
        }
    }

    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack underflow");
            return -1;
        }
        else
        {
            int x=a[top];
            top--;
            return x;
        }
        
    }

    public boolean isEmpty()
    {
        if(top==-1)
        {
            return true;
        }
        else
        return false;
    }

    public boolean isFull()
    {
        if(top==size-1)
        {
            return true;
        }
        else
        return false;
    }

    public void display()
    {
        for(int i=top;i>=0;i--)
        {
            System.out.println(a[i]);
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        arraystack as=new arraystack();
        System.out.println("Stack if it is empty");
        as.pop();
        as.display();
        System.out.println("Stack after push operation");
        as.push(15);
        as.push(90);
        as.push(5);
        as.push(9);
        as.display();
        System.out.println("Stack if it is full");
        as.push(6);
        System.out.println();
        System.out.println("Stack after pop operation of two items");
        as.pop();
        as.pop();
        as.display();
    }
}