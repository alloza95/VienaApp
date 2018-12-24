package com.arnauac.vienaapp.ProductActivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.arnauac.vienaapp.R;

import java.util.ArrayList;
import java.util.List;

public class CategoryActivity extends AppCompatActivity {

    //Model
    List<ProductItem> items;

    //Referències a elements de la pantalla
    private RecyclerView recyclerView;
    private List<String> products;
    private ProductItemAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Intent intent = getIntent();
        String text = intent.getStringExtra("nameCategory");
        getSupportActionBar().setTitle(text);

        if (text.equals("Coques")) {
            items = new ArrayList<>();
            items.add(new ProductItem("Alpino", R.drawable.coq01_alpino));
            items.add(new ProductItem("Remy", R.drawable.coq02_remy));
            items.add(new ProductItem("Porchetta", R.drawable.coq03_porchetta));
            items.add(new ProductItem("Lorraine", R.drawable.coq04_lorraine));


        }
        else if (text.equals("Hamburgueses")) {
            items = new ArrayList<>();
            items.add(new ProductItem("Piri Piri", R.drawable.hamb01_piripiri));
            items.add(new ProductItem("Oxbridge", R.drawable.hamb02_oxbridge));
            items.add(new ProductItem("Cottage", R.drawable.hamb03_cottage));
            items.add(new ProductItem("Tartufata", R.drawable.hamb04_tartufata));


        }
        else if (text.equals("Flautes")) {
            items = new ArrayList<>();
            items.add(new ProductItem("Strongonov", R.drawable.flauta01_strogonov));
            items.add(new ProductItem("Britània", R.drawable.flauta02_britania));
            items.add(new ProductItem("Ibèric de gla", R.drawable.flauta03_ibericagla));
            items.add(new ProductItem("Norvègia", R.drawable.flauta04_norvegia));


        }
        else if (text.equals("Lleugers")) {
            items = new ArrayList<>();
            items.add(new ProductItem("Amanida alla Norma", R.drawable.lle01_amanidanorma));
            items.add(new ProductItem("Sucs naturals", R.drawable.lle02_sucs));
            items.add(new ProductItem("Amanida Xató", R.drawable.lle03_xato));
            items.add(new ProductItem("Sopa Galets", R.drawable.lle04_sopagalets));


        }
        else if (text.equals("Patates")) {
            items = new ArrayList<>();
            items.add(new ProductItem("Uppsala", R.drawable.pat01_uppsala));


        }else{
            items = new ArrayList<>();
            items.add(new ProductItem("Hamburgueses222", R.drawable.cat_01_hamburgueses));
            items.add(new ProductItem("item", R.drawable.cat_02_coques));
            items.add(new ProductItem("Flautes", R.drawable.cat_03_flautes));
            items.add(new ProductItem("Lleugers", R.drawable.cat_04_lleugers));
            items.add(new ProductItem("Patates", R.drawable.cat_05_patates));

        }


        RecyclerView recyclerView = findViewById(R.id.listProducts);
        adapter = new ProductItemAdapter(this, items);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);











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
