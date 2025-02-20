package org.example.simplebrowser;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Window;
import javax.sql.rowset.WebRowSet;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private WebView webView;
    @FXML
    private TextField txtFeild;

    @FXML
    private WebEngine Engine;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Engine = webView.getEngine();
    }

    public void onLoad(){

    }
}