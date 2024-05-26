class priorityqueue
{
    int rear=-1;
    int size=4;
    int array[]=new int[size];
    int currsize=0;
    int maxsize=size;

    public int findMin()
    {
        if(isEmpty())
        {
            return -1;
        }
        else
        {
            int min=0;
            for(int i=1;i<=currsize;i++)
            {
                if(array[i]<array[min])
                min=i;
            }
            return min;
        }
    }

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
        if(isEmpty())
        {
            System.out.println("Stack underflow");
            return -1;
        }
        else
        {
            int min=findMin();
            int x=array[min];
            for(int i=min;i<=rear;i++)
            {
                array[i]=array[i+1];
            }
            rear--;
            return x;
        }
    }

    public boolean isFull()
    {
        if(rear==maxsize-1)
        return true;
        else 
        return false;
    }

    public boolean isEmpty()
    {
        if(rear==-1)
        return true;
        else 
        return false;
    }

    public void display()
    {
        for(int i=0;i<=rear;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        priorityqueue q=new priorityqueue();
        System.out.println("If the queue is empty");
        q.dequeue();
        q.display();
        System.out.println("If 3 elements are inserted in the queue");
        q.enqueue(15);
        q.display();
        q.enqueue(10);
        q.display();
        q.enqueue(5);
        q.display();
        System.out.println();
        System.out.println("If a element is removed from the queue");
        q.dequeue();
        q.display();
        System.out.println();
        System.out.println("If 2 more elements are enqueued");
        q.enqueue(95);
        q.display();
        q.enqueue(85);
        q.display();
        System.out.println();
        System.out.println("If the stack is full and a element is inserted");
        q.enqueue(75);
        q.display();
        
    }
}