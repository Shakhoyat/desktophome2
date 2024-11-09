package com.example.demo.home2;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage)  {
        Group group = new Group();
        Button one=new Button("OneOneeee");
        Button two=new Button("Two");
        one.setLayoutX(15);
        one.setLayoutY(15);
        two.layoutXProperty().bind(one.layoutXProperty().add(one.widthProperty().add(10)));
        two.layoutYProperty().bind(one.layoutYProperty());
        group.setEffect(new DropShadow());
        group.setRotate(10);
        group.getChildren().addAll(one,two);
        Scene scene=new Scene(group,300,300);
        stage.setTitle("Group layout Example");
        stage.setScene(scene);
        stage.show();
 }

 public static void main(String[] args) {
        launch();
    }

}