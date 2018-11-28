package com.arnauac.vienaapp.fragments_MainActivity;

import android.content.Context;
import android.graphics.PorterDuff;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.arnauac.vienaapp.R;

public class ServicesItemHolder extends RecyclerView.ViewHolder {
    private LinearLayout linearLayout;

    public ServicesItemHolder(View itemView) {
        super(itemView);
        linearLayout = itemView.findViewById(R.id.icons_linearLayout);
    }

    public void bind(ServicesItem servicesItem) {
        if (servicesItem.getWifi()){
            ImageView imageView = new ImageView(this.linearLayout.getContext());
            imageView.setImageResource(R.drawable.ic_wifi_connection_signal_symbol);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(70, 70);
            layoutParams.setMargins(0,0,50,0);
            layoutParams.gravity = Gravity.CENTER;
            imageView.setColorFilter(ContextCompat.getColor(this.linearLayout.getContext(), R.color.colorPrimary), PorterDuff.Mode.SRC_IN);
            imageView.setLayoutParams(layoutParams);

            linearLayout.addView(imageView);
        }

        if (servicesItem.getTerrace()){
            ImageView imageView = new ImageView(this.linearLayout.getContext());
            imageView.setImageResource(R.drawable.ic_sun);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(70, 70);
            layoutParams.setMargins(0,0,50,0);
            layoutParams.gravity = Gravity.CENTER;
            imageView.setColorFilter(ContextCompat.getColor(this.linearLayout.getContext(), R.color.colorPrimary), PorterDuff.Mode.SRC_IN);
            imageView.setLayoutParams(layoutParams);

            linearLayout.addView(imageView);
        }

        if (servicesItem.getAutoViena()){
            ImageView imageView = new ImageView(this.linearLayout.getContext());
            imageView.setImageResource(R.drawable.ic_car_fill_from_frontal_view);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(70, 70);
            layoutParams.setMargins(0,0,50,0);
            layoutParams.gravity = Gravity.CENTER;
            imageView.setColorFilter(ContextCompat.getColor(this.linearLayout.getContext(), R.color.colorPrimary), PorterDuff.Mode.SRC_IN);
            imageView.setLayoutParams(layoutParams);

            linearLayout.addView(imageView);
        }

        if (servicesItem.getParking()){
            ImageView imageView = new ImageView(this.linearLayout.getContext());
            imageView.setImageResource(R.drawable.ic_playground);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(70, 70);
            layoutParams.setMargins(0,0,50,0);
            layoutParams.gravity = Gravity.CENTER;
            imageView.setColorFilter(ContextCompat.getColor(this.linearLayout.getContext(), R.color.colorPrimary), PorterDuff.Mode.SRC_IN);
            imageView.setLayoutParams(layoutParams);

            linearLayout.addView(imageView);
        }

    }
}
