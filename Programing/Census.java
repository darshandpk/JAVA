class Census{
	public static void main(String[]args){

		long pop = 312032486;

		long second = (365*24*60*60)*5;

		long birth = second/7;

		long death = second/13;

		long imm = second/45;


		long newpop = pop +birth - death + imm;

		System.out.println("Old Popullation is: "+ pop);

		System.out.println("New Popullation is :"+ newpop);
	}

}