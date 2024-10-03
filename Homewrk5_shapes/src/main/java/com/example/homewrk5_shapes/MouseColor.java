package com.example.homewrk5_shapes;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MouseColor extends Application {
    public MouseColor() {
    }

    public void start(final Stage stage) {
        Pane pane = new Pane();
        Button mousechange = new Button("Change Color");
        Circle circle = new Circle();
        circle.setRadius(50);
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));
        mousechange.setOnMousePressed(new EventHandler<MouseEvent>(){
            public void handle(MouseEvent event) {

                circle.setFill(Color.WHITE);

            }
        });
        mousechange.setOnMouseReleased(new EventHandler<MouseEvent>(){
            public void handle(MouseEvent event) {
                circle.setFill(Color.BLACK);
            }
        });
        pane.getChildren().addAll(new Node[]{mousechange, circle});
        Scene scene = new Scene(pane, 500.0, 500.0);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}