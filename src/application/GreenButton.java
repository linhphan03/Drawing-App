package application;

import javafx.scene.paint.Color;

public class GreenButton extends BorderColorButton {
	public GreenButton() {
		super("");
		this.setStyle("-fx-background-color: #22B14C");
	}
	
	public void clicked() {
		PaintMain.currentColor = Color.GREEN;
	}
}
