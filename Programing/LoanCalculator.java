import java.util.Scanner;

class LoanCalculator{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		System.out.println("		LOAN CALCULATOR			");
		System.out.println();

		System.out.println("Enter the Amount: ");
		float amount=sc.nextFloat();

		System.out.println("Enter the Rate of Intrest: ");
		float roi = sc.nextFloat();	

		System.out.println("Enter the Tenure (Months) : ");
		int months = sc.nextInt();

		String str = (months/12)+"."+(months%12);
		float conversion = Float.parseFloat(str);


		System.out.println();
		
		System.out.println("LOAN CALCULATION");
		System.out.println("Principal Amount : "+amount);
		
		System.out.println("Rate of Intrest : "+roi+" %");
		System.out.println("Tenure (months): "+months+" Months");

		float intrestyear = amount*roi/100;
		float totalintrest = intrestyear*conversion;
		
		System.out.println("Total Intrest : "+totalintrest);
		
		float outstanding = amount + totalintrest;
		
		System.out.println("Total outstanding Amount is : "+ outstanding);
		
		System.out.println("EMI Per months is: "+(outstanding/months));
	}

}