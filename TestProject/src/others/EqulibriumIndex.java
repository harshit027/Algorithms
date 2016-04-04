package others;
import java.util.Arrays;


public class EqulibriumIndex {

	public static void main(String args[])
	{
		int [] a= {1,2,3,4,5,2,3,1};
		
		System.out.println(getEqulibriumIndex(a));
	}
	public static int getEqulibriumIndex(int a[])
	{
		int eIndex=-1;
		
		if(a.length==0)
		{
			System.out.println("Array Empty");
			return eIndex;
		}
		if(a.length==1)
		{
			return 0;
		}
		Arrays.sort(a);
		int total_sum=0;
		for(int i=0;i<a.length;i++)
		{
			total_sum+=a[i];
		}
		int left_sum=0;
		for(int i=0;i<a.length;i++)
		{
			left_sum+=a[i];
			if((2*left_sum-total_sum)==0)
			{
				eIndex=i;
				break;
			}
		}
		return eIndex;
	}
}
