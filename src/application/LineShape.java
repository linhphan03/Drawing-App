package application;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.effect.Light.Point;
import javafx.scene.paint.Color;

public class LineShape extends Shapes {
	
	public LineShape(Point start, Point end, Color color) {
		super(start, end, color);
	}

	public LineShape() {
		super();
	}

	@Override
	public void draw(GraphicsContext gc) {
		gc.setStroke(this.color);
		gc.beginPath();
		gc.moveTo(start.getX(), start.getY());
		gc.lineTo(end.getX(), end.getY());
		gc.stroke();
	}
	
	@Override
	public Shapes createNewShape(Point start, Point end, Color color) {
		return new LineShape(start, end, color);
	}
	
	public Shapes createNewShape() {
		return new LineShape();
	}
}
