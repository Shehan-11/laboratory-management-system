package com.example.javacodersolutions;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class adminEditData {

    @FXML
    private TextField ChemNumberOfItems;

    @FXML
    private TextField ChemicalNameEnter;

    @FXML
    private Button EnterItemsChem;

    @FXML
    private Button EnterItemsEqu;

    @FXML
    private TextField EquNumberOfItems;

    @FXML
    private TextField EquipmentNameEnter;

    @FXML
    private Button backButton;

    @FXML
    void EnterItemsChemClick(ActionEvent event) {

    }

    @FXML
    void EnterItemsEquClick(ActionEvent event) {
    }

    @FXML
    void backButtonClick(ActionEvent event)  throws IOException {

        Object root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("mainLoginPage.fxml")));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene((Parent) root);
        stage.setScene(scene);
        stage.show();

    }

}
