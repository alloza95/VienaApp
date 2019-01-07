package com.arnauac.vienaapp.ProductActivity;

public class ProductItem {
    private String nameProduct, imageProduct;

    public ProductItem() {
    }

    public ProductItem(String nameProduct, String imageProduct) {
        this.nameProduct = nameProduct;
        this.imageProduct = imageProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public String getImageProduct() {
        return imageProduct;
    }
}
