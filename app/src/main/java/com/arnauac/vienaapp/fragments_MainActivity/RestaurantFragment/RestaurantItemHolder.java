package com.arnauac.vienaapp.fragments_MainActivity.RestaurantFragment;

import android.graphics.PorterDuff;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.arnauac.vienaapp.R;

class RestaurantItemHolder extends RecyclerView.ViewHolder {
    private TextView nameRestaurant_view, streetRestaurant_view, numberRestaurant_view, codepostRestaurant_view, townRestaurant_view;
    private LinearLayout linearLayout;

    RestaurantItemHolder(View itemView, final RestaurantItemAdapter.OnClickListener onClickListener) {
        super(itemView);
        nameRestaurant_view = itemView.findViewById(R.id.nameRestaurant_view);
        streetRestaurant_view = itemView.findViewById(R.id.streetRestaurant_view);
        numberRestaurant_view = itemView.findViewById(R.id.numberRestaurant_view);
        codepostRestaurant_view = itemView.findViewById(R.id.codepostRestaurant_view);
        townRestaurant_view = itemView.findViewById(R.id.townRestaurant_view);

        linearLayout = itemView.findViewById(R.id.icons_linearLayout);
        
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

    void bind(RestaurantItem item) {
        String street = item.getStreetRestaurant() + ", ";
        String codepostal = item.getCodepostRestaurant() + ", ";
        nameRestaurant_view.setText(item.getNameRestaurant());
        streetRestaurant_view.setText(street);
        numberRestaurant_view.setText(item.getNumberRestaurant());
        codepostRestaurant_view.setText(codepostal);
        townRestaurant_view.setText(item.getTownRestaurant());

        if (item.getServices().getWifi()){
            createIcon(R.drawable.ic_wifi_connection_signal_symbol);
        }
        if (item.getServices().getTerrace()){
            createIcon(R.drawable.ic_sun);
        }
        if (item.getServices().getAutoViena()){
            createIcon(R.drawable.ic_car_fill_from_frontal_view);
        }
        if (item.getServices().getParking()){
            createIcon(R.drawable.ic_parking);
        }
        if (item.getServices().getPlayground()){
            createIcon(R.drawable.ic_playground);
        }
    }

    private void createIcon(int image) {
        ImageView imageView = new ImageView(this.linearLayout.getContext());
        imageView.setImageResource(image);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(70, 70);
        layoutParams.setMargins(0,0,100,0);
        layoutParams.gravity = Gravity.CENTER;
        imageView.setColorFilter(ContextCompat.getColor(this.linearLayout.getContext(), R.color.colorPrimary), PorterDuff.Mode.SRC_IN);
        imageView.setLayoutParams(layoutParams);

        linearLayout.addView(imageView);
    }
}
