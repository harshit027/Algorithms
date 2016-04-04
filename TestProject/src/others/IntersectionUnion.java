package others;

public class IntersectionUnion {

	public static void main(String args[])
	{
		int[] a={1,2,3,4,5,9};
		int[] b={3,4,6,7,8,9};
		int i=0,j=0;
		while(true)
		{
			if(a[i]<b[j])
				i++;
			else if(a[i]>b[j])
				j++;
			else if(a[i]==b[j])
			{
				System.out.print(a[i]+",");
				i++;j++;
			}
			if(i==a.length || j==b.length)
				break;
		}
		System.out.println();
		i=0;j=0;
		while(true)
		{
			if(a[i]<b[j])
			{
				System.out.print(a[i]+",");
				i++;
			}
			else if(a[i]>b[j])
			{
				System.out.print(b[j]+",");
				j++;
			}
			else if(a[i]==b[j])
			{
				System.out.print(a[i]+",");
				i++;j++;
			}
			if(i==a.length && j==b.length)
				break;
		}
	}
}
