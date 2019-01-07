package com.arnauac.vienaapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.arnauac.vienaapp.ProductActivity.ProductItem;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class Detail_product extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_product);

        ProductItem product = (ProductItem) getIntent().getSerializableExtra("product");

        TextView titol_toolbar = findViewById(R.id.name_product_toolbar);
        TextView titol = findViewById(R.id.titol);
        TextView subtitol = findViewById(R.id.subtitol);
        TextView descripcio = findViewById(R.id.descripcio);
        ImageView img = findViewById(R.id.imatge);
        ImageView btn_back = findViewById(R.id.btn_back_product);

        titol_toolbar.setText(product.getNameProduct());
        titol.setText(product.getNameProduct());
        subtitol.setText(product.getSubtitleProduct());
        descripcio.setText(product.getDescriptionProduct());
        Glide
                .with(this)
                .load(product.getImageProduct())
                .apply(new RequestOptions().override(575,345).fitCenter())
                .into(img);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
