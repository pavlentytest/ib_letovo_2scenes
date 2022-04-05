package com.example.demo9;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button button2, button3;

    @FXML
    private TextField email;

    @FXML
    private Label textError;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void doSwitch(ActionEvent event) throws IOException {
        Stage stage;
        Parent root;

        String e = email.getText();

        // if

        textError.setText("Error!");
/*
        if(event.getSource() == button2) {
            stage = (Stage)button2.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("result_form.fxml"));
        } else {
            stage = (Stage)button3.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("signin_form.fxml"));
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

 */
    }

}