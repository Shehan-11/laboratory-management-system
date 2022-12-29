package com.example.javacodersolutions;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class StudentView {

    @FXML
    private Button backButton;

    @FXML
    private Button chemicalsButton;

    @FXML
    private Button equipmentsButton;

    @FXML
    void backButtonClick(ActionEvent event) throws IOException {

        Object root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("mainLoginPage.fxml")));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene((Parent) root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void equipmentsButtonClick(ActionEvent event) throws IOException {

        Object root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("viewItemsEquipments.fxml")));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene((Parent) root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void chemicalsButtonClick(ActionEvent event) throws IOException {

        Object root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("viewItemsChemicals.fxml")));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene((Parent) root);
        stage.setScene(scene);
        stage.show();

    }

}
