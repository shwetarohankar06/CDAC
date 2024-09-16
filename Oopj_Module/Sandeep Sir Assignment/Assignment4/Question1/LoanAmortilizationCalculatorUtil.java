package Program.org;

import java.util.Scanner;

public class LoanAmortizationCalculatorUtil {
	
	private Scanner sc;
	
	public LoanAmortizationCalculatorUtil() {
		sc = new Scanner(System.in);
	}

	public void menuList() {
		System.out.println("Enter choice 1. Accept and print record , 2. To exit");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			acceptRecord();
			break;
		case 2:
			return;
		default:
			System.out.println("wrong choice");
			break;
		}
	}

	private void acceptRecord() {
		LoanAmortizationCalculator loan = new LoanAmortizationCalculator();
		System.out.println("enter loan amount, interest rate, and term");
		double amount = sc.nextDouble();
		loan.setLoanAmount(amount);
		double rate = sc.nextDouble();
		loan.setAnnualInterestRate(rate);
		int term = sc.nextInt();
		loan.setLoanTerm(term);
		System.out.println(loan.toString());
		
	}
}
