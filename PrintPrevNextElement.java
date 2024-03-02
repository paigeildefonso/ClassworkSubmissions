
public class PrintPrevNextElement 
{

	public static void main(String[] args) 
	{
		//declare an array with passed elements
		double [] arr = {3.26, 8.84, 9.63, -4.22, 12.80};
		//declare the index
		int index = 2;
		
		//if statement to check if the index is out of bounds
		if (index >= arr.length-1)
		{
			//print statement if the index is out of bounds
			System.out.println ("error with index");
		}
		
		//create a method to find and print the before and after doubles
		printPrevNextElement (arr, index);

	}

	private static void printPrevNextElement(double[] arr, int index) 
	{
		//declare the double that is before the index
		double before = arr [ index - 1];
		//declare the double that is after the index
		double after = arr [ index + 1];
		//print statement that says what the before and after doubles are
		System.out.println("the number before the element at index 2 is " + before + " and"
				+ " the number after the element at index 2 is " + after);
		
	}

}
