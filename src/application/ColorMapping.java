package application;

import java.util.HashMap;

import javafx.scene.paint.Color;

public class ColorMapping {
	
	public static HashMap<String, Color> colorMapping() {
		HashMap<String, Color> colorMap = new HashMap<String, Color>();
		colorMap.put("#000000", Color.BLACK);
		colorMap.put("#22B14C", Color.GREEN);
		colorMap.put("#3F48CC", Color.BLUE);
		colorMap.put("#ED1C24", Color.RED);
		colorMap.put("#FFF200", Color.YELLOW);
		colorMap.put("#FFA500", Color.ORANGE);
		return colorMap;
	}

}
