import java.util.Scanner;

class Bank {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String username1 = null;
		String password1 = null;
		String address = null;
		long contact = 0;
		double balance = 0.0;

		for (;;) {

			System.out.println();
			System.out.println("  		WELCOME		");
			System.out.println();
			System.out.println("		LAXMI CHIT FUND		");
			System.out.println();

			System.out.println("1. EXSISTING USER");
			System.out.println("2. CREATE ACCOUNT");
			System.out.print("Enter the Option: ");
			int opt = sc.nextInt();

			if (opt == 1) {

				if (username1 == null) {
					System.out.println("CREATE YOUR ACCOUNT FIRST!!!");
					continue;
				}

				System.out.println("     LOGIN	");
				System.out.println();
				for (int i = 3; i >= 1; i--) {
					System.out.println("Enter the Username: ");
					String username = sc.next();
					System.out.println("Enter the Password: ");
					String password = sc.next();

					if (username.equals(username1) && password.equals(password1)) {

						home: for (;;) {

							System.out.println();
							System.out.println("		HOME		");
							System.out.println();
							System.out.println("1. DEPOSIT");
							System.out.println("2. WITHDRAW");
							System.out.println("3. CHECK BALANCE");
							System.out.println("4. MINI STATEMENT");
							System.out.println("5. LOGOUT");
							System.out.println();
							System.out.println("Enter the Option: ");
							int opt1 = sc.nextInt();

							switch (opt1) {

								case 1: {
									System.out.println("   DEPOSIT   ");
									System.out.println("Enter the amount:");
									double depositAmt = sc.nextDouble();
									balance += depositAmt;
									System.out.println("Amount Desposited Successfully!!!");
									System.out.println();
									break;
								}
								case 2: {
									System.out.println("   WITHDRAW   ");
									System.out.println();
									System.out.println("Enter the Amount:");
									double withdrawAmt = sc.nextDouble();
									System.out.println("Enter the Pin: ");
									String pin1 = sc.next();
									if (pin1.equals(password1)) {
										if (withdrawAmt <= balance) {
											balance -= withdrawAmt;
											System.out.println("Amount Withdraw Successfully!!!");
											System.out.println();
										} else {
											System.out.println("INSUFFICIENT BALANCE!!!");
										}
									} else {
										System.out.println("INVALID PIN!!!");
									}
									break;
								}
								case 3: {
									System.out.println("   CHECK BALANCE   ");
									System.out.println();

									for (int j = 3; j >= 1; j--) {
										System.out.println();
										System.out.println("Enter the Pin: ");
										String pin2 = sc.next();

										if (pin2.equals(password1)) {
											System.out.println("Your Balance is: " + balance);
											continue home;
										} else {
											System.out.println("WRONG PIN");
											System.out.println("ATTEMPT LEFT: " + (j - 1));
										}
									}
									System.out.println("Your Account Has been Blocked for 24 hours.");
									System.exit(0);
									break;
								}
								case 4: {
									System.out.println("   MINI STATEMENT   ");
									break;

								}
								case 5: {
									System.out.println(" Thank For USING OUR APPLICATION!!!");
									System.out.println("VISIT AGAIN!!!");
									System.exit(0);

								}

							}
						}

					} else {
						System.out.println("INVALID CRED");
						System.out.println("Attempt Left: " + (i - 1));
					}

				}
			} else if (opt == 2) {

				System.out.println();
				System.out.println("      ACCOUNT CREATION      ");
				System.out.println();
				System.out.println("Enter the Username: ");
				username1 = sc.next();
				System.out.println("Enter the Password: ");
				password1 = sc.next();
				System.out.println("Enter the Address: ");
				address = sc.nextLine();
				sc.next();
				System.out.println("Contact: ");
				contact = sc.nextLong();
				System.out.println("Enter the Deposit Amount: ");
				balance = sc.nextDouble();
				System.out.println();
				System.out.println("Account Created Successfully...!");
			} else {
				System.out.println("INVALID OPTION ENTERED...!");
			}
		}

	}
}