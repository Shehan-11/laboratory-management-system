package com.example.javacodersolutions;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Login {

    @FXML
    private Button GuestPreviewButton;

    @FXML
    private Button loginButton;

    @FXML
    private Label loginErrorLable;

    @FXML
    private PasswordField password;

    @FXML
    private TextField userName;

    @FXML
    void GuestPreviewButtonClick(ActionEvent event) throws IOException {

            Object root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("studentView.fxml")));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene((Parent) root);
            stage.setScene(scene);
            stage.show();
    }

    @FXML
    void userLogin(ActionEvent event) throws IOException {
        checkLogin();
    }

    public void checkLogin() throws IOException {
        Main m = new Main();
        if(userName.getText().toString().equals("AdminShehan") && password.getText().toString().equals("1234")) {
            loginErrorLable.setText("Login Success!");

            m.changeSceneToStudentView("adminEditData.fxml");

        } else if (userName.getText().isEmpty() && password.getText().isEmpty()) {
            loginErrorLable.setText("Please Enter Your Details");

        }

        else {
            loginErrorLable.setText("Incorrect User Name or Password");
        }
    }


}
