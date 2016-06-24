package dynamicProgramming;

public class Fibonacci {

	public static void main(String args[])
	{
		System.out.println(fibonacci(7));
	}
	
	public static int fibonacci(int n)
	{
		int [] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=0;
		
		//default cases
		a[0]=0;
		a[1]=1;
		for(int i=2;i<n;i++)
			a[i]=a[i-1]+a[i-2];
		
		return a[n-1];
	}
}
