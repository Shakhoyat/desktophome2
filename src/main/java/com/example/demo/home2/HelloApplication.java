package com.example.demo.home2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage)  {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(25,25,20,20));
        root.setSpacing(10);
        Label text=new Label("Hello World");
        Button button=new Button("Click me");
        button.setOnAction(event ->text.setText("Welcome on Board"));
        root.getChildren().addAll(text,button);
        Scene scene=new Scene(root,350,300);
        stage.setScene(scene);
        stage.setTitle("Hello StageTitle");
        stage.show();
 } public static void main(String[] args) {
launch();
}
}