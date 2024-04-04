
public class BubbleSorter 
{

	public static void main(String[] args) 
	{
		//create a method to make an
		//array with random numbers
		makeRandom();
		
		//create a method that is passed with
		//the array with random numbers
		bubbleSort(makeRandom());
		
		//create a print method to print out
		//the array after bubbleSort
		//makes the array in numerical order
		printArr (bubbleSort(makeRandom()));
		

	}

	/**
	 * this method prints the array after it was
	 * sorted into numerical order
	 * @param arr
	 */
	public static void printArr(int[] arr) 
	{
		//create a traverser
		int i;
		//for loop to make the traverser go through every
		//element in the array until it reaches the
		//last element
		for (i = 0; i <= arr.length -1; i++)
		{
			//print out the element of the array that
			//i is on
			System.out.println( arr[i] );
			

		}
		
	}


	/**
	 * this method uses bubble sort to 
	 * put an array in numerical order
	 * @param arr
	 */
	private static int[] bubbleSort(int[] arr) 
	{
		//for loop that increments i throughout the
		//array
		for (int i = 0; i < arr.length-1; i++)
		{
			//for loop that again traverses the array
			//it will compare j's value to j + 1's value
			for (int j = 0; j < arr.length - 1; j++)
			{
				//if statement to check if the 
				//first number is greater than 
				//the second
				if (arr[j] > arr[j+1]) 
				{
					//create a temp int and set
					//it to the first number
					int temp = arr [j];
					//set the first int to int
					//right after it to make both 
					//ints the second number
					arr [j] = arr [j+1];
					//sets the second number to 
					//the temp int which makes it
					//have the value of the first number
					arr [j+1] = temp;
				}	
			}
		}
		//return the new array
		return arr;
		
	}



	/**
	 * This method takes an array and makes them all
	 * random numbers.
	 * @return
	 */
	private static int[] makeRandom() 
	{
		//creates an array with the amount
		//of elements of 2000
		int[] bigNums = new int[2000];
		//sets an int's number to be 
		// the same as the length of the array
		int len = bigNums.length;
		
		//for statement to increment a traverser
		// however many times the array's length is
		for (int i = 0; i < len; i++)
		{
			//creates a new int with a value of 
			//a random number from 1 - 1000
			int randomNumber = (int) ((Math.random() * 1000) + 1);
			//set each element of the array to the
			//random number
			bigNums[i] = randomNumber;
			
		}
		
		//return the new array
		return bigNums;
		
		
	}

}
