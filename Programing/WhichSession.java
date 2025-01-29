import java.util.Scanner;

class WhichSession{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Month: ");
		String month = sc.next();

		String result = (month == "OCT" || month == "NOV" || month == "DEC" || month == "JAN")?("Winter"):((month == "FEB" || month == "MAR" || month == "APR" || month == "MAY")?("SUmmer"):((month == "JUN" || month == "JUL" || month == "AUG" || month == "SEP")?("Monsoon"):("Wrong Inpt")));

		System.out.println(result);
	}

}