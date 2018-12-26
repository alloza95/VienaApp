package com.arnauac.vienaapp.ProductActivity;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import com.arnauac.vienaapp.ProductActivity.ProductItem;
import com.arnauac.vienaapp.R;

class ProductItemHolder extends RecyclerView.ViewHolder{
    private TextView nameProduct_view;
    private ImageView imageProduct_view;

    ProductItemHolder(View itemView, final ProductItemAdapter.OnClickListener onClickListener) {
        super(itemView);
        nameProduct_view = itemView.findViewById(R.id.productName_view);
        imageProduct_view = itemView.findViewById(R.id.productImage_view);
        imageProduct_view.setScaleType(ImageView.ScaleType.CENTER_CROP);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onClickListener != null) {
                    int pos = getAdapterPosition();
                    onClickListener.onClick(pos);
                }
            }
        });
    }

    void bind(ProductItem item){
        nameProduct_view.setText(item.getNameProduct());
        Glide
                .with(imageProduct_view.getContext())
                .load(item.getImageProduct())
                .apply(new RequestOptions().override(575,345).fitCenter())
                .into(imageProduct_view);
    }
}



