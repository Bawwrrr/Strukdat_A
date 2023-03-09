module com.example.materi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.materi to javafx.fxml;
    exports com.example.materi;
}