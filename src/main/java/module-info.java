module com.example.javacodersolutions {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javacodersolutions to javafx.fxml;
    exports com.example.javacodersolutions;
}