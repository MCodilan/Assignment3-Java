import java.util.Scanner;
/**
 * 
 *Name: Mihailo Codilan
 *Teacher: Mr.Hardman
 *Assignment #1, Program #1
 *October 26th, 2016
 * 
 */
public class AverageCalculator {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner consoleReader = new Scanner (System.in);
		
		System.out.println("Enter Mark 1:");
		double mark1 = consoleReader.nextDouble();
		
		System.out.println("Enter Mark 2:");
		double mark2 = consoleReader.nextDouble();
		
		System.out.println("Enter Mark 3:");
		double mark3 = consoleReader.nextDouble();
		
		System.out.println("Enter Mark 4:");
		double mark4 = consoleReader.nextDouble();
		
		System.out.println("Enter Mark 5:");
		double mark5 = consoleReader.nextDouble();
		
		double average = (mark1 + mark2 + mark3 + mark4 + mark5) / 5; 
		
		System.out.println(String.format("%10s %10.2f", "Mark 1:", mark1 ));
		System.out.println(String.format("%10s %10.2f", "Mark 2:", mark2 ));
		System.out.println(String.format("%10s %10.2f", "Mark 3:", mark3 ));
		System.out.println(String.format("%10s %10.2f", "Mark 4:", mark4 ));
		System.out.println(String.format("%10s %10.2f", "Mark 5:", mark5 ));
		System.out.println(String.format("%10s %10.2f", "Average:", average ));
		consoleReader.close();
	}
}
