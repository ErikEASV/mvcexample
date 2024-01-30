module com.example.mvcexample {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mvcexample to javafx.fxml;
    exports com.example.mvcexample;
}