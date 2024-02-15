/**
 * this class will store the grades of a student
 * it will store the properties:
 * scienceGrade
 * mathGrade
 * and theologyGrade
 * 
 */
public class Student 
{
	//call the properties for the class
	public double scienceGrade;
	public double mathGrade;
	public double theologyGrade;
	public int gradeLevel;
	private String name;
	
	/**
	 * This method will pass the properties numbers 
	 * to be the initial values for the data attributes.
	 * @param a scienceGrade
	 * @param b mathGrade
	 * @param c theologyGrade
	 * @param d gradeLevel
	 * @param e name
	 */
	public Student(double a, double b, double c, int d, String e) 
	{
		scienceGrade = a;
		mathGrade = b;
		theologyGrade = c;
		gradeLevel = d;
		name = e;
				
	}
	
	//functionalities: the main one is to get the
	//GPA of the student
	// GPA = (sum of all grades) / number of classes
	
	/**
	 * this method gets GPA of the student
	 * 
	 * @return GPA
	 */
	public double getGPA() 
	{
		double GPA = (scienceGrade + mathGrade + theologyGrade)/3;
		return GPA;
	}
	
}
