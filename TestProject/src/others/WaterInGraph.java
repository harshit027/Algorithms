package others;

public class WaterInGraph {

	public static void main(String args[])
	{
		int b1=0,b2=1;
		int [] a={3,2,1,5,7};
		int water=0;
		
		while(b2<a.length)
		{
			boolean start=false;
			boolean stop=false;
			if(a[b2]<a[b1])
			{
				start=true;
			}
			if(a[b2]>a[b1])
			{
				stop=true;
			}
			if(start)
			{
				water+=a[b1]-a[b2];
				b2++;
			}
			
			if(stop)
			{
				System.out.println("Water = "+water);
				stop=false;
				start=false;
				water=0;
				b2++;
			}
	
		}
	}
}
