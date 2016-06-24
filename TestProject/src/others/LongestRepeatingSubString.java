package others;
import java.util.ArrayList;


public class LongestRepeatingSubString {

	public static void main(String args[])
	{
		String str="abcdpqrabcdmno";
		String lis="";
		
		int window=str.length()-1;
		ArrayList<String> list= new ArrayList<String>();
		boolean flag=false;
		for(int i=0;i<str.length()-1;i++)
		{
			if(flag)
			{
				i=0;
				window--;
				list= new ArrayList<String>();
				flag=false;
			}
			if(i+window<=str.length())
			{
				String substring=str.substring(i, i+window);
				if(!list.contains(substring))
					list.add(substring);
				else
				{
					lis=substring;
					break;
				}
			}
			else
			{
				flag=true;
				
			}
			
		}
		System.out.println("Longest Repeating Substring : "+lis);
	}
}
