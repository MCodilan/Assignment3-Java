import java.util.Scanner;
/**
 * 
 *Name: Mihailo Codilan
 *Teacher: Mr.Hardman
 *Assignment #1, Program #1
 *October 25th, 2016
 * 
 */
 
public class Assignment1 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner consoleReader = new Scanner (System.in);
		
		System.out.println("What is your first name?");
		String firstname = consoleReader.next();
		
		System.out.println("What is your last name?");
		String lastname = consoleReader.next();
		
		System.out.println("What grade are you in?");
		int grade = consoleReader.nextInt();
		
		System.out.println("What is your Student ID?");
		double studentID = consoleReader.nextInt();
		
		System.out.println("What is your login?");
		String login = consoleReader.next();
		
		System.out.println("What is your grade average?");
		double average = consoleReader.nextDouble();
		
		System.out.println("\nYour information:\n");
		System.out.println(String.format("%-15s %-20s", "Name:", lastname + ", " + firstname ) );
		System.out.println(String.format("%-15s %-15d", "Grade:", grade ) );
		System.out.println(String.format("%-15s %-15f", "Student ID:", studentID ) );
		System.out.println(String.format("%-15s %-15s", "Login:", login ) );
		System.out.println(String.format("%-15s %-6.2f %%", "Average:", average ) );
		
		consoleReader.close();
	}
}