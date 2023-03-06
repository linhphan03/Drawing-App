package application;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Scanner;

import javafx.scene.effect.Light.Point;
import javafx.scene.paint.Color;

public class PaintFile {
	private static Point start;
	private static Point end;
	private static Color color;
	
	public static final String filePath= "C:\\Users\\Linh Phan\\eclipse-workspace\\MiniPaintProject\\";
	
	public static void saveToFile(String fileName) {
		try {
			File f = new File(filePath + fileName);
			FileWriter output = new FileWriter(f);
			for (Shapes shape : PaintMain.paints) {
				// Write objects to file
				output.write(String.valueOf(shape.getStart().getX()) + "\n");
				output.write(String.valueOf(shape.getStart().getY()) + "\n");
				output.write(String.valueOf(shape.getEnd().getX()) + "\n");
				output.write(String.valueOf(shape.getEnd().getY()) + "\n");
				for (Entry<String, Color> entry : ColorMapping.colorMapping().entrySet()) {
					if (entry.getValue().equals(shape.color)) {
						output.write(entry.getKey() + "\n");
						break;
					}
				}
				output.write(shape.getClass().getSimpleName() + "\n");
			}
			
			output.close();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void readFile(String fileName) {
		File fileToRead = new File(filePath + fileName);
		Scanner sc;
		try {
			sc = new Scanner(fileToRead);
			while (sc.hasNext()) {
				// Read objects
				Double startX = sc.nextDouble();
				Double startY = sc.nextDouble();
				Double endX = sc.nextDouble();
				Double endY = sc.nextDouble();
				color = ColorMapping.colorMapping().get(sc.next());
				String type = sc.next();
				
				start = new Point(startX, startY, 0, color);
				end = new Point(endX, endY, 0, color);
				PaintMain.paints.add(addedShape(type));
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
	}
	
	public static Shapes addedShape(String type) {
		if (type.equals("CircleShape")) {
			return new CircleShape(start, end, color);
		}
		else if (type.equals("LineShape")) {
			return new LineShape(start, end, color);
		}
		else {
			return new RectangleShape(start, end, color);
		}
	}
}
