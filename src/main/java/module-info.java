module com.example.pvz {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pvz to javafx.fxml;
    exports com.example.pvz;
}