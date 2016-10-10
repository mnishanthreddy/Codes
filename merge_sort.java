import java.util.*;
class Extra
{
	void merge(int[] A,int[] L,int[] R)
	{
		int l=L.length;
		int r=R.length;
		int i=0,j=0,k=0;
		while(i<l&&j<r)
		{
			if(L[i]>R[j]){
				A[k++]=L[i++];
			}
			else
				A[k++]=R[j++];
		}
		while(i<l)
		{
			A[k++]=L[i++];
		}
		while(j<r)
		{
			A[k++]=R[j++];
		}
	}
	int[] mergeSort(int[] a)
	{
		int len=a.length;
		if(len<2)
			return a;
		int mid=len/2;
		int[] left=new int[mid];
		int[] right=new int[len-mid];
		for(int i=0;i<mid;i++)
		{
			left[i]=a[i];
		}
		for(int i=0;i<len-mid;i++)
		{
			right[i]=a[i+mid];
		}
		mergeSort(left);
		mergeSort(right);
		merge(a,left,right);
		return a;
	}
}
class TestClass {
    public static void main(String args[] ) throws Exception 
    {
        Scanner s=new Scanner(System.in);
    	int test_cases = s.nextInt();
    	Extra A=new Extra();
    	int i;
    	for(int test_case=0;test_case<test_cases;test_case++)
    	{
    		int n=s.nextInt();
    		int[] a=new int[n];
    		for(i=0;i<n;i++)
    		{
    			a[i]=s.nextInt();
    		}
    		A.mergeSort(a);
    		for(i=0;i<a.length;i++)
    		{
    			System.out.print(a[i]+" ");
    		}
    		System.out.println("");
    	}
    }
}
