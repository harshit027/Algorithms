package crackingTheCoding;

public class MissingElement {

	public static void main(String args[])
	{
		int [] a={1,2,3,5,6,7,8};
		int min=a[0], max=a[0],sum=0;;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
				min=a[i];
			if(a[i]>max)
				max=a[i];
			sum+=a[i];
		}
		System.out.println(min+","+max);
		int ap_sum=((min+max)*(a.length+1))/2;
		System.out.println(ap_sum-sum);
	}
}
