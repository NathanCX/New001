import java.util.Scanner;
//添加输入工具
public class FeetToMeters{
	 public static void main (String[] args){
		 Scanner input = new Scanner(System.in);
		 System.out.print("Enter a value for feet :");
		 //提示输入英寸
		 double feet = input.nextDouble();
		 
		 double meters = feet * 0.305;
		 
		 System.out.println( feet + "feet is " + meters + "meters");

		 
	 }
}
