
public class InsertionSorter 
{

	public static void main(String[] args) 
	{
		
		//create an array of integers
		int [] taskOneArray = {2, 5, 7, 8, 10, 6};
		
		//TASK 1: create a method thats passed an array of integers
		arrayShifter (taskOneArray);
		printArr(arrayShifter (taskOneArray));
		
		//call an index to be passed into Task 2's method
		int index = 4;
		
		//TASK 2: method that's passed an index
		arrayShifter2 (taskOneArray, index);
		printArr(arrayShifter2 (taskOneArray, index));
		
		//create a new array passed with integers
		int[] taskThreeArray = {3, 6, 1, 7, 2, 10, 2};
		//TASK 3: method that is passed an array
		insertionSort(taskThreeArray);
		printArr (insertionSort(taskThreeArray));
		

	}
	/**
	 * TASK 3:
	 * 		method that has a for loop that 
	 *		 traverses the array from left to right.
	 * 		On each iteration of the loop (in the work) 
	 * 		write code that calls the arrayShifter method
	 * 		and passes it the array and the current loop 
	 * 		index.
	 * @param arr
	 * @return
	 */
	private static int[] insertionSort (int[] arr)
	{
		//for loop that goes throughout the array
		for (int i = 0; i < arr.length; i++)
		{
			
			arrayShifter2 (arr, i);
		}
		
		//return new array
		return arr;
	}
	
	/**
	 * TASK 2:
	 * 		passed an integer index and will sort the value 
	 * 		at that index instead of the last index
	 * @param arr
	 */
	private static int[] arrayShifter2(int[] arr, int index) 
	{
		//while loop that will traverse the array
		while ( index > 0 && arr [index] < arr [index-1] )
		{
			//create a temporary integer and set
			//it to the index
			int temp = arr [index];
			//set the index's number to the integer
			//right before it to make both 
			//integers the second number
			arr [index] = arr [index-1];
			//sets the second number to 
			//the temporary integer which makes it
			//have the value of the first number
			arr [index-1] = temp;
			//move the traverser back another
			//spot
			index--;
		}
		//return the new array
		return arr;
		
	}
	/**
	 * TASK 1:
	 * 		this method will take the last element of an array 
	 * 		and sort it into the right place.
	 * 
	 * 		the array will be sorted except for the last element
	 * @param taskOneArray
	 */
	private static int[] arrayShifter(int[] arr) 
	{
		//create a traverser that is set to
		//the last element in the array
		int i = arr.length - 1;
		
		//while loop that will traverse the array
		//from last to first.
		//it will take the last element and 
		//put it into numerical order within the array
		while ( i > 0 && arr [i] < arr [i-1] )
		{
			//create a temporary integer and set
			//it to the first number
			int temp = arr [i];
			//set the first integer to the integer
			//right before it to make both 
			//integers the second number
			arr [i] = arr [i-1];
			//sets the second number to 
			//the temporary integer which makes it
			//have the value of the first number
			arr [i-1] = temp;
			//move the traverser back another
			//spot
			i--;
		}
		
		//return new array
		return arr;
	}

	/**
	 * this method will print out each element in an
	 * array one by one
	 * @param arr
	 */
	public static void printArr(int[] arr) 
	{
		//declare an int to be the traverser
		int counter;
		
		//start the array by printing out '{'
		System.out.print("{");
		
		//make a loop. we want it to traverse every character
		// of the array
		for (counter = 0; counter <= arr.length-1; counter++) 
		{
			//print out whatever number the traverser is on
			System.out.print(arr[counter]);
			
			//print a comma when it isn't on last element
			if (counter != arr.length-1) 
			{
				System.out.print(", ");
			}
		}
		//finish the array with a '}'
		System.out.println("}");	
	}

	
}
