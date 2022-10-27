import java.util.Scanner;

public class WeekDayandWeekendSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the a number to see what day of the week"
				+ " shares that number: ");
		
		int day = scan.nextInt();
		
		if(day<=7 && day > 0) 
		{
			switch(day) 
			{
				case 1: 
					System.out.println("Input is: "+day);
					System.out.println("It's Monday");
				break;
				
				case 2:
					System.out.println("Input is: "+day);
					System.out.println("It's Tuesday");
				break;
				
				case 3:
					System.out.println("Input is: "+day);
					System.out.println("It's Wendsday");
				break;
				
				case 4:
					System.out.println("Input is: "+day);
					System.out.println("It's Thursday");
				break;
				
				case 5:
					System.out.println("Input is: "+day);
					System.out.println("It's Friday");
				break;
				
				case 6:
					System.out.println("Input is: "+day);
					System.out.println("It's Saturday");
				break;
				
				case 7:
					System.out.println("Input is: "+day);
					System.out.println("Its Sunday");
					
				default:
					System.out.println("Invalid Input! Please enter a "
							+ " valid input.");
			}
		}
		
		else 
		{
			System.out.println("Invalid Input! Please enter a "
					+ " valid input.");
		}
		
	}

}
