import java.util.Scanner;

public class MonthSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String MonthName;
		int	NumberofDays;

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Year: ");
			int year = scan.nextInt();
		
		System.out.println("Enter the month number: ");
			int month = scan.nextInt();
			
			if(month <= 12 && month > 0) 
			{
				switch(month) 
				{
				case 1:
					MonthName = "January";
					NumberofDays = 31;
						System.out.println(MonthName+" of "+year+" has "
					+NumberofDays+" days.");
						break;
					
				case 2:
					MonthName = "February";
					NumberofDays = 28;
					
					if(year % 4 ==0) {
						System.out.println(MonthName+" of "+year+" has "
								+29+" days.");
					}
					
					else {
						System.out.println(MonthName+" of "+year+" has "
					+NumberofDays+" days");
						
					}
					break;
					
				case 3:
					MonthName = "March";
					NumberofDays = 31;
						System.out.println(MonthName+" of "+year+" has "
					+NumberofDays+" days.");
						break;
						
				case 4:
					MonthName = "April";
					NumberofDays = 31;
						System.out.println(MonthName+" of "+year+" has "
					+NumberofDays+" days.");
						break;
				
				case 5:
					MonthName = "May";
					NumberofDays = 31;
						System.out.println(MonthName+" of "+year+" has "
					+NumberofDays+" days.");
						break;
						
				case 6:
					MonthName = "June";
					NumberofDays = 31;
						System.out.println(MonthName+" of "+year+" has "
					+NumberofDays+" days.");
						break;
				
				case 7:
					MonthName = "July";
					NumberofDays = 31;
						System.out.println(MonthName+" of "+year+" has "
					+NumberofDays+" days.");
						break;
						
				case 8:
					MonthName = "August";
					NumberofDays = 31;
						System.out.println(MonthName+" of "+year+" has "
					+NumberofDays+" days.");
						break;
						
				case 9:
					MonthName = "September";
					NumberofDays = 31;
						System.out.println(MonthName+" of "+year+" has "
					+NumberofDays+" days.");
						break;
				
				case 10:
					MonthName = "October";
					NumberofDays = 31;
						System.out.println(MonthName+" of "+year+" has "
					+NumberofDays+" days.");
						break;
						
				case 11:		
						MonthName = "November";
						NumberofDays = 31;
							System.out.println(MonthName+" of "+year+" has "
						+NumberofDays+" days.");
							break;
				case 12:
					MonthName = "December";
					NumberofDays = 31;
						System.out.println(MonthName+" of "+year+" has "
					+NumberofDays+" days.");
						break;
						
					default:
						System.out.println("Invalid Input! Please "
								+ "Enter a valid input.");
						
				}
				
			}
		
			else 
			{
				System.out.println("Invalid Input! Please "
						+ "Enter a valid input.");
			}
		
		
	}

}
