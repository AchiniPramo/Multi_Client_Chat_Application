package org.example.multi_client_chat_application.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {

    @FXML
    private Button btnLogin;

    @FXML
    private TextField loginTextField;

    @FXML
    private Text textUserName;

    @FXML
    void btnLoginOnAction(ActionEvent event) throws IOException {
        Stage primaryStage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/ClientForm.fxml"));

        ClientFormController controller = new ClientFormController();
        fxmlLoader.setController(controller);

        primaryStage.setScene(new Scene(fxmlLoader.load()));
        primaryStage.setTitle(textUserName.getText());
        primaryStage.setResizable(false);
        primaryStage.centerOnScreen();
        primaryStage.setOnCloseRequest(windowEvent -> {
        });
        primaryStage.show();

    }
}

