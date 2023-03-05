package application;

import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class YellowButton extends BorderColorButton {
	public YellowButton() {
		super("");
		this.setStyle("-fx-background-color: #FFF200");
	}
	
	public void clicked() {
		PaintMain.currentColor = Color.YELLOW;
	}

	public void setSize(HBox colorBox) {
		colorBox.getChildren().addAll(this);
		this.prefHeight(50);
		this.prefWidth(50);
	}
}
