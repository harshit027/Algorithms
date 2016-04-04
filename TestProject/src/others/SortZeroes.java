package others;

public class SortZeroes {

	public static void main(String args[])
	{
		int [] a={0,5,0,6,0,7};
		int n1=-1;
		boolean firstZero=true;
		for(int i=0;i<a.length;i++)
		{
			if(firstZero)
			if(a[i]==0)
			{
				n1=i;
				firstZero=false;
				continue;
			}
			
			if(n1!=-1 && a[i]!=0)
			{
				int temp=a[n1];
				a[n1]=a[i];
				a[i]=temp;
				i=n1;
				n1=-1;
				firstZero=true;
			}
		}
		
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+",");
	}
	
}
