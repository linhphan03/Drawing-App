package application;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.effect.Light.Point;
import javafx.scene.paint.Color;

public class CircleShape extends Shapes {
	public CircleShape(Point start, Point end, Color color) {
		super(start, end, color);
		this.color = color;
	}

	public CircleShape() {
		super();
	}
	
	@Override
	public void draw(GraphicsContext gc) {
		double radiusX = Math.abs(start.getX() - end.getX());
		double radiusY = Math.abs(start.getY() - end.getY());
		
		gc.save();
		gc.scale(1, 1);
		gc.setStroke(this.color);
		gc.beginPath();
		
		if (end.getX() > start.getX()) {
			if (end.getY() > start.getY()) {
				gc.strokeOval(start.getX(), start.getY(), radiusX, radiusY);
			}
			else {
				gc.strokeOval(start.getX(), end.getY(), radiusX, radiusY);
			}
		}
		else {
			if (end.getY() > start.getY()) {
				gc.strokeOval(end.getX(), start.getY(), radiusX, radiusY);
			}
			else {
				gc.strokeOval(end.getX(), end.getY(), radiusX, radiusY);
			}
		}
	}
	
	@Override
	public Shapes createNewShape(Point start, Point end, Color color) {
		return new CircleShape(start, end, color);
	}
	
	public Shapes createNewShape() {
		return new CircleShape();
	}
}
