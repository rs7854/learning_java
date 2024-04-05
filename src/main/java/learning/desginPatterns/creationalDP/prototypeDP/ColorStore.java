package learning.desginPatterns.creationalDP.prototypeDP;

import java.util.HashMap;
import java.util.Map;

public class ColorStore {
	
	private static Map<String, Color> colorMap = new HashMap<String, Color>(); 
    
    static
    {
        colorMap.put("Blue", new BlueColor());
        colorMap.put("Black", new BlackColor());
    }
      
    public static Color getColor(String colorName)
    {
        return (Color) colorMap.get(colorName).clone();
    }

}
