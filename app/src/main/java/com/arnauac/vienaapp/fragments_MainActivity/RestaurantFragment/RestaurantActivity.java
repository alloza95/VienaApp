package com.arnauac.vienaapp.fragments_MainActivity.RestaurantFragment;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.arnauac.vienaapp.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class RestaurantActivity extends AppCompatActivity {

    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        ImageView btn_back = findViewById(R.id.btn_back);

        TextView rName_view = findViewById(R.id.rName_view);
        TextView rStreet_view = findViewById(R.id.rStreet_view);
        TextView rNumber_view = findViewById(R.id.rNumber_view);
        TextView rCodepost_view = findViewById(R.id.rCodepostal_view);
        TextView rTown_view = findViewById(R.id.rTown_view);
        TextView rTelephon_view = findViewById(R.id.rTelephon_view);
        TextView rHorary_view = findViewById(R.id.rHoraryDescription_view);
        TextView rDescription_view = findViewById(R.id.rDescription_view);
        ImageView rImage_view = findViewById(R.id.rImage_view);
        linearLayout = findViewById(R.id.services_linearLayout);

        RestaurantItem restaurant = (RestaurantItem) getIntent().getSerializableExtra("itemRestaurant");

        rName_view.setText(restaurant.nameRestaurant);
        rStreet_view.setText(restaurant.streetRestaurant + ", ");
        rNumber_view.setText(restaurant.numberRestaurant);
        rCodepost_view.setText(restaurant.codepostRestaurant + ", ");
        rTown_view.setText(restaurant.townRestaurant);
        rTelephon_view.setText(restaurant.telephonRestaurant);
        rHorary_view.setText(restaurant.horaryRestaurant);
        rDescription_view.setText(restaurant.descriptionRestaurant);
        Glide.with(this).load(restaurant.imageRestaurant).apply(RequestOptions.centerCropTransform()).into(rImage_view);

        linearLayout.removeAllViewsInLayout();

        if (restaurant.getServices().getWifi()){
            createIcon(R.drawable.ic_wifi_connection_signal_symbol, "WIFI");
        }
        if (restaurant.getServices().getTerrace()){
            createIcon(R.drawable.ic_sun, "TERRASSA");
        }
        if (restaurant.getServices().getAutoViena()){
            createIcon(R.drawable.ic_car_fill_from_frontal_view, "AUTOVIENA");
        }
        if (restaurant.getServices().getParking()){
            createIcon(R.drawable.ic_parking, "PARKING");
        }
        if (restaurant.getServices().getPlayground()){
            createIcon(R.drawable.ic_playground, "PARC INFANTIL");
        }

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void createIcon(int image, String text) {

        //LinearLayout vertical
        LinearLayout vertical_LinearLayout = new LinearLayout(this);
        LinearLayout.LayoutParams verLayoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        verLayoutParams.weight = 1;
        vertical_LinearLayout.setLayoutParams(verLayoutParams);
        vertical_LinearLayout.setOrientation(LinearLayout.VERTICAL);

        //icone
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(image);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(70, 70);
        layoutParams.gravity = Gravity.CENTER;
        imageView.setColorFilter(ContextCompat.getColor(this, R.color.colorPrimary), PorterDuff.Mode.SRC_IN);
        imageView.setLayoutParams(layoutParams);

        //text
        TextView textView = new TextView(this);
        textView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        textView.setGravity(Gravity.CENTER);
        textView.setText(text);
        textView.setTextColor(ContextCompat.getColor(this, R.color.colorPrimary));
        textView.setTextSize(10);

        //Afegim icone i text al LinearLayout vertical
        vertical_LinearLayout.addView(imageView);
        vertical_LinearLayout.addView(textView);

        //Afegim el LinearLayout vertical al LinearLayout principal
        linearLayout.addView(vertical_LinearLayout);
    }
}
