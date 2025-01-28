package org.example.multi_client_chat_application.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class ServerFormController {
    public AnchorPane pane;

    @FXML
    private Button btnAdd;

    @FXML
    void addBtnOnAction(ActionEvent event) {
        Stage stage = new Stage();
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(pane.getScene().getWindow());
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/LoginForm.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.setTitle("Chat");
        stage.centerOnScreen();
        stage.setResizable(false);
        stage.show();
    }

}


