package org.example.javafxlearning;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
public class HelloController {
//    @FXML
//    private Circle myCircle;
//    private double x;
//    private double y;
//
//    public void up(ActionEvent e) {
//        //System.out.println("UP");
//        myCircle.setCenterY(y-=10);
//    }
//    public void down(ActionEvent e) {
//        //System.out.println("DOWN");
//        myCircle.setCenterY(y+=10);
//    }
//    public void left(ActionEvent e) {
//        //System.out.println("LEFT");
//        myCircle.setCenterX(x-=10);
//    }
//    public void right(ActionEvent e) {
//        //System.out.println("RIGHT");
//        myCircle.setCenterX(x+=10);
//    }

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToScene1(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToScene2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


}