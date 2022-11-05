package controller.view.Component;

import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class Component {
    public  RadioButton cusTomRB (String ram, ToggleGroup ramTG){
        RadioButton ramItem = new RadioButton(ram);
        ramItem.setToggleGroup(ramTG);
        ramItem.getStyleClass().remove("radio-button");
        ramItem.setId("ramBT");
        ramItem.getStylesheets().add("/view/css/detailItem.css");
        return ramItem;
    }
    public RadioButton ColorRB (String color , ToggleGroup colorTG){
        RadioButton colorItem = new RadioButton();
        colorItem.setToggleGroup(colorTG);
        colorItem.setStyle("-fx-background-color:"+color+"; \n");
        colorItem.getStyleClass().remove("radio-button");
        colorItem.setId("colorBT");
        colorItem.getStylesheets().add("/view/css/detailItem.css");
        return colorItem;
    }
}
