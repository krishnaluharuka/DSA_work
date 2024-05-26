import java.util.Hashtable;

class linearprobing
{
    int hashtable[];
    int m;
    int n;
    public linearprobing(int size)
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
        while(hashtable[hash]!=0)
        {
            System.out.println("\ncollision occured");
            hash=(hash+1)%m;
        }
        hashtable[hash]=key;
        System.out.println(key+"inserted at position"+hash);
        n++;
    }
    public static void main(String args[])
    {
        linearprobing lp=new linearprobing(10);
        lp.insert(5);
        lp.insert(12);
        lp.insert(15);

    }
}