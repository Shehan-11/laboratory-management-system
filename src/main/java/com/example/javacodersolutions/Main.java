package com.example.javacodersolutions;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {

    private static Stage stg;

    @Override
    public void start(Stage stage) throws IOException {
        stg = stage;
        stage.setResizable(false);
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("mainLoginPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Laboratory System By JavaCoder");
        stage.setScene(scene);
        stage.show();
    }

    public void changeSceneToStudentView(String fxml) throws  IOException {
        Parent pane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(fxml)));
        stg.getScene().setRoot(pane);
    }


    public static void main(String[] args) {
        launch();
    }
}