package com.arnauac.vienaapp.ProductActivity;

public class ProductItem {
    private String nameProduct;
    private int imageProduct;

    public ProductItem(String nameProduct, int image) {
        this.nameProduct = nameProduct;
        this.imageProduct = image;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getImageProduct() {
        return imageProduct;
    }

    public void setImageProduct(int imageProduct) {
        this.imageProduct = imageProduct;
    }
}
