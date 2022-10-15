package model;

public class Category {
    private String name;
    private String imageCategory;

    public Category() {
    }

    public Category(String name, String imageCategory) {
        this.name = name;
        this.imageCategory = imageCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageCategory() {
        return imageCategory;
    }

    public void setImageCategory(String imageCategory) {
        this.imageCategory = imageCategory;
    }
}
