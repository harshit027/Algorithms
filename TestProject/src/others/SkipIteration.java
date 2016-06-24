package others;


public class SkipIteration {

	public static void main(String args[])
	{
		for(int i=1;i<10;i++)
		{
			try{
				if(i==4)
				{
					Exception ex = new Exception();
					throw ex;
				}
				
			 System.out.println(i);
			}
			catch(Exception e)
			{
				continue;
			}
		}
	}
}
