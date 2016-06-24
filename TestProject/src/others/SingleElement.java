package others;
import java.util.HashMap;


public class SingleElement {

	public static void main(String args[])
	{
		HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
		int [] a= {1,2,1,2,1,2,3,4,5,4,5,4,5};
		for(int i=0;i<a.length;i++)
		{
			if(map.containsKey(a[i]))
				map.put(a[i], map.get(a[i])+1);
			else
				map.put(a[i], 1); 
		}
		
		System.out.println(map);
	}
}
