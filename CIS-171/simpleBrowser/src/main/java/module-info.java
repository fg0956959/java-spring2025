module org.example.simplebrowser {
    requires javafx.web;
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql.rowset;



    opens org.example.simplebrowser to javafx.fxml;
    exports org.example.simplebrowser;
}