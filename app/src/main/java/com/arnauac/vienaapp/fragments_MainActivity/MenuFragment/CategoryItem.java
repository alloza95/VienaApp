package com.arnauac.vienaapp.fragments_MainActivity.MenuFragment;

class CategoryItem {
    private String nameCategory;
    private int imageCategory;

    CategoryItem(String nameCategory, int image) {
        this.nameCategory = nameCategory;
        this.imageCategory = image;
    }

    String getNameCategory() {
        return nameCategory;
    }

    int getImageCategory() {
        return imageCategory;
    }
}
