class selectionsort
{
    void sorting(int A[])
    {
        for(int i=0;i<A.length;i++)
        {
            int min=i;
            for(int j=i+1;j<A.length;j++)
            {
                if(A[j]<A[min])
                {
                    min=j;
                }
            }
            int temp=A[i];
            A[i]=A[min];
            A[min]=temp;
        }
    }

    void display(int A[])
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+",");
        }
    }
    public static void main(String args[])
    {
        int A[]={10,9,8,7,6,5,4,3,2,1};
        selectionsort s=new selectionsort();
        System.out.println("Array before sorting");
        s.display(A);
        System.out.println("Array after Selection sorting");
        s.sorting(A);
        s.display(A);
    }
}