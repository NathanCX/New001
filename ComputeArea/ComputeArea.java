public class ComputeArea{
	// Details to be given later
	public static void main (String[] args){
		 double radius;   //Declare radius
		 double area;     // Declare area
		 final double PI = 3.1415926;
		 
		 // Assign a radius
		 radius = 20 ;
		 
		 // step 2 : ComputeArea
		 area = radius * radius * PI;
		 System.out.println("The area for the circle of radius" 
		 + radius +" is " + area);
		 
		 //Second Area
		 radius = 30 ;
		 area = radius * radius * PI;
		 
		// step 3 : Display the area
		System.out.println("The area for the circle of radius"
		 + radius +" is " + area);
		
	}
}