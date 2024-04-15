import java.util.ArrayList;

public class ArrayListMethodsInDepth 
{

	public static void main(String[] args) 
	{
		//instantiate an empty ArrayList
		//foods that stores Strings.
		ArrayList<String> foods = new ArrayList <String> ();
		
		//add Strings to foods
		foods.add("Apples");
		foods.add("Bread");
		foods.add("Cookies");
		
		//TASK 1: Print out length of the 
		//foods ArrayList
		
		//in general, this method prints 
		//out the length of the ArrayList.
		//in this case, it's 3
		System.out.println (foods.size());
		
		//TASK 2: Inside of a print statement,
		//add the String "Dole Whip" to foods.
		//In the line comment for this code, 
		//state what it prints.
		//This code prints true.
		
		//this adds a new String, "Dole Whip"
		//to the foods ArrayList
		//It will return true no matter what new
		//object it is passed
		System.out.println (foods.add("Dole Whip"));
		System.out.println (foods.size());
		
		//TASK 3: Inside of a print statement,
		//use the .set(E) method to change 
		//"Bread" in foods to "Butter". 
		//Comment what it prints. 
		//This code prints "bread"
		
		//This sets the element at the index of 1
		//to be "butter"
		//in general, it prints out the past element
		//that was changed.
		//in this case, it is "Bread"
		System.out.println (foods.set(1, "Butter"));
		System.out.println (foods.size());
		
		//TASK 4: Inside of a print statement,
		//use the .remove(int) method to remove 
		//"Cookies" from foods. Comment what it 
		//prints.
		//This code prints "Cookies"
		
		//This removes an element at the index
		//of 2
		//in general, it prints out the element
		//that was removed.
		//in this case, it is "cookies"
		System.out.println (foods.remove(2));
		System.out.println (foods.size());
		
		//TASK 5: For each task, go back and
		//comment what the method you are 
		//calling does, and what the method
		//returns (both in general and in this case).
		
	}

}
