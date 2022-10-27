import java.util.Scanner;

public class TheAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 5 numbers to find the "
				+ "sum and average: ");
		
		float num1 = scan.nextFloat();
		float num2 = scan.nextFloat();
		float num3 = scan.nextFloat();
		float num4 = scan.nextFloat();
		float num5 = scan.nextFloat();
		
		float sum = num1 + num2 + num3 + num4 + num5;
		
		System.out.println("The sum is "+sum);
		
		float average = sum / 5;
		
		System.out.println("The average is: "+average);
	}

}
