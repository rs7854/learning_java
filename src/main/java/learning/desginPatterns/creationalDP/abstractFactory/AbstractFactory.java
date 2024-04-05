package learning.desginPatterns.creationalDP.abstractFactory;

public interface AbstractFactory {

	public Loan getLoan(String lName) ;
	public Bank getBankName(String bName);
	
	public static AbstractFactory getFactory(String choice){  
	      if(choice.equalsIgnoreCase("Bank")){  
	         return new BankFactory();  
	      } else if(choice.equalsIgnoreCase("Loan")){  
	         return new LoanFactory();  
	      }  
	      return null;  
	   }  
}
