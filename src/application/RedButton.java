package application;

import javafx.scene.paint.Color;

public class RedButton extends BorderColorButton {
	public RedButton() {
		super("");
		this.setStyle("-fx-background-color: #ED1C24");
	}
	
	public void clicked() {
		PaintMain.currentColor = Color.RED;
	}
}
