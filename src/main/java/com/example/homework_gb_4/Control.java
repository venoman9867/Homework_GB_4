package com.example.homework_gb_4;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Control {

    @FXML
    private TextArea mainTextArea;

    @FXML
    private TextField message;

    @FXML
    public void send(ActionEvent actionEvent){
        if(!message.getText().trim().isEmpty()){
            mainTextArea.appendText(message.getText()+"\n");
            message.clear();
        }
    }

    @FXML
    void initialize() {

    }
}
