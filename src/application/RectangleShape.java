package application;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.effect.Light.Point;
import javafx.scene.paint.Color;

public class RectangleShape extends Shapes {
	
	public RectangleShape(Point start, Point end, Color color) {
		super(start, end, color);
	}

	public RectangleShape() {
		super();
	}
	
	@Override
	public void draw(GraphicsContext gc) {
		gc.setStroke(this.color);
		gc.beginPath();
		double width = Math.abs(end.getX() - start.getX());
		double height = Math.abs(end.getY() - start.getY());
		
		if (end.getX() > start.getX()) {
			if (end.getY() > start.getY()) {
				gc.rect(start.getX(), start.getY(), width, height);
			}
			else {
				gc.rect(start.getX(), end.getY(), Math.abs(end.getX() - start.getX()), Math.abs(end.getY() - start.getY()));
			}
		}
		else {
			if (end.getY() > start.getY()) {
				gc.rect(end.getX(), start.getY(), Math.abs(end.getX() - start.getX()), Math.abs(end.getY() - start.getY()));
			}
			else {
				gc.rect(end.getX(), end.getY(), Math.abs(end.getX() - start.getX()), Math.abs(end.getY() - start.getY()));
			}
		}
		gc.stroke();
	}
	
	@Override
	public Shapes createNewShape(Point start, Point end, Color color) {
		return new RectangleShape(start, end, color);
	}
	
	public Shapes createNewShape() {
		return new RectangleShape();
	}
}
