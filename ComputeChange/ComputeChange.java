import java.util.Scanner;

public class ComputeChange{
	public static void main(String[] args){
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		//Receive the amount
		System.out.print(
		"Enter an amount in double ,for example 11.56: ");
		double amount = input.nextDouble();
		
		int remainAmount = (int)(amount * 100);
		
		//Find the number of one dollars
		int numberOfOneDollars = remainAmount / 100;
		remainAmount = remainAmount % 100;
		
		// Find the number of dimes in the remaining amount
		int numberOfQUarters = remainAmount / 25;
		remainAmount = remainAmount % 25;
		
		// Find the number of dimes in the remaining amount
		int numberOfDimes = remainAmount / 10;
		remainAmount = remainAmount % 10;
		
		// Find the number of nikels in the remaining amount
		int numberOfNickels = remainAmount / 5;
		remainAmount = remainAmount % 5;
		
		// Find the number of pennies in the remaining amount
		int numOfPennies = remainAmount;
		
		// Display results
		System.out.println("Your amount" + amount + "consists of \n" +
		"\t" + numberOfOneDollars + " dollars\n" +
		"\t" + numberOfQUarters + "quarters\n"+
		"\t" + numberOfDimes + "dimes\n" +
		"\t" + numberOfNickels + "nikels\n" +
		"\t" + numOfPennies + "pennies");
      }
		}