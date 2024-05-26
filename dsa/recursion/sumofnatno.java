class sumofnatno
{
    public static void main(String[] args)
    {
        sumofnatno s=new sumofnatno();
        int n=5;
        int result=s.sum(n);
        System.out.println("The sum of natural numbers is"+result);
    }
    int sum(int n)
    {
        if(n>1)
        {
            return n+sum(n-1);
        }
        else 
        return 1;
    } 
}