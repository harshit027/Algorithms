package crackingTheCoding;

public class RemoveDuplicates {

	public static void main(String args[])
	{
		int[] a={1,1,1,1,2,2,2,3,3,4};
		int index=-1;
		int i=1,j=1;
		boolean firstOccurence=true;
		while(i<a.length)
		{
			if(a[i-1]==a[i])
				i++;
			else
			{
				a[j++]=a[i++];
			}
		}
		
		for(int k=0;k<a.length;k++)
			System.out.print(a[k]+",");
	}
}
