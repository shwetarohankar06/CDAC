package Program.org;

public class LoanAmortizationCalculator {
	private double loanAmount;
	private double annualInterestRate;
	private int loanTerm;
	
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public int getLoanTerm() {
		return loanTerm;
	}
	public void setLoanTerm(int loanTerm) {
		this.loanTerm = loanTerm;
	}
	
	@Override
	public String toString() {
		

		String res = "LoanAmortizationCalculator [loanAmount=" + loanAmount + ", annualInterestRate=" + annualInterestRate
				+ ", loanTerm=" + loanTerm + "]";
		res = res + "monthly payment" + calculateMonthlyPayment(this.loanAmount, this.annualInterestRate, this.loanTerm);
		return res;
	}
	
	public double calculateMonthlyPayment(double loanAmount, double annualInterestRate, int loanTerm) {
		int numberOfMonths = loanTerm * 12;
		double monthlyInterestRate = annualInterestRate / 12 / 100;
		double monthlyPayment = (loanAmount * Math.pow(1 + monthlyInterestRate , numberOfMonths)) / ((Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1));
		return monthlyPayment;
	}

}


