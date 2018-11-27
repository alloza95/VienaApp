package com.arnauac.vienaapp.fragments_MainActivity;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.arnauac.vienaapp.R;

public class RestaurantItemHolder extends RecyclerView.ViewHolder {
    private TextView nameRestaurant_view, streetRestaurant_view, numberRestaurant_view, codepostRestaurant_view, townRestaurant_view;

    public RestaurantItemHolder(View itemView) {
        super(itemView);
        nameRestaurant_view = itemView.findViewById(R.id.nameRestaurant_view);
        streetRestaurant_view = itemView.findViewById(R.id.streetRestaurant_view);
        numberRestaurant_view = itemView.findViewById(R.id.numberRestaurant_view);
        codepostRestaurant_view = itemView.findViewById(R.id.codepostRestaurant_view);
        townRestaurant_view = itemView.findViewById(R.id.townRestaurant_view);
    }

    public void bind(RestaurantItem item) {
        nameRestaurant_view.setText(item.getNameRestaurant());
        streetRestaurant_view.setText(item.getStreetRestaurant());
        numberRestaurant_view.setText(item.getNumberRestaurant());
        codepostRestaurant_view.setText(item.getCodepostRestaurant());
        townRestaurant_view.setText(item.getTownRestaurant());
    }
}
