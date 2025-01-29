import java.util.Scanner;

class CurrencyConverter{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		System.out.println();
		System.out.println("**** Currency Converter *****");
		System.out.println();

		System.out.println("Enter the amount(INR): ");
		float inr = sc.nextFloat();
		System.out.println();

		System.out.println();
		System.out.println("### LIST OF CURRENCY ###");
		System.out.println();

		
		System.out.println("1. USD");
		System.out.println("2. EUR");
		System.out.println("3. GBP");
		System.out.println("4. PKR");
		System.out.println("5. SLR"); //3.47
		System.out.println("6. DINAR"); //1.30
		System.out.println();
		
		System.out.print("Enter the Currency to which you want to convert: ");
		String curr = sc.next().toUpperCase();

		float crCurr = 0f;

		if(curr.equals("USD")){
			crCurr = inr/86.56f;
			System.out.println(inr+" In USD are"+crCurr);
		}
		else if(curr.equals("EUR")){
			crCurr = inr/0.011f;
			System.out.println(inr+" In EUR are"+crCurr);
		
		}
		else if(curr.equals("GBP")){
			crCurr = inr/0.83f;
			System.out.println(inr+" In GBP are"+crCurr);
		
		}
		else if(curr.equals("PKR")){
			crCurr = inr/3.23f;
			System.out.println(inr+" In PKP are"+crCurr);
		
		}
		else if(curr.equals("SLR")){
			crCurr = inr/3.47f;
			System.out.println(inr+" In SLR are"+crCurr);
		
		}
		else if(curr.equals("DINAR")){
			crCurr = inr/1.30f;
			System.out.println(inr+" In DINAR are"+crCurr);
		
		}
		else{
			System.out.println("Wrong Option Entered...!");
		}

		
	}

}