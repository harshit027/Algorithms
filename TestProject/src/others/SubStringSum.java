package others;

public class SubStringSum {

	public static void main(String args[])
	{
		String str="1538023";
		
		int window=0;
		if(str.length()%2==0)
			window=str.length();
		else
			window=str.length()-1;
		
		for(int i=0;i<str.length();i++)
		{
			if(i+window==str.length())
			{
				i=0;
				window-=2;
			}
			String temp=str.substring(i, window);
			char[] a=temp.toCharArray();
			
			if(isSolutionString(a)!=null)
			{
				break;
			}
			
		}
		
		
	}
	public static String isSolutionString(char[] a)
	{
		
		int sum=0;
		String str="";
		for(int i=0;i<a.length;i++)
		{
			if(i>a.length/2-1)
			{
				sum-=Integer.parseInt(a[i]+"");
				str+=a[i];
			}
			else
			{
				sum+=Integer.parseInt(a[i]+"");
				str+=a[i];
			}
		}
		if(sum==0)
			return str;
		else
			return null;
	}
}
