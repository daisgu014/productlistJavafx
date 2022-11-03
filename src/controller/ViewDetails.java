package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ViewDetails {
    @FXML

    private TextField Quality;

    @FXML
    private Button minusBtn;

    @FXML
    private Button plusBtn;
    //plusBtn
    public void Plus(ActionEvent e) {
        if (Quality.getText().equalsIgnoreCase("")) {
            Quality.setText("1");
        }
        int inputValue = Integer.parseInt(Quality.getText());
        inputValue += 1;
        Quality.setText(String.valueOf(inputValue));

    }
    //minusBtn
    public void Minus(ActionEvent e){
        int inputValue = Integer.parseInt(Quality.getText());
        if(inputValue>1){
            inputValue-=1;
            Quality.setText(String.valueOf(inputValue));
        }
    }
    public void renderLaptopDetails(Product newProduct){
        List<String> ramList = new ArrayList<String>();


    }
    public void renderKeyboardDetails(Product newProduct){

    }
    public void renderHeadphoneDetails(Product newProduct){

    }
    public void renderSmartwatchDetails(Product newProduct){

    }
}
