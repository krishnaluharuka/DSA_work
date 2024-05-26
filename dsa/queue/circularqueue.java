class circularqueue
{
    int size=4;
    int front=-1;
    int rear=-1;
    int array[]=new int[size];

    public void enqueue(int x)
    {
        if(isFull())
        {
            System.out.println("QUEUE OVERFLOW");
        }
        if(front==-1)
        front=0;
        rear=(rear+1)%size;
        array[rear]=x;
    }

    public int dequeue()
    {
        if(isEmpty())
        {
            System.out.println("QUEUE UNDERFLOW");
            return -1;
        }
        else
        {
            int x=array[front];
            if(front==rear)
            {
                front=-1;
                rear=-1;
            }
            else
            {
                front=(front+1)%size;
            }
            return x;
        }
    }

    public boolean isFull()
    {
        if(front==0 && rear==size-1)
        return true;
        if(front==rear+1)
        return true;
        else 
        return false;
    }

    public boolean isEmpty()
    {
        if(front==-1)
        return true;
        else 
        return false;
    }

    public void display()
    {
        if(isEmpty())
        {
            System.out.println("queue underflow");
        }
        else
        {
            if(front==rear)
            {
            System.out.println(array[front]);
            }
            else
            { 
                for(int i=front;i!=rear;i=(i+1)%size)
                {
                    System.out.print(array[i]+" ");
                }
                System.out.println(array[rear]);
            }
        }
    }
    

    public static void main(String args[])
    {
        circularqueue q=new circularqueue();
        System.out.println("If the queue is empty");
        q.dequeue();
        System.out.println("If 2 elements are enqueud");
        q.enqueue(5);
        q.display();
        q.enqueue(10);
        q.display();
        System.out.println("if a element is dequeue");
        q.dequeue();
        q.display();
        System.out.println("if three element is enqueue");
        q.enqueue(35);
        q.display();
        q.enqueue(45);
        q.display();
        q.enqueue(55);
        q.display();
        System.out.println("If 1 element is enqueued to the queue");
        q.enqueue(56);
        q.display();
    }
}