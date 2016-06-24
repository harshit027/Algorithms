package algos;

import java.util.ArrayList;

public class PigeonSort {
	public static void main(String args[]){
		int[] a={1,3,4,1,1,2,3,3};
		sort(a);
		
	}
	
	public static void sort(int []a){
		int max=0, min=100;
		for(int i=0;i<a.length;i++){
			if(a[i]>=max)
				max=a[i];
			if(a[i]<=min)
				min=a[i];
		}
		int range = max-min+1;
		ArrayList holes [] = new ArrayList[6];
		for(int i=0;i<range;i++){
			holes[i]= new ArrayList<Integer>();
		}
		for(int i=0;i<a.length;i++){
			holes[a[i]-min].add(a[i]);
		}
		
		for(int i=0;i<range;i++){
			for(int j=0;j<holes[i].size();j++)
				System.out.print(holes[i].get(j)+",");
		}
	}	
}
