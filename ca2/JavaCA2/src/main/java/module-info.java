module org.example.javaca2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.javaca2 to javafx.fxml;
    exports org.example.javaca2;
}