class toh
{
    public static void main(String[] args)
    {
        toh t=new toh();
        int n=3;
        char a='A';
        char b='B';
        char c='C';
        t.toh1(n,a,b,c);
    }
    void toh1(int n,char a,char b,char c)
    {
        if(n>=1)
        {
            toh1(n-1,a,c,b);
            System.out.println("Move"+n+"from"+a+"to"+c);
            toh1(n-1,b,a,c);
        }
    }

}