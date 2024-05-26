class insertionsort
{ 
    public void sort(int A[])
    {
        for(int j=1;j<A.length; j++)
        {
            int key=A[j];
            int i=j-1;
            while(i>=0 && key<A[i])
            {
                A[i+1]=A[i];
                i--;
            }
            A[i+1]=key;
        }
    }

    public void display(int A[])
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        int A[]={9,8,7,6,5,4,3,2,1};
        insertionsort is=new insertionsort();
        System.out.println("Array before sorting");
        is.display(A);
        System.out.println("Array after Insertion sort");
        is.sort(A);
        is.display(A);

    }
}