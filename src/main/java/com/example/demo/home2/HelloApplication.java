package com.example.demo.home2;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
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
       root.setSpacing(10);
       Label label = new Label("Click the Button");
       Button button = new Button("Click me");
       button.setPrefWidth(100);
       button.setPadding(new Insets(10, 10, 10, 40));
       root.getChildren().addAll(label, button);
       Scene scene = new Scene(root,500,450);
        stage.setScene(scene);
        stage.setTitle("Event");
        stage.show();
 }

 public static void main(String[] args) {launch();}

}