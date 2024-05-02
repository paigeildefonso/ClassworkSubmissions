import java.util.ArrayList;

public class ArrayListSorters 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> nums = new ArrayList <Integer> ();

		ArrayList<String> names = new ArrayList <String> ();
		
		nums.add(1);
		nums.add(7);
		nums.add(4);
		nums.add(6);
		nums.add(9);
		
		names.add("nua");
		names.add("kenny");
		names.add("abby");
		names.add("lauren");
		names.add("gabbi");
		
		bubbleSortNumbers(nums);
		//System.out.println(nums);
		
		bublleSortStrings(names);
	}
	
	private static void bublleSortStrings(ArrayList<String> names) 
	{
		for (int i = 0; i < names.size(); i++)
		{
			//System.out.println(i);
			for (int j = 0; j < names.size() -1; j++)
			{
				//System.out.println(j);
				//if (nums.get(j) > nums.get(j+1)); 
				
				if (names.get(j).compareTo(names.get(j+1)) > 0)
				{
					//System.out.println("test");
					String temp = names.set(j, names.get(j+1));
					names.set(j+1, temp);
					
				}	
			}
		}
		System.out.println(names);
		
	}

	private static void bubbleSortNumbers(ArrayList<Integer> n) 
	{
		//System.out.println(nums.size());
		
		ArrayList<Integer> nums = n;
		
		for (int i = 0; i < nums.size(); i++)
		{
			//System.out.println(i);
			for (int j = 0; j < nums.size() -1; j++)
			{
				//System.out.println(j);
				//if (nums.get(j) > nums.get(j+1)); 
				
				if (nums.get(j).compareTo(nums.get(j+1)) > 0)
				{
					//System.out.println("test");
					Integer temp = nums.set(j, nums.get(j+1));
					nums.set(j+1, temp);
					
				}	
			}
		}
			
		System.out.println(nums);
	}
	
	
}
