package com.arnauac.vienaapp.fragments_MainActivity;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.arnauac.vienaapp.R;

public class CategoryItemHolder extends RecyclerView.ViewHolder{
    private TextView nameCategory_view;
    private ImageView imageCategory_view;

    public CategoryItemHolder(View itemView) {
        super(itemView);
        nameCategory_view = itemView.findViewById(R.id.categoryName_view);
        imageCategory_view = itemView.findViewById(R.id.categoryImage_view);
        imageCategory_view.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    void bind(CategoryItem item){
        nameCategory_view.setText(item.getNameCategory());
        imageCategory_view.setImageResource(item.getImageCategory());
    }

}
