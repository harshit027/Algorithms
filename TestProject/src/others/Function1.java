package others;

public class Function1 {

	public static void  main(String args[])
	{
		int n=7;
		double d=n,s=n;
		while(d!=0)
		{
			d=Math.floor(d/2);
			s-=d;
		}
		
		System.out.println(s);
	}
}
