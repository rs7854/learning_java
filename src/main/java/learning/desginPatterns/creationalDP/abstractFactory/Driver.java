package learning.desginPatterns.creationalDP.abstractFactory;

public class Driver {

	public static void main(String[] args) {
		
		AbstractFactory b = AbstractFactory.getFactory("bank");
		b.getBankName("HDFC");
		b.getLoan("Home");
		
	}

}
