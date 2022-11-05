package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import model.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductDetailsController {

    @FXML
    private AnchorPane RenderDetail;

    @FXML
    private ImageView productImage;

    @FXML
    private Label productPrice;
    @FXML
    private HBox hboxDetails;


    @FXML
    private Label productTitle;

    @FXML

    private TextField Quality;

    @FXML
    private Button minusBtn;

    @FXML
    private Button plusBtn;
    @FXML
    private HBox colorHbox;
    @FXML
    private AnchorPane laptop;
    @FXML
    private HBox ramHbox;

    @FXML
    private HBox storageHBox;
    private Product newProduct;

    //render Product Details View
    public void SwitchScreenDetails(Product product) throws IOException {
        Map<String, String> pathScreen = new HashMap<>();
        pathScreen.put("laptop","/view/laptopDetail.fxml");
        pathScreen.put("SmartPhone","/view/laptopDetail.fxml");
        pathScreen.put("keyboard","/view/keyboardDetail.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader();
        switch (product.getCategory()){
            case  "laptop":
                fxmlLoader.setLocation(getClass().getResource(pathScreen.get("laptop")));
                AnchorPane anchorPane= fxmlLoader.load();
                laptopDetails laptopDetails =fxmlLoader.getController();
                laptopDetails.setData(product);
                hboxDetails.getChildren().add(anchorPane);
                break;
            case  "keyboard":
                fxmlLoader.setLocation(getClass().getResource(pathScreen.get("keyboard")));
                AnchorPane anchorPane1= fxmlLoader.load();
                hboxDetails.getChildren().add(anchorPane1);
                break;
            default:
                System.out.printf("Code sai roi leu leu");
        }
    }

    //render product Details data
    public void setData(Product newProduct) throws IOException {
        productTitle.setText(newProduct.getName());
        Image newImage = new Image(getClass().getResourceAsStream(newProduct.getImgSrc()));
        productImage.setImage(newImage);
        SwitchScreenDetails(newProduct);
    }
    //back to Shop
    public void backToShop(ActionEvent e)throws IOException{
        Stage stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        stage.centerOnScreen();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/view-product.fxml"));
        Parent AccountViewParent = loader.load();
        Scene scene = new Scene(AccountViewParent);
        stage.setScene(scene);
    }



}
