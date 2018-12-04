package com.arnauac.vienaapp.ProductActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.arnauac.vienaapp.R;

import java.util.ArrayList;
import java.util.List;

public class CategoryActivity extends AppCompatActivity {

    //Model
    List<ProductItem> items;

    //Referències a elements de la pantalla
    private RecyclerView recyclerView;
    private ProductItemAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        items = new ArrayList<>();
        items.add(new ProductItem("Hamburgueses222", R.drawable.cat_01_hamburgueses));
        items.add(new ProductItem("item", R.drawable.cat_02_coques));
        items.add(new ProductItem("Flautes", R.drawable.cat_03_flautes));
        items.add(new ProductItem("Lleugers", R.drawable.cat_04_lleugers));
        items.add(new ProductItem("Patates", R.drawable.cat_05_patates));

        recyclerView = findViewById(R.id.listProducts);
        adapter = new ProductItemAdapter(this, items);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(adapter);
    }
}
