module com.example.no2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.no2 to javafx.fxml;
    exports com.example.no2;
}