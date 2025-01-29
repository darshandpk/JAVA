import java.util.Scanner;
class NumberOfYearsDays{
	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Minutes you want to Convert to Year and Days: ");
		Long minutes = sc.nextLong();

		long years = minutes/(60*24*365);
		
		long rememinutes = minutes%(60*24*365);

		long days = rememinutes/(60*24);

		System.out.println(minutes+ " Contains the "+ years+ " Years and "+ days+ " Days.");
	

	}

}