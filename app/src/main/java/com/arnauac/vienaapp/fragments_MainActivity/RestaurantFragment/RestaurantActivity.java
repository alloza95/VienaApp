package com.arnauac.vienaapp.fragments_MainActivity.RestaurantFragment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.arnauac.vienaapp.R;

public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        TextView rName_view = findViewById(R.id.rName_view);
        TextView rStreet_view = findViewById(R.id.rStreet_view);
        TextView rNumber_view = findViewById(R.id.rNumber_view);
        TextView rCodepost_view = findViewById(R.id.rCodepostal_view);
        TextView rTown_view = findViewById(R.id.rTown_view);
        TextView rTelephon_view = findViewById(R.id.rTelephon_view);
        TextView rHorary_view = findViewById(R.id.rHoraryDescription_view);
        TextView rDescription_view = findViewById(R.id.rDescription_view);

        RestaurantItem restaurant = (RestaurantItem) getIntent().getSerializableExtra("itemRestaurant");

        rName_view.setText(restaurant.nameRestaurant);
        rStreet_view.setText(restaurant.streetRestaurant + ", ");
        rNumber_view.setText(restaurant.numberRestaurant);
        rCodepost_view.setText(restaurant.codepostRestaurant + ", ");
        rTown_view.setText(restaurant.townRestaurant);
        rTelephon_view.setText(restaurant.telephonRestaurant);
        rHorary_view.setText(restaurant.horaryRestaurant);
        rDescription_view.setText(restaurant.descriptionRestaurant);
    }
}
