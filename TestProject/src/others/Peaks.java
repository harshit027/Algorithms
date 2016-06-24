package others;

public class Peaks {
	public static void main(String args[])
	{
		int [] array={3,2,4,5,6,7,8};
		for(int i=0;i<array.length;i++)
		{
			if(i==0)
			{
				if(array[i]>array[i+1])
				{
					System.out.println(array[i]);
					return;
				}
			}
			else if(i==array.length-1)
			{
				if(array[i]>array[i-1])
				{
					System.out.println(array[i]);
					return;
				}
			}
			
			else
				if(array[i]>array[i-1] && array[i]>array[i+1])
			{
				System.out.println(array[i]);
				return;
			}
		}
	}
}
