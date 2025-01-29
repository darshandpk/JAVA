import java.util.Scanner;

class EVM{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		int bjp = 0, cng = 0, ss = 0, aap = 0, mns = 0, nota = 0;
		System.out.println();
		System.out.println("         Welcome       ");
		System.out.println();

	
		System.out.println("Enter the Popullation : ");
		int population = sc.nextInt();

		for(int i = 1; i<=population; i++){
			
			System.out.println();
			System.out.println("**** LIST OF PARTIES *****");
			System.out.println();

			System.out.println("1. BJP");
			System.out.println("2. CONGRESS");
			System.out.println("3. SHIV SENA");
			System.out.println("4. AAP");
			System.out.println("5. MNS");
			System.out.println("6. NOTA");
			System.out.println();

			System.out.println("Enter the Option: ");
			int op = sc.nextInt();

			if(op>=1 && op<=6){
				if(op==1){
					bjp++;
					System.out.println("Ache DIN AAYEGE");
				}
				if(op==2){
					cng++;
					System.out.println("BHARAT TODO");
				}
				if(op==3){
					ss++;
					System.out.println("HUM HAI ASLI SENA");
				}
				if(op==4){
					aap++;
					System.out.println("MuZE AAZAD KARO");
				}
				if(op==5){
					mns++;
					System.out.println("JAY MAHARASHTRA");
				}
				if(op==6){
					nota++;
					System.out.println("YOUR AN EDUCATED PERSON...!");
				} 
			}
			if(!(op>=1 && op<=6)){
				i--;
				System.out.println("INVALID OPERATOR...!");	
			}

		}	//for end
		
		System.out.println();

		if(bjp>=cng && bjp>=ss && bjp>= aap && bjp>=mns && bjp>=nota){
			System.out.println("BJP HAS WON THE ELECTION BY "+bjp+" vote");
		}

		if(cng>=bjp && cng>=ss && cng>= aap && cng>=mns && cng>=nota){
			System.out.println("CONGRESS HAS WON THE ELECTION BY "+cng+" vote");
		}

		if(ss>=cng && ss>=bjp && ss>= aap && ss>=mns && ss>=nota){
			System.out.println("SHIV SENA HAS WON THE ELECTION BY "+ss+" vote");
		}

		if(aap>=cng && aap>=ss && aap>= bjp && aap>=mns && aap>=nota){
			System.out.println("AAP HAS WON THE ELECTION BY "+aap+" vote");
		}

		if(mns>=cng && mns>=ss && mns>= aap && mns>=bjp && mns>=nota){
			System.out.println("MNS HAS WON THE ELECTION BY "+mns+" vote");
		}

		if(nota>=cng && nota>=ss && nota>= aap && nota>=mns && nota>=bjp){
			System.out.println("NO ONE HAS WON THE ELECTION ALL "+nota+" VOTES IS ON NOTA");
		}

	}

}