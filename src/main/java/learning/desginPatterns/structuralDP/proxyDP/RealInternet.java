package learning.desginPatterns.structuralDP.proxyDP;

public class RealInternet implements Internet {

	public void connectTo(String host) {
		System.out.println("connected:"+ host);
	}

}
