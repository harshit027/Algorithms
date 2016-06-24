package others;

public class KSmallestInIntervals {

	public static void main(String args[])
	{
		String str="abbcabbds";
		char[] arr=str.toCharArray();
		int i=0,j=0;
		boolean flag=true;
		if(arr.length%2==0)
		{
			i=arr.length/2-1;
			j=arr.length/2;
			while(i>=0 && j<arr.length)
			{
				if(arr[i]==arr[j])
				{
					i--;j++;
				}
				else
				{
					flag=false;	
					break;
				}
			}
		}
		else
		{
			i=arr.length/2-1;
			j=arr.length/2+1;
			while(i>=0 && j<arr.length)
			{
				if(arr[i]==arr[j])
				{
					i--;j++;
				}
				else
				{
					flag=false;		
					break;
				}
			}
		}
		if(flag)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
