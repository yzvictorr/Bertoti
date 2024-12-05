module com.example.bertoti {
    requires javafx.controls;
    requires javafx.fxml;
    requires telegrambots.meta;
    requires telegrambots;


    opens com.example.bertoti to javafx.fxml;
    exports com.example.bertoti;
}