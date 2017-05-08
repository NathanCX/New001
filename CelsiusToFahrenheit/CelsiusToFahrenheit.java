import java.util.Scanner;

public class CelsiusToFahrenheit{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a degree in Celsius:");
		double Celsius = input.nextDouble();
		
		// Convert Celsius  to  Fahrenheit
		double Fahrenheit = (9.0 / 5) * (Celsius + 32);
		System.out.println("Celsius " + Celsius + " is " + Fahrenheit
		+ " fahrenheit ");
		
	}
}