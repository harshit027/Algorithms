package others;
import java.io.BufferedReader;
import java.io.FileReader;


public class FileRead {

	public static void main(String args[])
	{
		
		try{
			BufferedReader br = new BufferedReader(new FileReader("F:\\MyStuffs\\MS\\Operating System\\process.txt"));
	        StringBuilder sb = new StringBuilder();
	        String line = br.readLine();

	        while (line != null) {
	            String s=line;
	            
	            System.out.println(line+";");
	            line=br.readLine();
	        }
	        String everything = sb.toString();
		}
		catch (Exception ex)
		{
			System.out.println(ex.toString());
		}
			
	    }
	}

