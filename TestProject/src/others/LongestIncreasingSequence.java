package others;
import java.util.ArrayList;


public class LongestIncreasingSequence {
	static int max=0;
	static ArrayList<String> globalVisited= new ArrayList<String>();
	public static void main(String[] args) { 
		int[][] grid = {{1,2,3,4}, 
				{12,13,14,5},
				{11,16,15,6},
				{10,9,8,7}};
		LongestIncreasingSequence obj= new LongestIncreasingSequence();
		System.out.println("Length of longest subsequence = "+obj.longestSequence(grid)); 
	} 
	public int longestSequence(int[][] grid) { 
		
		for(int i=0;i<grid.length && globalVisited.size()<(grid.length*grid[0].length);i++)
		{
			System.out.println(i);
			for(int j=0;j<grid[0].length;j++)
			{
				if(!globalVisited.contains(i+","+j))
				{
					ArrayList<String> visited= new ArrayList<String>();
					int counter=0;
					visited.add(i+","+j);
					globalVisited.add(i+","+j);
					move(i,j,grid,visited);
				}
			}
		}
		return max; 
	}

	public int move(int x, int y, int [][]grid,ArrayList<String> visited)
	{
		if(x<grid.length-1)
			if((grid[x+1][y]>=grid[x][y]) && !visited.contains((x+1)+","+y)){
				visited.add((x+1)+","+y);
				if(!globalVisited.contains((x+1)+","+y)) 
					globalVisited.add((x+1)+","+y);
				move(x+1,y, grid,visited);
			}
		if(x>0)
			if((grid[x-1][y]>=grid[x][y]) && !visited.contains((x-1)+","+y)){
				visited.add((x-1)+","+y);    	
				if(!globalVisited.contains((x-1)+","+y)) 
					globalVisited.add((x-1)+","+y);
				move(x-1,y,grid,visited);

			}
		if(y<grid[0].length-1)
			if((grid[x][y+1]>=grid[x][y]) && !visited.contains(x+","+(y+1))){
				visited.add(x+","+(y+1));
				if(!globalVisited.contains(x+","+(y+1))) 
					globalVisited.add(x+","+(y+1));
				move(x,y+1,grid,visited);	
			}
		if(y>0)
			if((grid[x][y-1]>=grid[x][y]) && !visited.contains(x+","+(y-1))){
				visited.add(x+","+(y-1));
				if(!globalVisited.contains(x+","+(y-1))) 
					globalVisited.add(x+","+(y-1));
				move(x,y-1,grid,visited);
			}
		if(x<grid.length-1 && y<grid[0].length-1)
			if((grid[x+1][y+1]>=grid[x][y]) && !visited.contains((x+1)+","+(y+1))){
				visited.add((x+1)+","+(y+1));
				if(!globalVisited.contains((x+1)+","+(y+1))) 
					globalVisited.add((x+1)+","+(y+1));
				move(x+1,y+1,grid,visited);
			} 
		if(x>0 && y>0)
			if((grid[x-1][y-1]>=grid[x][y]) && !visited.contains((x-1)+","+(y-1))){
				visited.add((x-1)+","+(y-1));
				if(!globalVisited.contains((x-1)+","+(y-1))) 
					globalVisited.add((x-1)+","+(y-1));
				move(x-1,y-1,grid,visited);
			}
		if(x<grid.length-1 && y>0)
			if((grid[x+1][y-1]>=grid[x][y]) && !visited.contains((x+1)+","+(y-1))){
				visited.add((x+1)+","+(y-1));
				if(!globalVisited.contains((x+1)+","+(y-1))) 
					globalVisited.add((x+1)+","+(y-1));
				move(x+1,y-1,grid,visited);
			} 
		if(x>0 && y<grid[0].length-1)
			if((grid[x-1][y+1]>=grid[x][y]) && !visited.contains((x-1)+","+(y+1))){
				visited.add((x-1)+","+(y+1));
				if(!globalVisited.contains((x-1)+","+(y+1))) 
					globalVisited.add((x-1)+","+(y+1));
				move(x-1,y+1,grid,visited);
			}
		if(visited.size()>max)
			max=visited.size();
		visited.remove(visited.size()-1);
		return max;
	}
}
