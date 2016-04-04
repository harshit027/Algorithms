package others;
//String to Long conversion

public class StringToLong 
{
	public static void main(String args[])
	{
		String string="0.123";
		StringToLong obj= new StringToLong();
		long number=obj.stringToLong(string);
		System.out.println(number); 
		
		string="00001230000";
		number=obj.stringToLong(string);
		System.out.println(number);
		
		string="-000123";
		number=obj.stringToLong(string);
		System.out.println(number);
		
		string="-123.456";
		number=obj.stringToLong(string);
		System.out.println(number);
		
		string="123";
		number=obj.stringToLong(string);
		System.out.println(number);
	}
	
	public long stringToLong(String s)
	{
		long number=0;
		boolean isNegative=false;
		int counter=0;
		char[] charArray= s.toCharArray();
		
		if(charArray[0]=='-')
		{
			isNegative=true;
			counter=1;
		}
		int asciiDifference=0;
		
		while(counter<charArray.length)
		{
			asciiDifference=charArray[counter]-'0';
			//Handling the characters which are not numbers
			if((asciiDifference<0 || asciiDifference>9) && charArray[counter]!='.')
			{
				throw new NumberFormatException("Character is not a Numerical Digit.");
			}
			//Handling the decimal point 
			if(charArray[counter]=='.')
			{
				break;
			}
			number=number*10;
			number=number+asciiDifference;
			counter++;
		}
		if(isNegative)
			number=number*-1;
		
		return number;
	}
}
