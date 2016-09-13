package assignment1;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		int id, num;

		Scanner scan = new Scanner(System.in);

		BankAtm batm1 = new BankAtm(01001, "XYZ BANK", "Shankar Nagar",
				30000.00);
		BankAtm batm2 = new BankAtm(01002, "XYZ BANK", "Shankar Nagar",
				20000.00);
		BankAtm batm3 = new BankAtm(01003, "XYZ BANK", "Shankar Nagar", 5000.00);

		System.out.println("Namaste!!!");
		System.out.println(batm1.bankName + " atm, " + batm1.location);
		System.out.println("***************************************");

		do {
			System.out.println("Please Enter your id (1/2/3) :");
			while (!scan.hasNextInt()) {
				scan.nextLine(); // Clears the invalid input
				System.out.println("Please enter the correct id");
			}
			id = scan.nextInt();
		} while (!(id >= 1 && id <= 3));
		while (true) {
			do {
				System.out.println("Please Enter 1 for Withdrawal");
				System.out.println("Please Enter 2 for Deposit");
				System.out.println("Please Enter 3 to Exit");
				while (!scan.hasNextInt()) {
					scan.nextLine(); // Clears the invalid input
					System.out.println("Please enter the correct number");
				}
				num = scan.nextInt();
				if (num == 3) {
					System.exit(0);
				}
			} while (!(num >= 1 && num <= 3));

			switch (id) {
			case 1:
				if (num == 1) {
					System.out.println("Enter the Amount to Withdraw :");
					batm1.withdraw(scan.nextDouble());
				} else {
					System.out.println("Enter the Amount to Deposit :");
					batm1.deposit(scan.nextDouble());
				}

				break;

			case 2:
				if (num == 1) {
					System.out.println("Enter the Amount to Withdraw :");
					batm2.withdraw(scan.nextDouble());
				} else {
					System.out.println("Enter the Amount to Deposit :");
					batm2.deposit(scan.nextDouble());
				}

				break;

			case 3:
				if (num == 1) {
					System.out.println("Enter the Amount to Withdraw :");
					batm3.withdraw(scan.nextDouble());
				} else {
					System.out.println("Enter the Amount to Deposit :");
					batm3.deposit(scan.nextDouble());
				}

				break;

			}
		}

	}

}
