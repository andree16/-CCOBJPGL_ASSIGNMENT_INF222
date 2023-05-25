package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class DrinkController {

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    Big big = new Big();
    Coffee coffee = new Coffee();
    Jungle jungle = new Jungle();
    Mountain mountain = new Mountain();
    Water water = new Water();

    public void initialize() {

       
        big.setColor("Orange");
        big.setTaste("Sweet");

        coffee.setColor("Brown");
        coffee.setTaste("Bitter");

        jungle.setColor("Violet");
        jungle.setTaste("as Sweet as Grapes");

        mountain.setColor("Green");
        mountain.setTaste("Too Sweet");

        water.setColor("Transparent");
        water.setTaste("has no Taste");

      
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Orange Juice is " + big.getColor() + " and " + big.getTaste());
        }

        if (sourceButton == btn2) {
            alert.setContentText("Coffee is " + coffee.getColor() + " and " + coffee.getTaste());
        }

        if (sourceButton == btn3) {
            alert.setContentText("Jungle Juice is " + jungle.getColor() + " and " + jungle.getTaste());
        }

        if (sourceButton == btn4) {
            alert.setContentText("Mountain Dew is " + mountain.getColor() + " and " + mountain.getTaste());
        }

        if (sourceButton == btn5) {
            alert.setContentText("Wuter is " + water.getColor() + " and " + water.getTaste());
        }
        alert.showAndWait();

    }
}