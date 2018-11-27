package com.arnauac.vienaapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductItemHolder extends RecyclerView.ViewHolder{
    private TextView nameProduct_view;
    private ImageView imageProduct_view;

    public ProductItemHolder(View itemView) {
        super(itemView);
        nameProduct_view = itemView.findViewById(R.id.productName_view);
        imageProduct_view = itemView.findViewById(R.id.productImage_view);
        imageProduct_view.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    void bind(ProductItem item){
        nameProduct_view.setText(item.getNameProduct());
        imageProduct_view.setImageResource(item.getImageProduct());
    }
}