package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Etiqueta:");
        TextField textField = new TextField();
        Button button = new Button("Enviar");
        button.setOnAction(event -> label.setText(textField.getText()));
                VBox vbox = new VBox(label, textField, button);
        Scene scene = new Scene(vbox, 300, 200);

        primaryStage.setTitle("Ejemplo de setText de JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
