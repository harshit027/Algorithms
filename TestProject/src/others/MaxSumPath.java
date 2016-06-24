package others;

public class MaxSumPath {

	public static void main(String args[])
	{
		int a1[] = {2, 3, 7, 10, 12, 15, 30, 34};
        int a2[] = {1, 5, 7, 8, 10, 15, 16, 19};
        int sum=0,i=0,j=0;
        int temp1=0,temp2=0;
        while(true)
        {
        	if(a1[i] == a2[j])
        	{
        		sum+=Math.max(temp1, temp2)+a1[i];
        		temp1=temp2=0;
        	}
        	if(i<a1.length)
        	temp1+=a1[i++];
        	if(j<a2.length)
        	temp2+=a2[j++];
        	
        	if(i==a1.length && j==a2.length)
        	{
        		sum+=Math.max(temp1, temp2);
        		break;
        	}
        }
        
        System.out.println(sum);
	}
}
