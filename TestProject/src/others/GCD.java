package others;

public class GCD {

	public static void main(String args[])
	{
		System.out.println(gcd(9,6));
	}
	
	public static int gcd(int x , int y)
	{
		
		return y==0?x:gcd(y,x%y);
	}
}
