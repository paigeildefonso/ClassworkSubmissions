/**
 * this class uses different code to roll dice
 * and get different numbers
 */
public class DiceRoller 
{

	public static void main(String[] args) 
	{
	
		//make a line that prints an integer between 1 and 17 inclusive
		int i = 1;
		while (i<= 200)
		{
		System.out.println( (int)( Math.random() * 17 + 1) );
		i++;
		}
		
		//a method that counts how many times the 
		//char shows up in the String and returns 
		//that number
		String name1 = "hakuna matata";
		char char1 = 'a';
		
		//cast as an int
		//create actual countChars method
		int n = countChars(name1, char1);
		
		//actual print statement
		System.out.println( "number of character is " + n );
		
		
	}
/**
 * this method uses a for loop to get get the amount of times
 * a character shows up in my string
 * 
 * @param name1 my string
 * @param char1 the character that the code is looking to see 
 * 			how many times it shows up
 * @return
 */
	private static int countChars(String name1, char char1) 
	{
		int x = 0;
		
		for (int i = 0; i < name1.length(); i++)
		{
			if (name1.charAt(i) == char1)
			{
				x++;
			}
		}
		return x;
	}

}
