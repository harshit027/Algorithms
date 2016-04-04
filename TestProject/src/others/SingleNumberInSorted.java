package others;

public class SingleNumberInSorted {

	public static void main(String[] args)
	{
		int[] arr={1,1,3,3,5,5,6,6,8};
		getSingle(arr,0,arr.length-1);
	}
	public static void getSingle(int a[],int low, int high)
	{
		 if(low>high)
		 {
			 return;
		 }
		 
		 if(low==high)
		 {
			 System.out.println(a[low]);
			 return;
		 }
		 int mid = low+(high-low)/2;
		 if (mid%2 == 0)
		    {
		        if (a[mid] == a[mid+1])
		            getSingle(a, mid+2, high);
		        else
		            getSingle(a, low, mid);
		    }
		    else  // If mid is odd
		    {
		        if (a[mid] == a[mid-1])
		            getSingle(a, mid-2, high);
		        else
		            getSingle(a, low, mid);
		    }
		 return;
	}
}
