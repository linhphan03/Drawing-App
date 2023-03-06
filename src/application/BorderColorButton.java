package application;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class BorderColorButton extends Button {
	
	public BorderColorButton(String name) {
		this.setText(name);
		this.setPrefHeight(20);
		this.setPrefWidth(30);
	}
	
	public void clicked() {}
	
	public static void borderColorList(GridPane borderColorBox) {
		BlackButton black = new BlackButton();
		GridPane.setConstraints(black, 1, 0);
		black.setOnAction(e -> {
			black.clicked();
		});
		
		GreenButton green = new GreenButton();
		GridPane.setConstraints(green, 2, 0);
		green.setOnAction(e -> {
			green.clicked();
		});
		
		BlueButton blue = new BlueButton();
		GridPane.setConstraints(blue, 3, 0);
		blue.setOnAction(e -> {
			blue.clicked();
		});
		
		RedButton red = new RedButton();
		GridPane.setConstraints(red, 4, 0);
		red.setOnAction(e -> {
			red.clicked();
		});
		
		OrangeButton orange = new OrangeButton();
		GridPane.setConstraints(orange, 5, 0);
		orange.setOnAction(e -> {
			orange.clicked();
		});
		
		YellowButton yellow = new YellowButton();
		GridPane.setConstraints(yellow, 6, 0);
		yellow.setOnAction(e -> {
			yellow.clicked();
		});
		
		Button colorLabel = new Button("Color");
		colorLabel.setStyle("-fx-font-size: 10pt; -fx-background-color: white; -fx-font-color: black");
		GridPane.setConstraints(colorLabel, 0, 0);
		
		borderColorBox.getChildren().addAll(black, green, blue, red, orange, yellow, colorLabel);
		borderColorBox.setAlignment(Pos.CENTER);
	}
}
