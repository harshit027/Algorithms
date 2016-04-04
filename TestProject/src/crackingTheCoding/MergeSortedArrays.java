package crackingTheCoding;

public class MergeSortedArrays {

	public static void main(String args[])
	{
		int[] a=new int[7];
		a[0]=1;a[1]=4;a[2]=7;a[3]=10;
		int[] b={2,5,8};
		
		int k=a.length-1;
		int i=3;
		int j=b.length-1;
		
		while(i>=0 && j>=0)
		{
			if(a[i]>b[j])
				a[k--]=a[i--];
			else
				a[k--]=b[j--];
		}
		
		
		
		for(int n=0;n<a.length;n++)
			System.out.print(a[n]+",");
	}
}
