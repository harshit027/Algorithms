package crackingTheCoding;

public class RunLengthEncoding {

	public static void main(String args[])
	{
		String s="wwwwaaadexxxxxx";
		StringBuffer output=new StringBuffer();
		char[] a=s.toCharArray();
		output.append(a[0]);
		int count=1;
		for(int i=1;i<a.length;i++)
		{
			if(a[i]==a[i-1])
			{
				count++;
			}
			else
			{
				output.append(count+"");
				output.append(a[i]);
				count=1;
			}
		}
		output.append(count);
		
		System.out.println(output);
	}
}
