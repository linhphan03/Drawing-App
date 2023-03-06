package application;

import java.util.ArrayList;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class OpenBox {
	public static void display() {
		Stage window = new Stage();
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle("Open");
		
		Label label = new Label("File name");
		TextField fileNameInput = new TextField("*.txt");
				
		Button openButton = new Button("Open");
		openButton.setOnAction(e -> {
			PaintMain.paints = new ArrayList<Shapes>();
			PaintFile.readFile(fileNameInput.getText());
			window.close();
		});
		
		HBox saveLabel = new HBox();
		saveLabel.setSpacing(20);
		saveLabel.setPadding(new Insets(20, 20, 20, 20));
		saveLabel.getChildren().addAll(label, fileNameInput);
		
		VBox layout = new VBox();
		layout.setSpacing(20);
		layout.setPadding(new Insets(20, 20, 20, 20));
		layout.getChildren().addAll(saveLabel, openButton);
		layout.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(layout, 300, 200);
		window.setScene(scene);
		window.showAndWait();
	}
}
