package others;

public class UniqueChars {

	public static void main(String args[])
	{
		char [] arr={'a','b','c','d','e','b'};
		System.out.println(hasUniqueChars(arr));
	}
	public static boolean hasUniqueChars(char[] arr)
	{
		boolean[] temp=new boolean[26];
		boolean flag=true;
		for(int i=0;i<temp.length;i++)
			temp[i]=false;
		for(int i=0;i<arr.length;i++)
		{
			if(temp[arr[i]-97]==false)
				temp[arr[i]-97]=true;
			else
			{
				flag=false;
				break;
			}
		}
		return flag;
	}
}
