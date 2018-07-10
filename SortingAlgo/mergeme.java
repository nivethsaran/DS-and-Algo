package merge_sort;
import java.util.*;
public class mergeme {
public static void merge(int arr[],int l,int m,int r)
{

	int n1=m-l+1;
	int n2=r-m;
	
	int L[]=new int [n1];
	int R[]=new int [n2];
	for(int t=0;t<n1;t++)
		L[t]=arr[l+t];
	for(int h=0;h<n2;h++)
		R[h]=arr[m+1+h];


	int i=0;
	int j=0;
	int k=l;
	while(i<n1&&j<n2)
	{
		if(L[i]<=R[j])
	{
		arr[k]=L[i];
		i++;
		
		}
		else
		{
			arr[k]=R[j];
			j++;
			
			}
		
		k++;
		}
	while (i < n1)
	    {
	        arr[k] = L[i];
	        i++;
	        k++;
	    }

	    /* Copy remaining elements of R[] if any */
	    while (j < n2)
	    {
	        arr[k] = R[j];
	        j++;
	        k++;
	    }

	




}
	
	
	
	
	
	public static void sort(int arr[],int l,int r)
	{
		if(l<r)
		{
			int m=(l+r)/2;
		sort(arr,l,m);
		sort(arr,m+1,r);
		
		merge(arr,l,m,r);	
			
		}
	}
	public static void main(String[] args) {
		int n;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
			
		}
		sort(arr,0,n-1);
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
			
		}
		
	}

}
