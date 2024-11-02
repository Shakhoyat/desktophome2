module com.example.demo.home2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demo.home2 to javafx.fxml;
    exports com.example.demo.home2;
}