package crackingTheCoding;

public class SearchElement {

	public static void main(String args[])
	{
		int[][] a={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int x=10;
		int i=-1;
		for(int m=0;m<a.length;m++)
		{
			if(x>a[m][0] && x<a[m][a.length-1])
			{
				i=m;
				break;
			}
		}
		int j=-1;
		for(int m=0;m<a.length;m++)
		{
			if(x>a[0][m] && x<a[a.length-1][m])
			{
				j=m;
				break;
			}
		}
		
		System.out.println(i+","+j);
	}
}
