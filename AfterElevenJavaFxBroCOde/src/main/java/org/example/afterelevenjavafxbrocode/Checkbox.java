package org.example.afterelevenjavafxbrocode;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;
public class Checkbox {

    @FXML
    private CheckBox myCheckBox;

    @FXML
    private Label myLabel;

    @FXML
    protected void change() {
        if (myCheckBox.isSelected()) {
            myLabel.setText("On");
        } else {
            myLabel.setText("Off");
        }
    }


}