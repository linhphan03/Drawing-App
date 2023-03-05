package application;

import javafx.scene.paint.Color;

public class BlueButton extends BorderColorButton {
	public BlueButton() {
		super("");
		this.setStyle("-fx-background-color: #3F48CC");
	}
	
	public void clicked() {
		PaintMain.currentColor = Color.BLUE;
	}
}
