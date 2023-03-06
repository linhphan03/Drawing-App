package application;

import javafx.scene.paint.Color;

public class OrangeButton extends BorderColorButton {
	public OrangeButton() {
		super("");
		this.setStyle("-fx-background-color: #FFA500");
	}
	
	public void clicked() {
		PaintMain.currentColor = Color.ORANGE;
	}
}
