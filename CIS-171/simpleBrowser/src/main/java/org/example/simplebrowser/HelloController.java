package org.example.simplebrowser;


import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebHistory;
import javafx.scene.web.WebView;
import javafx.stage.Window;
import javax.sql.rowset.WebRowSet;
import java.net.URL;
import java.util.ResourceBundle;

/*Franklin Gainer
* 03-04-2025
* CIS 170-101
* Professor Lawrence*/

public class HelloController implements Initializable {
    @FXML
    private WebView webView;//webview val to display all our content
    @FXML
    private TextField txtFeild;//textfeild to enter in and siplay url information

    private String homePage = "https://www.google.com";//homepage string thats set to google

    private double webZoom;//zoom double that gets manipulated in the zoom in and out methods

    @FXML
    private WebEngine Engine;
    private WebHistory history;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Engine = webView.getEngine();
        txtFeild.setText(homePage);
        webZoom = 1.0;//initialize methods that sets the engine,textfeild, and webzoom double to default settings
    }

    public void onLoad()
    {
        Engine.load("https://"+txtFeild.getText());
    }//load method that load the wenpage to the users enterd link

    public void reLoad()
    {
        Engine.reload();
    }//reload method that reloads the page when then button is clicked
    public void zoomIn()
    {
        webZoom += .5;
        webView.setZoom(webZoom);
    }//zoom in method that lets users zoom in by a .5 increment
    public void zoomOut()
    {
        webZoom -= .5;
        webView.setZoom(webZoom);
    }//zoom out method that lets users zoom out by a .5 increment

    public void displayHistory()
    {
        history = Engine.getHistory();
        ObservableList<WebHistory.Entry> entries = history.getEntries();

        for(WebHistory.Entry entry : entries)
        {
            System.out.println(entry);
        }
    }//webhistroy method that displays users history. the webentries are put into a list that gets incremented and displayed in a for-loop
    public void previousPage()
    {
        history = Engine.getHistory();
        ObservableList<WebHistory.Entry> entries = history.getEntries();
        history.go(1);
        txtFeild.setText(entries.get(history.getCurrentIndex()).getUrl());
    }//previous page method that uses the same list as the history method, except it sets the webpage and the url to the previous display
    public void forward()
    {
        history = Engine.getHistory();
        ObservableList<WebHistory.Entry> entries = history.getEntries();
        history.go(-1);
        txtFeild.setText(entries.get(history.getCurrentIndex()).getUrl());
    }//forward methods that lets user go back to the page they were if they went back a page.
}