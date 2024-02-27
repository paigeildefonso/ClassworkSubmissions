package PaigeClassroomTutorial;

public class ArraysTutorial 
{

	public static void main(String[] args) 
	{
		//declare an int array without any values
		int[] arr = null;
		
		//declare an int array of 4 default values
		int[] arr2 = new int [4];
		
		//declare an array with three values we want to set the literals of 4, 12, 28
		int [] arr3 = { 4, 12, 28};
		
		//print out the contents
		System.out.println(arr);
		System.out.println(arr2);
		System.out.println(arr3);
		
		//print its first element of arr3
		System.out.println("first element is " + arr3 [0]);
		
		//print its last element of arr3
		System.out.println("the last element is " + arr3 [arr3.length - 1]);
		
		//call method to print first and last element, and then change them both to 1
		printAndChangeFirstLast( arr3 );
		
		//print the NEW first element of arr3
		System.out.println("first element is " + arr3 [0]);
				
		//print the NEW last element of arr3
		System.out.println("the last element is " + arr3 [arr3.length - 1]);
		
		
		
		//call method to return sum of two indices
		int sum = sumOfTwoElements ( arr3, 0, 2);
		System.out.println("the sum is " + sum);
		
		
		//call method to return a new array with same length but all zeros as literals
		int[] newArr = makeSameLengthArrWithZeros ( arr3 );
		
		
		
		//TASK 1: make a method that returns an ARRAY of the first
		//and last elements of a passed array
		
		//for example {4, 7, 12, 3} ----returns---> {4, 3}
		
		//make a new array
		int [] arr4 = { 6, 4, 8, 12, 10};
		
		//call the method
		int [] paigesArr = arrThatIsOnlyTheFirstAndLastElements ( arr4 );
		
		//print statement to check if my method works
		//it printed out the weird number things
		System.out.println("Task 1: " + paigesArr);
		
		
		
		
		
		
		//TASK 2: make a method that changes an array. it should be
		//passed the array and the index you want to change.
		//it will divide specified index by 2
		
		//for example ( {2, 4, 6, 8}, 2) ----> {2, 4, 3, 8}
		
		//call the method
		int [] abbysArr = arrThatDividesAnIndexByTwo (arr4);
		
		//print statement to see if it works
		System.out.println("Task 2: the index of 3 was 12... now its " + arr4[3]);
		
	
	}
	
	private static int[] arrThatDividesAnIndexByTwo(int[] arr) 
	{
		//i'm going to choose the index... I chose index 3
		
		//code to get new index of 3
		arr [3] = (arr[3])/2;
		return arr;
	}

	private static int[] arrThatIsOnlyTheFirstAndLastElements(int[] arr) 
	{
		//create a new array with only the first and last element
		int [] nuasArray = {arr[0], arr[arr.length -1]};
		//return the new array
		return nuasArray;
	}

	private static int[] makeSameLengthArrWithZeros(int[] arr) 
	{
		//make an array with all zeros with the same length as the past one
		int[] tempArr = new int [arr.length];
		//return the new one we made
		return tempArr;
	}

	private static int sumOfTwoElements(int[] arr, int first, int second) 
	{
		//return the sum of the first and second number in the array
		return (arr[first] + arr[second]);
		
	}

	public static void printAndChangeFirstLast( int[] arr )
	{
		//print the first and last elements
		System.out.println("the first and last elements "
				+ "are " + arr [0] + " and " + arr [arr.length -1] + ".");
		
		//change these elements to 1
		//change first to 1
		arr[0] = 1;
		
		//change last to 1
		arr [ arr.length -1] = 1;
		
		//print the new first and last elements
		//System.out.println("the first and last elements "
				//+ "are " + arr [0] + " and " + arr [arr.length -1] + ".");
		
	}

}
