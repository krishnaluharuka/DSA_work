class fibonacci
{
    public static void main(String[] args)
    {
        int n=5;
        int result=fibo(n);
        System.out.println("The "+n+"th term of fibonacci series is "+result);
    }
    static int fibo(int n)
    {
        if(n==0)
        return 0;
        else if(n==1)
        return 1;
        else
        return fibo(n-1)+fibo(n-2);
    }
}