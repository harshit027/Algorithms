package crackingTheCoding;

public class StringCompression {

	public static void main(String args[])
	{
		String str="hellooob";
		System.out.println(compress(str));
	}
	public static String compress(String str)
	{
		char[] arr=str.toCharArray();
		StringBuffer sBuf=new StringBuffer();
		int count=1;
		int i;
		for(i=1;i<arr.length;i++)
		{
			if(arr[i-1]==arr[i])
				count++;
			else
			{
				sBuf.append(arr[i-1]+""+(count));
				count=1;
			}
		}
		sBuf.append(arr[i-1]+""+(count));
		return sBuf.toString();
	}
}
