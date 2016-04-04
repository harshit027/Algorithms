package others;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class NumbersFrquencyWise {

	public static void main(String args[])
	{
		int [] a={1,2,3,1,4,5,6,2,3,7,5,6};
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		
		for(int i=0;i<a.length;i++)
		{
				if(map.containsKey(a[i]+""))
				{
					int value=map.get(a[i]+"");
					map.put(a[i]+"", value+1);
				}
				else
					map.put(a[i]+"", 1);
		}
		System.out.println(map);
		
		System.out.println(sortByValue(map));
	}
	
	public static Map sortByValue(Map unsortedMap)
	{
		ValueComparator vc= new ValueComparator(unsortedMap);
		Map map=new TreeMap(vc);
		return map;
	}
	
}
class ValueComparator implements Comparator
{
	Map<String,Integer> map;
	
	ValueComparator(Map<String,Integer> map)
	{
		this.map=map;
	}
	public int compare(Object a, Object b)
	{
		
		if(map.get((String)a)>map.get((String)b))
			return -1;
		else
			return 1;
	}
}
