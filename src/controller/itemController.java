package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import model.Product;
public class itemController {
    @FXML
    private ImageView imageproduct;

    @FXML
    private Label textCategory;

    @FXML
    private Label textCurrentPrice;

    @FXML
    private Label textName;

    @FXML
    private Label textPrice;

    public itemController() {
    }

    @FXML
    private void click(MouseEvent mouseEvent) {myListener.onClick(newProduct);}
    private Product newProduct;
    private MyListener myListener;
    public void setData(Product newProduct, MyListener  myListener) {
        this.newProduct = newProduct;
        this.myListener = myListener;
        Image newImage = new Image(getClass().getResourceAsStream(newProduct.getImgSrc()));
        imageproduct.setImage(newImage);
        textCategory.setText(newProduct.getCpu());
        textName.setText(newProduct.getName());
        textCurrentPrice.setText(String.valueOf(newProduct.getPrice()));
    }
}
