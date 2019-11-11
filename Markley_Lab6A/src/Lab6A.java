import java.util.Scanner;

public class Lab6A
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("Enter a 24 hour time: ");
			int hours = 0, minutes = 0;
			
			String input24HourFormat = scan.nextLine();
			
			try
			{
				CheckFormat(input24HourFormat);
			}
			catch(TimeFormatException timeFormatException)
			{
				timeFormatException.printStackTrace();
				
				try
				{
					Thread.sleep(500);
				}
				catch(Exception e)
				{
					
				}
				
				System.out.println("Try again...");
				continue;
			}
			
			String[] hoursAndMinutes = input24HourFormat.split(":");
			
			hours = Integer.parseInt(hoursAndMinutes[0]);
			minutes = Integer.parseInt(hoursAndMinutes[1]);
			
			try
			{
				CheckTime(hours, minutes);
			}
			catch(TimeFormatException timeFormatException)
			{
				timeFormatException.printStackTrace();
				
				try
				{
					Thread.sleep(500);
				}
				catch(Exception e)
				{
					
				}
				
				System.out.println("Try again...");
				continue;
			}
			
			int changedHours = hours;
			if(hours > 12)
				changedHours = hours - 12;
			else if(hours == 0)
				changedHours = 12;
			
			if(hours >= 12 && hours < 24)
				System.out.println("That is the same as " + changedHours +
						":" + minutes + " PM");
			else
				System.out.println("That is the same as " + changedHours +
						":" + minutes + " AM");
			
			System.out.println("Would you like to enter another time?");
			
			if( ! scan.nextLine().equals("y") )
			{
				System.out.println("Thank you – end of program");
				break;
			}
		}	
	}
	
	public static void CheckTime(int hours, int minutes) throws TimeFormatException
	{
		if(hours >= 24 || hours < 0)
		{
			//hours are bad. Throws some exception
			throw new TimeFormatException(
					"There is no such time as: " + hours +
					":" + minutes);
		}
		if(minutes >= 60 || minutes < 0)
		{
			//minutes are bad. Throws some exception.
			throw new TimeFormatException(
					"There is no such time as: " + hours +
					":" + minutes);
		}
	}
	
	public static void CheckFormat(String input) throws TimeFormatException
	{
		if( ! input.contains(":") )
		{
			throw new TimeFormatException(
					"There is no such time as: " + input);
		}
	}
}