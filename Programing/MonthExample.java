import java.util.Scanner;

class MonthExample{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Number of Months: ");
		int months = sc.nextInt();

		int years = months/12;
		
		int remmonths = months % 12;
	
		System.out.println(years+(remmonths/10));

	}

}