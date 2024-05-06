
public class TwoDArrayTraversal 
{

	public static void main(String[] args) 
	{
		String [][] name = { {"a", "b", "c", "d", "e", "f"},
								{"g", "h", "i", "j", "k","l"},
								{"m", "n", "o", "p", "q", "r"},
								{"s", "t", "u", "v", "w", "x"},
								{"y", "z", "a", "b", "c", "d"},
								{"e", "f", "n", "g", "h", "i"}, 
								{"j", "k", "l", "n", "m", "n"}} ;
		
		//System.out.println(name [0][0]);
		//System.out.println(name [1][0]);
		//System.out.println(name [2][0]);
		//System.out.println(name [3][0]);
		//System.out.println(name [4][0]);
		//System.out.println(name [5][0]);
		//System.out.println(name [6][0]);
		
		int rows = name.length;
		int columns = name[0].length;
		
		//for (int i = 0; i < rows; i++)
		//{
		//	System.out.println(name [i][0]);
		//}
		
	
		for (int j = 0; j < rows; j++)
		{
			for (int n = 0; n < columns; n++)
			{
			System.out.println(name [j][n]);
			}
		}
		
		
		
	}
	
}


