class quicksort
{

    public void quicksorting(int A[],int p,int q)
    {
        if(p<q)
        {
            int j=partition(A,p,q);
            quicksorting(A,p,j-1);
            quicksorting(A,j+1,q);
        }
    }

    public int partition(int A[],int i,int j)
    {
        int L=i-1;
        int pivot=A[j];
       for(int k=i;k<=j;k++)
       {
        if(A[k]<pivot)
        {
            L++;
            swap(A,L,k);
        }
       }
            swap(A,L+1,j);
            return L+1;
    }

    public void swap(int A[],int i,int j)
    {
        int temp=A[i];
        A[i]=A[j];
        A[j]=temp;
    }


    

    public void display(int A[])
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+",");
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        int A[]={1,2,3,14,5,6,17,8,9,10};
        quicksort qs=new quicksort();
        System.out.println("Array before sorting");
        qs.display(A);
        System.out.println("Array after Quick Sort");
        qs.quicksorting(A,0,A.length-1);
        qs.display(A);
    }
}