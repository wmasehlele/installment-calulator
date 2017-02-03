package calidad.loan.calculator;

public class LoanCalculator {
	
	double rate, amount;
	int term;
	double instalment;
	
	public LoanCalculator(double Rate, double Amount, int Term){
		this.rate = Rate / 100;
		this.term = Term;
		this.amount = Amount;
	}
	
	double monthlyPayment(){
		double instalment = 0;
		double numerator = (this.amount + 780) * (rate / 12) * Math.pow(1 + this.rate / 12, term);
		double denominator = Math.pow(1 + this.rate / 12, term)-1;
		instalment = numerator / denominator;
		return Math.round(instalment);
	}
}
