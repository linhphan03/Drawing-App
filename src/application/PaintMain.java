package application;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.effect.Light.Point;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PaintMain extends Application {
	Stage window;
	static Shapes currentShape = new Shapes();
	static Color currentColor = Color.BLACK;
	ArrayList<Shapes> paints = new ArrayList<>();
	
	public static void main(String[]args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws FileNotFoundException {
		window = primaryStage;
		window.setTitle("Paint");
		BorderPane myPaint = new BorderPane();
		
		GridPane tool = new GridPane();
		//Create a pane to store shapes
		GridPane shapeBox = new GridPane();
		shapeBox.setPadding(new Insets(10, 10, 10, 10));
		shapeBox.setHgap(10);
		shapeBox.setVgap(10);
		//init shapes
		ShapeButton.shapeList(shapeBox);
		GridPane.setConstraints(shapeBox, 0, 0);

		//Create a pane to store border colors
		GridPane borderColorBox = new GridPane();
		borderColorBox.setPadding(new Insets(10, 10, 10, 10));
		borderColorBox.setHgap(10);
		borderColorBox.setVgap(10);
		BorderColorButton.borderColorList(borderColorBox);
		GridPane.setConstraints(borderColorBox, 1, 0);
		
		tool.getChildren().addAll(shapeBox, borderColorBox);
		myPaint.setTop(tool);
		
		FlowPane canvasPane = new FlowPane();
		canvasPane.setStyle("-fx-background-color: #FFFFFF");
		Canvas canvas = new Canvas(1200, 600);	
		canvasPane.getChildren().add(canvas);
		myPaint.setBottom(canvasPane);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		
		canvas.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				currentShape = currentShape.createNewShape();
				currentShape.setStart(e.getX(), e.getY());
			}
		});
		
		canvas.addEventHandler(MouseEvent.MOUSE_DRAGGED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
				
				for (Shapes shape : paints) {
					shape.draw(gc);
				}
				
				currentShape = currentShape.createNewShape(currentShape.getStart(), 
															new Point(e.getX(), e.getY(), 0, currentColor), currentColor);
				currentShape.draw(gc);
			}
		});
		
		canvas.addEventHandler(MouseEvent.MOUSE_RELEASED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				System.out.println(currentColor);
				currentShape = currentShape.createNewShape(currentShape.getStart(), 
															new Point(e.getX(), e.getY(), 0, currentColor), currentColor);
				paints.add(currentShape);
			}	
		});
		
		Scene scene = new Scene(myPaint, 1200, 700);
		scene.getStylesheets().add(this.getClass().getResource("color.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
