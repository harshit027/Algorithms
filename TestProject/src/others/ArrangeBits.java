package others;
public class ArrangeBits
{
	public static void main(String args[])
	{
		int num[]={1,1,1,1,0,0,0,0};
		boolean invalidEven=false, invalidOdd=false;
		for(int even=0,odd=1;even<num.length && odd<num.length; )
		{

			if(num[even]==1)
			even+=2;
			else
			invalidEven=true;
			if(num[odd]==0)
			odd+=2;
			else
			invalidOdd=true;

			if(invalidEven && invalidOdd)
			{
				int temp;
				temp=num[odd];
				num[odd]=num[even];
				num[even]=temp;
				invalidEven=false;
				invalidOdd=false;
			}
		}
		for(int i=0;i<num.length;i++)
		System.out.print(num[i]+",");
	}
}