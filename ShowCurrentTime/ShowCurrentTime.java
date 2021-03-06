public class ShowCurrentTime{
	public static void main(String[] args){
		// Obtain the total milliseconds
		long totalMilliseconds = System.currentTimeMillis();
		
		// Obtain the total seconds since 1970-0101-00:00:00
		long totalSeconds = totalMilliseconds / 1000;
		
		// Obtain the total minutes since 1970-0101-00:00:00
		long totalMinutes = totalSeconds / 60;
		
		// Obtain the total hours since 1970-0101-00:00:00
		long totalHours = totalMinutes / 60;
		
		// Compute the current seconds
		long currentSecond = totalSeconds % 60;
		
		// Compute the current minutes
		long currentMinute = totalMinutes % 60;
		
		// Compute the current hours
		long currenthour = (totalHours % 24 + 8) % 24;
		
		// Display current time
		System.out.println("Current time is" +" " + currenthour + 
		":" + currentMinute + ":" + currentSecond + " GMT");
	}
}
