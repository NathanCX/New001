import java.util.Scanner;

public class CalculateDigits{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		//tishi shurukuang
		System.out.print("Enter a number between 0 to 1000(for example:932)" );
		int Num = input.nextInt();
		int GeWei = Num % 10 ;
		
		int Num2 = Num / 10 ;
		int ShiWei = Num2 % 10 ;
		
		int BaiWei = Num /100 ;
		
		int Sum = GeWei + ShiWei + BaiWei;
		
		System.out.print("The sum of the digits is " + Sum);
		
	}
}
