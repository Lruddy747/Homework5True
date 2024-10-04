package com.example.homewrk5_shapes;

import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Slider;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class SliderController{


    @FXML
    Slider redSlider;
    @FXML
    Slider GreenSlider;
    @FXML
    Slider BlueSlider;
    @FXML
    Slider opacitySlider;

    @FXML
    Button changeColor;

    @FXML
    TextField myTextField;




    public void changeColor(ActionEvent event) {


        int red = (int)redSlider.getValue();
        int green = (int)GreenSlider.getValue();
        int blue = (int)BlueSlider.getValue();


        myTextField.setStyle(String.format("-fx-text-fill: rgb(%d, %d, %d);", red, green, blue));
        myTextField.setOpacity(opacitySlider.getValue());
    }



}
