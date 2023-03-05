package application;

import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class BlackButton extends BorderColorButton {
	public BlackButton() {
		super("");
		this.setStyle("-fx-background-color: #000000");
	}
	
	public void clicked() {
		PaintMain.currentColor = Color.BLACK;;
	}

	public void setSize(HBox colorBox) {
		colorBox.getChildren().addAll(this);
		this.prefHeight(50);
		this.prefWidth(50);
	}
}
