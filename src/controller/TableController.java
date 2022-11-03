package controller;

import de.jensd.fx.glyphs.GlyphsDude;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.util.Callback;
import model.Product;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ResourceBundle;

public class TableController  implements Initializable {

    @FXML
    private TableView<Product> Table;

    @FXML
    private TableColumn<Product, String> color;

    @FXML
    private TableColumn<Product, String> cpu;

    @FXML
    private TableColumn<Product, String> edit;

    @FXML
    private TableColumn<Product, String> id;

    @FXML
    private TableColumn<Product, String> name;

    @FXML
    private TableColumn<Product, String> ram;
    ObservableList<Product> products = FXCollections.observableArrayList();
    private List<Product> productList(){
        List<Product> list = new ArrayList<Product>();
        Product product;
        product = new Product();
        product.setName("Iphone 12");
        product.setCpu("Apple A gi gi do");
        list.add(product);
        return list;
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        loadData();
    }

    private void loadData() {
        products = FXCollections.observableList(productList());
        Table.setItems(products);
        id.setCellValueFactory(new PropertyValueFactory<>("name"));
        color.setCellValueFactory(new PropertyValueFactory<>("name"));
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        cpu.setCellValueFactory(new PropertyValueFactory<>("cpu"));
        TableColumn<Product,Product> editCl = new TableColumn<>("Hello");
        editCl.setCellValueFactory(
                param->new ReadOnlyObjectWrapper<>(param.getValue())
        );
        editCl.setCellFactory(param-> new TableCell<Product, Product>(){
            private final Button button = new Button("Save");

            protected void updateItem(Product product, boolean empty) {
                super.updateItem(product, empty);
                if(product==null){
                    setGraphic(null);
                    return;
                }else{
                    setGraphic(button);
                }
            }

        });
        } ;



}
