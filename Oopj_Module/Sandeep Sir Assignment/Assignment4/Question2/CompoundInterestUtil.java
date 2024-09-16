package exe.java;

import java.util.Scanner;

class CompoundInterestCalculatorUtil {
	Scanner scanner = new Scanner(System.in);
    private CompoundInterest compoundInterest;
   
    public void acceptRecord() {
        System.out.print("Enter Initial Investment Amount (in ₹): ");
        double principal = scanner.nextDouble();
        System.out.print("Enter Annual Interest Rate (in %): ");
        double annualInterestRate = scanner.nextDouble();
        System.out.print("Enter Number of Compounds per Year: ");
        int numberOfCompounds = scanner.nextInt();
        System.out.print("Enter Investment Duration (in years): ");
        int years = scanner.nextInt();

        compoundInterest = new CompoundInterest(principal, annualInterestRate, numberOfCompounds, years);
    }

    public void printRecord() {
        
            System.out.println(compoundInterest);  // Display investment details
            double futureValue = compoundInterest.calculateFutureValue();
            double totalInterest = compoundInterest.calculateTotalInterest();
            System.out.printf("Future Value: ₹%.2f\n", futureValue);
            System.out.printf("Total Interest Earned: ₹%.2f\n", totalInterest); 
    }

    // Method to display the menu options
    public void menuList() {
        System.out.println("1. Enter Investment Details");
        System.out.println("2. Display Future Value and Total Interest");
        System.out.println("3. Exit");
    }
}

