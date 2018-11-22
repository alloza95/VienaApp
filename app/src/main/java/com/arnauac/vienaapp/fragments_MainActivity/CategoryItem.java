package com.arnauac.vienaapp.fragments_MainActivity;

public class CategoryItem {
    private String nameCategory;
    private int imageCategory;

    public CategoryItem(String nameCategory, int image) {
        this.nameCategory = nameCategory;
        this.imageCategory = image;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public int getImageCategory() {
        return imageCategory;
    }

    public void setImageCategory(int imageCategory) {
        this.imageCategory = imageCategory;
    }
}
