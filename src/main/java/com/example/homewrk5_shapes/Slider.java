package com.example.homewrk5_shapes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;


public class Slider extends Application {
    @Override
    public void start(Stage stage) throws Exception {

            FXMLLoader load = new FXMLLoader(Slider.class.getResource("Main.fxml"));





            Parent root = load.load();
            Scene scene = new Scene(root, 500, 500);
            stage.setScene(scene);
            stage.show();

        }

        public static void main(String[] args) {
        launch(args);
        }

    }


