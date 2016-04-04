package others;

public class IntervalOverlap {
	public static void main(String arg[])
	{
		double [][] intervals= {{3,4},{3.5,4.5},{4,7},{6,9}};
		double max=intervals[0][1], min=intervals[0][0];
		for(int i=1;i<intervals.length;i++)
		{
			if(min>intervals[i][0])
				min=intervals[i][0];
			if(max<intervals[i][1])
				max=intervals[i][1];
		}
		int maxOverlaps=0;
		for(double i=min;i<=max;i++)
		{
			int overlaps=0;
			for(int j=1;j<intervals.length;j++)
			{
				if(i>=min && i<=max)
					overlaps++;
			}
			if(overlaps>maxOverlaps)
				maxOverlaps=overlaps;
		}
		System.out.println("Maximum number of overlaps: "+maxOverlaps);
	}
	
}
