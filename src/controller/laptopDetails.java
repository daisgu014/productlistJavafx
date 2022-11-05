package controller;

import controller.view.Component.Component;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import model.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class laptopDetails {

    @FXML
    private Label ProductPrice;

    @FXML
    private TextField Quality;

    @FXML
    private HBox colorHbox;

    @FXML
    private TextArea drscText;

    @FXML
    private AnchorPane laptop;

    @FXML
    private Button minusBtn;

    @FXML
    private Button plusBtn;

    @FXML
    private Label productTilte;

    @FXML
    private HBox renderHB;

    @FXML
    private HBox storageHB;
    ToggleGroup ramTG = new ToggleGroup();
    ToggleGroup StorageTG = new ToggleGroup();
    ToggleGroup colorTG = new ToggleGroup();
    Component component = new Component();
    public void setData(Product product){
        productTilte.setText(product.getName());
        List<String> ramList = new ArrayList<String>();
        ramList.add("2GB");
        ramList.add("4GB");
        ramList.add("8GB");
        List<String> storageList = new ArrayList<String>();
        storageList.add("256GB");
        storageList.add("512GB");
        storageList.add("1TB");
        List<String> colorList = new ArrayList<String>();
        colorList.add("#2f3640");
        colorList.add("#fbc531");
        colorList.add("#dcdde1");
        colorList.add("#f5f6fa");
        Map<String, String> colors = new HashMap<String, String>();
        colors.put("den","#2f3640");
        colors.put("vang","#fbc531");
        colors.put("xam","#dcdde1");
        colors.put("bac","#f5f6fa");

        for (int i = 0; i < ramList.size(); i++) {
            renderHB.getChildren().add(component.cusTomRB(ramList.get(i),ramTG));
        }
        for (int i = 0; i < storageList.size(); i++) {
            storageHB.getChildren().add(component.cusTomRB(storageList.get(i), StorageTG));
        }
        for (int i = 0; i < colorList.size(); i++) {
            colorHbox.getChildren().add(component.ColorRB(colorList.get(i),colorTG));
        }
        renderHB.setOnMouseClicked(e->{
            System.out.printf(ramTG.getSelectedToggle().toString());
        });

    }

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
    public void Minus(ActionEvent e) {
        int inputValue = Integer.parseInt(Quality.getText());
        if (inputValue > 1) {
            inputValue -= 1;
            Quality.setText(String.valueOf(inputValue));
        }
    }


}