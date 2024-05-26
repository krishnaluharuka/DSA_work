class quadraticprobing
{
    int hashtable[];
    int m;
    int n;
    quadraticprobing(int size)
    {
        m=size;
        hashtable=new int[m];
        n=0;
    }

    int hashfunction(int key)
    {
        return key%m;
    }

    public void insert(int key)
    {
        if(n==m)
        {
            System.out.println("Hash table is full");
            return;
        }
        int hash=hashfunction(key);
        int i=0;
        while(hashtable[hash]!=0)
        {
            i++;
            System.out.println("collision occured");
            hash=(hash+i*i)%m;
        }
        hashtable[hash]=key;
        System.out.println(key+"inserted at position"+hash);
        n++;
    }
    public static void main(String args[])
    {
        quadraticprobing qp=new quadraticprobing(10);
        qp.insert(5);
        qp.insert(15);
        qp.insert(25);
        qp.insert(1);

    }
}