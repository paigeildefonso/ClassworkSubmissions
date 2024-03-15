
public class TraversalMethodsHomework 
{
	
	public static void main(String[] args) 
	{
		//create a new array passed with doubles
		double[] sameThree = {2.0, 8.8, 8.8, 8.8, 9.0, 3.1};
		//create a new method that is passed with double array
		checkSameThree (sameThree);
		//print statement to check if method works
		System.out.println(checkSameThree(sameThree));
		
		
		
		//create a new array passed with ints
		int[] allEven = {1, 6, 9};
		//create a new method that is passed with int array
		checkAllEven (allEven);
		//print statement to check if method works
		System.out.println(checkAllEven(allEven));
		
		
		
		//create a new method that is passed with int array
		checkAnyEven (allEven);
		//print statement to check if method works
		System.out.println(checkAnyEven(allEven));
		
		
		
		//create a new double array
		double [] sillyDouble = {3.1, 4.2, 5.0, 6.2, 6.9};
		//create a new method that is passed with double array
		averageArray (sillyDouble);
		//print statement to check if method works
		System.out.println ("the average would be "
				+ averageArray(sillyDouble));
		
		
		
		//create a new int array
		int[] highestNum = {2, 6, 3, 9, 1, 1, 4};
		//create a new method that is passed with int array
		figureHighestNum (highestNum);
		//print statement to check if method works
		System.out.println("the highest value is "
				+ figureHighestNum(highestNum));
	}
	
	/**
	 * Make a method that is passed an int 
	 * array and returns the highest 
	 * value in that array.
	 * @param arr
	 * @return
	 */
	private static int figureHighestNum(int[] arr) 
	{
		//create a traverser that is set to 0
		int traverser = 0;
		//set the max to the first element in array
		int max = arr[0];
		
		//for loop that moves the traverser through 
		//each element
		for (; traverser < arr.length; traverser++)
		{
			//if statement to run code when
			//the number that the traverser
			//is on is greater than the max
			if (arr[traverser] > max)
			{
				//if the traverser is greater
				//than the previous element,
				//it sets whatever number the 
				//traverser is on to become the new
				//max
				max = arr[traverser];
			}
		}
		//returns outcome after going through
		//the whole array
		return max;
		
	}

	/**
	 * Make a method that is passed an array of doubles 
	 * and returns a double array 
	 * consisting of their average. 
	 * @param sillyDouble
	 * @return 
	 */
	private static double averageArray(double[] arr) 
	{
		//create a traverser
		int traverser = 0;
		//set the sum equal to 0
		double sum = 0;
		
		//for loop that moves the traverser through each element
		for (; traverser <= arr.length - 1; traverser++)
		{
			//set a double equal to the number that the traverser is set to
			double add = arr [traverser];
			//add the double to the sum (which started at 0) so it 
			//continuously adds the next traverser element to find the sum
			sum += add;
		}
		//return the sum of all elements
		return sum / arr.length ;

		
	}

	/**
	 * Make a method that is passed an int array and 
	 * returns whether or not the array has any 
	 * even numbers in it.
	 * @param allEven
	 * @return
	 */
	private static boolean checkAnyEven(int[] arr) 
	{
		//create a traverser and set it to 0
		int traverser = 0;
		//set boolean to false
		boolean areEven = false;
		
		//for statement that uses traverser to traverse 
		//through whole array
		for (; traverser < arr.length; traverser++)
		{
			//if statement to check if number divided by
			//2 is 0
			if (arr[traverser] % 2 == 0)
			{
				//sets areEven to true if its even
				areEven = true;
			}
			
		}
		//returns outcome
		return areEven;
		
	}
	/**
	 * Make a method that is passed an int array and 
	 * returns whether or not the array has ALL
	 * even numbers in it.
	 * @param allEven
	 */
	private static boolean checkAllEven(int[] arr) 
	{
		//create a traverser and set it to 0
		int traverser = 0;
		//set boolean to false
		boolean ifEven = true;
		
		//for statement that uses traverser to traverse 
		//through whole array
		for (; traverser < arr.length; traverser++)
		{
			//if statement to check if number is odd
			if (arr[traverser] % 2 != 0)
			{
				//sets ifEven to false if 
				//number divided by 2
				//is not 0
				ifEven = false;
			}
			
		}
		//returns outcome
		return ifEven;
	}
	
	
	/**
	 * Make a method that is passed a double array and 
	 * returns whether or not three consecutive doubles 
	 * of the same value appear in the array.
	 * @param arr
	 * @return
	 */
	private static boolean checkSameThree(double[] arr) 
	{
		//create a traverser and set it to 0
		int traverser = 0;
		//set boolean to false
		boolean hasThree = false;
		
		//for statement that uses traverser to traverse through
		//whole array
		for (; traverser <= arr.length - 3; traverser++)
		{
			//if statement that checks each element
			if (arr[traverser] == arr[traverser + 1] && arr[traverser] == arr[traverser + 2]);
			{
				//set boolean to true when if statement calls
				//true
				hasThree = true;
			}
		}
		//return the boolean, whether if it's true or false
		return hasThree;		
	}

}
