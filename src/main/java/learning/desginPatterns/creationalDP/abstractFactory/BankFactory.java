package learning.desginPatterns.creationalDP.abstractFactory;

public class BankFactory implements AbstractFactory {

	@Override
	public Loan getLoan(String lName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bank getBankName(String bName) {
		if(bName.equalsIgnoreCase("HDFC"))
			return new HDFC();
		return new ICICI();
	}

}
