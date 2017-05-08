import java.util.Scanner;
//添加输入工具
public class Cylinder{
	 public static void main (String[] args){
		 Scanner input = new Scanner(System.in);
		 System.out.print("Enter the radius and length of a cylindre:");
		 //提示输入圆柱体的半径和高
		 double radius = input.nextDouble();
		 double length = input.nextDouble();
		 final double PI = 3.14159;
		 
		 double Area = radius * radius * PI ;
		 double volume = Area * length;
		 
		 System.out.println("The Area is " + Area);
		 System.out.println("The volume is " + volume);
		 
	 }
}
