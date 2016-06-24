package others;
import java.util.ArrayList;


public class PowerSet {
	public static void main(String args[])
	{
		int array[]={1,2,3};
		int n=array.length;
		int total=1<<n;
		System.out.println(total);
		for ( int i = 0; i < total; i++ ) 
		{ 
			for ( int j = 0; j < n; j++) 
			{ 
				if ( ((i >> j) & 1)!=0 ) 
					System.out.print(array[j]);; 
			} 
			System.out.println();; 
		}

	}
}
