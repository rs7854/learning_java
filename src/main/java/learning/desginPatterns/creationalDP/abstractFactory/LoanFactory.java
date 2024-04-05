package learning.desginPatterns.creationalDP.abstractFactory;

public class LoanFactory implements AbstractFactory {

	@Override
	public Loan getLoan(String lName) {
		if(lName.equalsIgnoreCase("HomeLoan"))
		return new HomeLoan();
		else return new CarLoan();
	}

	@Override
	public Bank getBankName(String bName) {
		return null;
	}

}
