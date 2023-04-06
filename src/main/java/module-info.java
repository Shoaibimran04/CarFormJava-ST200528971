module com.example.carform {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.carform to javafx.fxml;
    exports com.example.carform;
}