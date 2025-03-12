package org.example.javafxlearning;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

class imageView {
    @FXML
    private ImageView myImageView;
    @FXML
    private Button myButton;

    public imageView() {
        // Debugging: Check if the image file exists
        System.out.println("Loading shrek2.jpg: " + getClass().getResource("shrek2.jpg"));
    }

    private Image myImage = new Image(getClass().getResourceAsStream("shrek2.jpg"));

    public void displayImage() {
        myImageView.setImage(myImage);
    }
}