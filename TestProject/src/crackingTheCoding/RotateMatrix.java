package crackingTheCoding;

public class RotateMatrix {

	public static void main(String args[])
	{
		int[][] arr={{3,1,2},{5,6,7},{4,9,8}};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
				System.out.print(arr[i][j]);
			System.out.println();
		}
		rotate(arr);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
				System.out.print(arr[i][j]);
			System.out.println();
		}
		
				
	}
	public static void rotate(int [][] arr)
	{
		for(int i=0;i< arr.length/2;i++)
		{
			int first=i;
			int last=arr.length-1-i;
			for(int j=first;j<last;j++)
			{
				int offset=j-first;
				int top=arr[first][j];
				arr[first][j]=arr[last-offset][first];
				arr[last-offset][first]=arr[last][last-offset];
				arr[last][last-offset]=arr[j][last];
				arr[j][last]=top;
			}
		}
			
	}
}
