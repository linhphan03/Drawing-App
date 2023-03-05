package application;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Line;

public class ShapeButton extends Button {
//	protected String name;
	
	public ShapeButton() {
		this.setStyle("-fx-background-color: #ACBFBF; -fx-text-fill: #000000; -fx-font-size: 20px");
		this.setHeight(50);
		this.setWidth(50);
	}
		
	public void clicked() {}
	
	public static void shapeList(GridPane shapeBox) {
		LineButton lineButton = new LineButton();
		GridPane.setConstraints(lineButton, 1, 0);
		lineButton.setOnAction(e -> {
			lineButton.clicked();
		});
		
		RectangleButton rectangleButton = new RectangleButton();
		GridPane.setConstraints(rectangleButton, 2, 0);
		rectangleButton.setOnAction(e -> {
			rectangleButton.clicked();
		});
		
		CircleButton circleButton = new CircleButton();
		GridPane.setConstraints(circleButton, 3, 0);
		circleButton.setOnAction(e -> {
			circleButton.clicked();
		});
		
		Button shapeLabel = new Button("Shapes");
		shapeLabel.setStyle("-fx-font-size: 10pt; -fx-background-color: white; -fx-font-color: black");
		GridPane.setConstraints(shapeLabel, 0, 0);
		
		Line first = new Line(100, 0, 100, 100);
		first.setStyle("-fx-stroke: #444747");
		GridPane.setConstraints(first, 4, 0);
		
		shapeBox.getChildren().addAll(first, shapeLabel, lineButton, rectangleButton, circleButton);
	}
}
