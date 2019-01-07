package com.arnauac.vienaapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
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

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ProductItem product = (ProductItem) getIntent().getSerializableExtra("product");
        getSupportActionBar().setTitle(product.getNameProduct());

        getSupportActionBar().setTitle(product.getNameProduct());

        TextView titol = findViewById(R.id.titol);
        TextView subtitol = findViewById(R.id.subtitol);
        TextView descripcio = findViewById(R.id.descripcio);
        ImageView img = findViewById(R.id.imatge);


        titol.setText(product.getNameProduct());
        subtitol.setText(product.getSubtitleProduct());
        descripcio.setText(product.getDescriptionProduct());
        Glide
                .with(this)
                .load(product.getImageProduct())
                .apply(new RequestOptions().override(575,345).fitCenter())
                .into(img);

}
    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        int id = item.getItemId();
        if (id == android.R.id.home){
            this.finish();
        }
        return  super.onOptionsItemSelected(item);
    }
}
