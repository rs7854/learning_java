package learning.desginPatterns.structuralDP.proxyDP;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
	
	private static final List<String> bannedSites ;
	private final Internet internet = new RealInternet();
	
	static {
		bannedSites = new ArrayList<String>();
		bannedSites.add("banned.com");
	}

	public void connectTo(String host) {
		if(bannedSites.contains(host)) {
			System.out.println("Access Denied");
			return;
		}else {
			internet.connectTo(host);
		}
		
	}

}
