package crackingTheCoding;

import java.util.ArrayList;

public class CheckUnique {

	public static void main(String args[])
	{
		
		String str="abcde";
		ArrayList<Integer> list= new ArrayList<Integer>();
		for(int i : str.toCharArray())
		{
			if(!list.contains(i))
				list.add(i);
			else
				System.out.println("Not Unqiue Characters");
		}
	}
}
