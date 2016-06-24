package others;

public class MultipliesArray {

	public static void main(String args[])
	{
		int a[]={1,2,3,4};
		int b[]=new int[4];
		int multiple=1;
		for(int i=0;i<a.length;i++)
		{
			multiple*=a[i];
		}
		for(int i=0; i<a.length;i++)
		{
			multiple=multiple/a[i];
			b[i]=multiple;
		}
		System.out.println(b);
	}
}
