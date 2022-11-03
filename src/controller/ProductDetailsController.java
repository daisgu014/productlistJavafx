package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import model.Product;

import java.io.IOException;
import java.util.HashMap;
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
    private Product newProduct;

    //render Product Details View
    public void SwitchScreenDetails(String category) throws IOException {
        Map<String, String> pathScreen = new HashMap<>();
        pathScreen.put("laptop","/view/laptopDetail.fxml");
        pathScreen.put("keybroad","/view/keybroadDetals.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader();
        switch (category){
            case  "laptop":
                fxmlLoader.setLocation(getClass().getResource(pathScreen.get("laptop")));
                break;
            case  "keybroad":
                fxmlLoader.setLocation(getClass().getResource(pathScreen.get("keybroad")));
                break;
            default:
                System.out.printf("Code sai roi leu leu");
        }
        AnchorPane details =fxmlLoader.load();
       hboxDetails.getChildren().add(details);
    }

    //render product Details data
    public void setData(Product newProduct) throws IOException {
        productTitle.setText(newProduct.getName());
        Image newImage = new Image(getClass().getResourceAsStream(newProduct.getImgSrc()));
        productImage.setImage(newImage);
        SwitchScreenDetails(newProduct.getCategory());
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
