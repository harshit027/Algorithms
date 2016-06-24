package others;
import java.util.Arrays;


public class PairSum {

	public static void main(String args[])
	{
		int [] a={1,3,9,8,2};
		int sum=10;
		boolean[] aux=new boolean[max(a)+1];
		for(int i=0;i<aux.length;i++)
			aux[i]=false;
		
		for(int i=0;i<a.length;i++)
		{
			int temp=sum-a[i];
			if(temp>0 && aux[temp])
				System.out.println(temp+","+a[i]);
			
			aux[a[i]]=true;
		}
	}
	
	public static int max(int []a)
	{
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		
		return max;
	}
}
