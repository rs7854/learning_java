package learning.desginPatterns.structuralDP.proxyDP;

public class Driver {

	public static void main(String[] args) {
		Internet internet = new ProxyInternet();
		internet.connectTo("google.com");
		internet.connectTo("banned.com");
		
		
		
	}
}
