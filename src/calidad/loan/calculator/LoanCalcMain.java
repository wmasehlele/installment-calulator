package calidad.loan.calculator;

import javax.swing.*;

public class LoanCalcMain {
	
	static LoanCalculator objCalculator;
	
	static void readInput(){
		//the rate is in percents:7, and the term is in month:60, loan amount:14000
		double amount = Double.parseDouble(JOptionPane.showInputDialog("Enter the Loan Amount: "));
		double rate = Double.parseDouble(JOptionPane.showInputDialog("Enter the interest Rate: "));
		int term = Integer.parseInt(JOptionPane.showInputDialog("Enter the Loan Term, in months: "));
		
		objCalculator = new LoanCalculator(rate,amount,term);
	}
	
	public static void main(String[] args) {
		readInput();
		double instalment = objCalculator.monthlyPayment();
		
		JOptionPane.showMessageDialog(null, "Your monthly instalment is: "+instalment);
	}
}
