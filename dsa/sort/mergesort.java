class mergesort
{
    public void mergesort1(int A[],int L,int H)
    {
        if(L<H)
        {
            int mid=(L+H)/2;
            mergesort1(A,L,mid);
            mergesort1(A,mid+1,H);
            merge(A,L,H,mid);
        }
    }

    public void merge(int A[],int L,int H,int mid)
    {
        int i=L;
        int j=mid+1;
        int B[]=new int[A.length];
        for(int k=L;k<=H;k++)
        {
            if(i>mid)
            {
                B[k]=A[j];
                j++;
            }
            else if(j>H)
            {
                B[k]=A[i];
                i++;
            }
            else if(A[i]<A[j])
            {
                B[k]=A[i];
                i++;
            }
            else{
                B[k]=A[j];
                j++;
            }
        }
        for(int k=L;k<=H;k++)
        {
            A[k]=B[k];
        }
    }

    public void display(int A[])
    {
        for(int k=0;k<=A.length-1;k++)
        {
            System.out.print(A[k]+",");
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        int A[]={10,9,8,7,6,5,4,3,2,1};
        System.out.println("\nArray before sorting");
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+",");
        }
        System.out.println("\n\nArray after mergesort");
        mergesort m=new mergesort();
        m.mergesort1(A,0,A.length-1);
        m.display(A);
    }
}