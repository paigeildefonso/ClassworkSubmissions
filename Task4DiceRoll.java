
import java.util.Scanner;

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
		
		
		
		
		
		
		//make pretty
		System.out.println("give me something consisting of a number,"
				+ " then the letter 'd', then another number");
		
		//make a code that passes a string consisting of numbers
		Scanner numTake = new Scanner (System.in);
		
		String diceRoll= numTake.nextLine();
		
		int mid = diceRoll.indexOf('d');
		
		//take in the first part of the string that the user inputs
		String left = diceRoll.substring (0, diceRoll.indexOf('d'));
		
		//take in the second part of the string that the user inputs
		String right = diceRoll.substring(diceRoll.indexOf('d') + 1, 
				diceRoll.length());
		
		//create a method
		diceRoll(left, right);
		
		//close the method so my computer doesn't blow up
		numTake.close();	
			
	}



/**
 * This method should print out the number before the d 
 * and the number after the d respectively and point them
 * out as the first and second number. 
 * 
 * it will also print out the sum of the 2 numbers
 * 
 * @param input1 the number before the d
 * @param input2 the number after the d
 */
private static void diceRoll(String left, String right) 
{
	//print statement that prints out the number before the d and after the d
	System.out.println("the first number is " + left + " and the "
			+ "second number is " + right);
	
	//turn the string before the d into an int
	int x = Integer.valueOf(left);
			
	//turn the string after the d into an int
	int y = Integer.valueOf(right);
	
	//create an int that has the value of the sum of the first string 
	// and second string
	// int sumNums = x + y;
	
	//the print statement to print out the sum of the 2 strings
	//System.out.println("the sum of these two numbers are " + sumNums);
	
	rollDice(x,y);
	
}





/**
 * this method will return a number based on how many 
 * and what kind of dice are rolled
 * @param x the amount of dice that are rolled
 * @param y the amount of sides the dice have
 */
private static void rollDice(int x, int y) 
{
	//make an int
	int w = 0;
	
	//make a for loop to roll the dice a certain amount of times
	for (int i= 0; i <= x; i++)
	{
		//set an int to make the dice roll a random number
		// from 0 to whatever number of sides the user gives
		int nummy = ((int)(Math.random() * y + 1));
		
		//add the random number to the amount of dice
		//this will keep repeating
		w += nummy;
		
	}
	//print statement
	System.out.println("you just rolled a total of " + w);

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
