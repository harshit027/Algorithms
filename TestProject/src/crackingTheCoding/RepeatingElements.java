package crackingTheCoding;

public class RepeatingElements {

	public static void main(String args[])
	{
		int[] a={1,7,7,1,3,5,6,6};
		for(int i=0;i<a.length;i++)
		{
			if(a[Math.abs(a[i])]>0)
				a[Math.abs(a[i])] = -a[Math.abs(a[i])];
			else
				System.out.println(Math.abs(a[i]));
		}
	}
}
