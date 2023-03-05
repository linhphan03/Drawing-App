package application;

public class CircleButton extends ShapeButton {

	public CircleButton() {
		super();
		this.setText("\u004F");
	}

	@Override
	public void clicked() {
		PaintMain.currentShape = new CircleShape();
	}
}