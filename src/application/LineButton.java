package application;

public class LineButton extends ShapeButton {

	public LineButton() {
		super();
		this.setText("\u002F");
	}

	@Override
	public void clicked() {
		PaintMain.currentShape = new LineShape();
	}
}
