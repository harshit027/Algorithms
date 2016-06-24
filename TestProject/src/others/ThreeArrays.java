package others;
import java.util.Arrays;


public class ThreeArrays {

	public static void main(String args[])
	{
		int a1[]={2,4,6,8,10,11,34,56,78,100};
		int a2[]={1,2,5,7,10,34,45,67,89,110};
		int a3[]={2,5,9,10,11,21,33,59,98,100,200};
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		Arrays.sort(a3);
		boolean flag=false;
		for(int i=0;i<a3.length;i++)
		{
			for(int j=0,k=0;k<a2.length && j<a1.length;)
			{
				if(a1[j]+a2[k]==a3[i])
				{
					flag=true;
					break;
				}
				if(flag)
					break;
				
			}
		}
	}
}
