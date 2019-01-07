package com.arnauac.vienaapp.ProductActivity;

import java.io.Serializable;

public class ProductItem implements Serializable {
    private String nameProduct, imageProduct, subtitleProduct, descriptionProduct;

    public ProductItem() {
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
