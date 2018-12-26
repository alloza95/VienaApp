package com.arnauac.vienaapp.fragments_MainActivity.MenuFragment;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.arnauac.vienaapp.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

class   CategoryItemHolder extends RecyclerView.ViewHolder{
    private TextView nameCategory_view;
    private ImageView imageCategory_view;

    CategoryItemHolder(View itemView, final CategoryItemAdapter.OnClickListener onClickListener) {
        super(itemView);
        nameCategory_view = itemView.findViewById(R.id.categoryName_view);
        imageCategory_view = itemView.findViewById(R.id.productImage_view);
        imageCategory_view.setScaleType(ImageView.ScaleType.CENTER_CROP);

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


    void bind(CategoryItem item){
        nameCategory_view.setText(item.getNameCategory());
        Glide
                .with(imageCategory_view.getContext())
                .load(item.getImageCategory())
                .apply(new RequestOptions().override(575,345).fitCenter())
                .into(imageCategory_view);
    }

}
