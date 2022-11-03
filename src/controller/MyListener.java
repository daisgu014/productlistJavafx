package controller;

import javafx.event.ActionEvent;
import model.Product;

import java.io.IOException;

public interface MyListener {
    public void onClick(Product product) throws IOException;
}
