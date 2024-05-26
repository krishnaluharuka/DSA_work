class linearqueue
{
    int size=4;
    int currsize=0;
    int array[]=new int[size];
    int front=0;
    int rear=-1;

    public void enqueue(int x)
    {
        if(isFull())
        {
            System.out.println("Stack Overflow");
        }
        
        if(rear==size-1)
        {
            rear=-1;
        }
        
            rear++;
            array[rear]=x;
            currsize++;
    }

    public int dequeue()
    {
        int x=-1;
        if(isEmpty())
        {
            System.out.println("Stack underflow");
            return x;
        }
        else
        {
            x=array[front];
            front++;
            if(front==size)
            {
                front=0;
            }
            currsize--;
            return x;
        }
    }

    public boolean isFull()
    {
        if(currsize==size)
        return true;
        else 
        return false;
    }

    public boolean isEmpty()
    {
        if(currsize==0)
        return true;
        else 
        return false;
    }

    public void display()
    {
        for(int i=front;i<=rear;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        linearqueue q=new linearqueue();
        System.out.println("if the linear queue is empty");
        q.dequeue();
        q.display();
        System.out.println("if 4 elements are enqueued in the queue.");
        q.enqueue(5);
        q.display();
        q.enqueue(10);
        q.display();
        q.enqueue(15);
        q.display();
        q.enqueue(20);
        q.display();
        System.out.println("if the queue is full and 2 elements are enqueued");
        q.enqueue(5);
        q.display();
        q.enqueue(15);
        q.display();
        System.out.println("If an element is dequeued");
        q.dequeue();
        q.display();
    }
}