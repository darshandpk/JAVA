import java.util.Scanner;

class WhichSeasons {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Month: ");
		String month = sc.next().toUpperCase();

		String result = ((month.equals("OCT")) || (month.equals("NOV")) || (month.equals("DEC"))
				|| (month.equals("JAN")))
						? (month + "is WINTER")
						: (((month.equals("FEB")) || (month.equals("MAR")) || (month.equals("APR"))
								|| (month.equals("MAY")))
										? (month + "is SUMMER")
										: (((month.equals("JUN")) || (month.equals("JUL")) || (month.equals("AUG"))
												|| (month.equals("SEP"))) ? (month + "is MONSOON")
														: ("INVALID MONTH")));

		System.out.println(result);
	}

}