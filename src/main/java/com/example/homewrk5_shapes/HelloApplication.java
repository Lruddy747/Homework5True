package com.example.homewrk5_shapes;


import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    public HelloApplication() {
    }

    public void start(Stage stage) throws IOException {
        GridPane pane = new GridPane();
        ImageView imageView = new ImageView(new Image("C:\\Users\\lruddy\\IdeaProjects\\homework5\\src\\main\\flag1.gif"));
        ImageView imageView2 = new ImageView(new Image("C:\\Users\\lruddy\\IdeaProjects\\homework5\\src\\main\\flag2.gif"));
        ImageView imageView3 = new ImageView(new Image("C:\\Users\\lruddy\\IdeaProjects\\homework5\\src\\main\\flag6.gif"));
        ImageView imageView4 = new ImageView(new Image("C:\\Users\\lruddy\\IdeaProjects\\homework5\\src\\main\\flag7.gif"));
        pane.add(imageView, 0, 0);
        pane.add(imageView2, 0, 1);
        pane.add(imageView3, 1, 0);
        pane.add(imageView4, 1, 1);
        Scene scene = new Scene(pane, 500.0, 500.0);
        imageView.setFitWidth(pane.getWidth() / 2.0);
        imageView.setFitHeight(pane.getHeight() / 2.0);
        imageView2.setFitWidth(pane.getWidth() / 2.0);
        imageView2.setFitHeight(pane.getHeight() / 2.0);
        imageView3.setFitWidth(pane.getWidth() / 2.0);
        imageView3.setFitHeight(pane.getHeight() / 2.0);
        imageView4.setFitWidth(pane.getWidth() / 2.0);
        imageView4.setFitHeight(pane.getHeight() / 2.0);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(new String[0]);
    }
}
