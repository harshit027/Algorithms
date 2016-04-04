package crackingTheCoding;

public class PrintingParanthesis {
	public static void main(String args[])
	{
		char[] output=new char[6];
		printParanthesis(3, 3, output, 0);
	}
	public static void printParanthesis(int l, int r, char[] output, int count)
	{
		if(l==0 && r==0)
			System.out.println(output);
		if(l>0)
		{
			output[count]='(';
			printParanthesis(l-1,r,output,count+1);
		}
		if(r>l)
		{
			output[count]=')';
			printParanthesis(l,r-1,output,count+1);
		}
	}
}
