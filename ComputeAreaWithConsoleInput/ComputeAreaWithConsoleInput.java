import java.util.Scanner;  //Scanner is in the Java.util package

public class ComputeAreaWithConsoleInput{
	public static void main (String[] args){
		// Creat a Scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter a radius
		System.out.println("Enter a number for radius:");
		double radius = input.nextDouble();
		
		//Compare area
		double area = radius * radius * 3.1415926;
		
		//Display the result 
		System.out.println("当圆的半径为" + 
		"("+radius+")" + "," + "它的面积为" + area);
	}
}