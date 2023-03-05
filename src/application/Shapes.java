package application;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.effect.Light.Point;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;

public class Shapes extends Shape {
	Point start = new Point();
	Point end = new Point();
	Color color;
	
	public Shapes() {}
	
	public Shapes(Point start, Point end, Color color) {
		this.start = start;
		this.end = end;
		this.color = color;
	}
	
	public Point getStart() {
		return start;
	}

	public void setStart(Point start) {
		this.start = start;
	}
	
	public void setStart(double startX, double startY) {
		setStart(new Point(startX, startY, 0, Color.BLACK));
	}

	public Point getEnd() {
		return end;
	}

	public void setEnd(Point end) {
		this.end = end;
	}
	
	public void setEnd(double endX, double endY) {
		setEnd(new Point(endX, endY, 0, Color.BLACK));
	}

	public void draw(GraphicsContext gc) {
		//do nothing
	}
	
	public Shapes createNewShape(Point start, Point end, Color color) {
		return new Shapes(start, end, color);
	}
	
	public Shapes createNewShape() {
		return this;
	}
}
