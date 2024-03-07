
public class sumArrElementsAndMakeEveryOtherOne 
{

	public static void main(String[] args) 
	{
		//create an array that consists of doubles
		double [] arr = {3.1, 2.1, 8.4};
		
		//call a method that is passed the array for 
		//its parameter
		sumArrElements ( arr );
		
		//the print statement that refers to the method created
		System.out.println ("the sum is " + sumArrElements(arr));

		
		//create an array that consists  of ints
		int [] arr2 = {3, 17, 12, 8, 9, 4, 12};
		
		//call a method that is passed an array of ints and
		//changed that array
		makeEveryOtherOne ( arr2 ); 
	}
	
	/**
	 * this method is passed an array of doubles and will create a new 
	 * array where every other element in the array is '1', starting
	 * with the second element
	 * @param arr2
	 */
	private static void makeEveryOtherOne(int[] arr2) 
	{
		//create a traverser
		int t;
		//for loop that moves the traverser through every other element
		for (t = 0; t <= arr2.length-1; t +=2);
		{
			//change whatever the traverser element is to become 1
			arr2[t] = 1;
		}
		
	}


	/**
	 * this method is passed an array of doubles and prints out
	 * the sum of all it's elements
	 * @param arr
	 */
	public static double sumArrElements(double[] arr) 
	{
		//create a traverser
		int traverser;
		//set the sum equal to 0
		double sum = 0;
		
		//for loop that moves the traverser through each element
		for (traverser = 0; traverser <= arr.length - 1; traverser++)
		{
			//set a double equal to the number that the traverser is set to
			double add = arr [traverser];
			//add the double to the sum (which started at 0) so it 
			//continuously adds the next traverser element to find the sum
			sum += add;
		}
		//return the sum of all elements
		return sum;
	}

}
