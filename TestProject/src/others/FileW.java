package others;
import java.io.*;
import java.util.*;

class FileW
{
	public static void main(String args[])
	{
		try
		{
			PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter("F:\\MyStuffs\\MS\\Network Security\\MyTestFile1.txt")));
			System.out.println("Write some text : ");
			Scanner sobj=new Scanner(System.in);
			String a=sobj.nextLine();
			for(int i=0;i<10;i++)
			out.println(i);
			out.close();
		}
		catch(Exception e)
		{
		}
	}
}
