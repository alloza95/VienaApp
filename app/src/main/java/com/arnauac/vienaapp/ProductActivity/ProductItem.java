package com.arnauac.vienaapp.ProductActivity;

import java.io.Serializable;

public class ProductItem implements Serializable {
    private String nameProduct, imageProduct, subtitleProduct, descriptionProduct;

    public ProductItem() {
    }

    public ProductItem(String nameProduct, String imageProduct, String subtitleProduct, String descriptionProduct) {
        this.nameProduct = nameProduct;
        this.imageProduct = imageProduct;
        this.subtitleProduct = subtitleProduct;
        this.descriptionProduct = descriptionProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public String getImageProduct() {
        return imageProduct;
    }

    public String getSubtitleProduct() {
        return subtitleProduct;
    }

    public String getDescriptionProduct() {
        return descriptionProduct;
    }
}
