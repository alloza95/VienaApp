package com.arnauac.vienaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        //Elements Pantalla
        TextView rName_view = findViewById(R.id.rName_view);
        TextView rStreet_view = findViewById(R.id.rStreet_view);
        TextView rNumber_view = findViewById(R.id.rNumber_view);
        TextView rCodepost_view = findViewById(R.id.rCodepostal_view);
        TextView rTown_view = findViewById(R.id.rTown_view);

        Intent intent = getIntent();
        String rName = intent.getStringExtra("name");
        String rStreet = intent.getStringExtra("street") + ", ";
        String rNumber = intent.getStringExtra("number");
        String rCodepost = intent.getStringExtra("codepost") + ", ";
        String rTown = intent.getStringExtra("town");

        rName_view.setText(rName);
        rStreet_view.setText(rStreet);
        rNumber_view.setText(rNumber);
        rCodepost_view.setText(rCodepost);
        rTown_view.setText(rTown);
    }
}
