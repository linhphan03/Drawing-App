package application;

public class RectangleButton extends ShapeButton {
	
	public RectangleButton() {
		this.setText("\u0092");
	}

	@Override
	public void clicked() {
		PaintMain.currentShape = new RectangleShape();
	}
}
