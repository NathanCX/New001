import java.util.Scanner; // Scanner is in Java.util package

public class ComputeAverage{
	public static void main(String[] args){
		//Creat a scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter three numbers
		System.out.print("Enter therr numbers");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		//Compute average
		double average = (number1 + number2 + number3) / 3;
		
		//Display result
		System.out.println("The average of three numbers is" 
		+ "" + average);
	}
}