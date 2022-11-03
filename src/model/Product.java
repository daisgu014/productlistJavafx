package model;

import java.util.ArrayList;

public class Product {
    private String name;
    private String imgSrc;
    private double price;

    private String category;
    private String description;
    private String cpu;
    private ArrayList<String> ram;
    private ArrayList<String> colors;

    public Product() {
    }

    public Product(String name, String imgSrc, double price,String category, String description, String cpu, ArrayList<String> ram, ArrayList<String> colors) {
        this.name = name;
        this.imgSrc = imgSrc;
        this.price = price;
        this.category = category;
        this.description = description;
        this.cpu = cpu;
        this.ram = ram;
        this.colors = colors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public ArrayList<String> getRam() {
        return ram;
    }

    public void setRam(ArrayList<String> ram) {
        this.ram = ram;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
}
