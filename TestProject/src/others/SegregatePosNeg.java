package others;

public class SegregatePosNeg {

	public static void main(String args[])
	{
		int[] a={1,2,3,-4,-5,6,7,-8};
		int pos=0, neg=0;
		boolean flag1=false,flag2=false;
		while(true)
		{
			if(a[pos]<0)
			{
				pos++;
				
			}
			else
				flag1=true;
			if(a[neg]>0)
			{
				neg++;
				
			}
			else
				flag2=true;
			
			if(flag1 && flag2)
			{
				int temp=a[neg];
				a[neg]=a[pos];
				a[pos]=temp;
				flag1=false;
				flag2=false;
			}
			if(pos==a.length || neg==a.length)
				break;
		}
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+",");
	}
}
