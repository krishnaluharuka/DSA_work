class power
{
    public static void main(String[] args)
    {
        int base=5;
        int exp=3;
        int result=pow(base,exp);
        System.out.println(base+" to the power "+exp+" is "+result);
    }
    static int pow(int b,int e)
    {
        if(e==0)
        {
            return 1;
        }
        else
        {
            return b*pow(b,e-1);
        }
    }
}