module com.example.tasks2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tasks2 to javafx.fxml;
    exports com.example.tasks2;
}