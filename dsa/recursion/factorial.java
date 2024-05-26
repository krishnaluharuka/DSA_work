class factorial
{
    public static void main(String[] args)
    {
        int n=5;
        int result=fact(n);
        System.out.println("The factorial of "+n+" is "+result);
    }
    static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
            return n*fact(n-1);
        }
    }
}