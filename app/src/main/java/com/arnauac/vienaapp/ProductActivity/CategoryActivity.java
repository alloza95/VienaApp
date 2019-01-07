package com.arnauac.vienaapp.ProductActivity;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.arnauac.vienaapp.Detail_product;
import com.arnauac.vienaapp.R;
import com.arnauac.vienaapp.fragments_MainActivity.MenuFragment.CategoryItemAdapter;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class CategoryActivity extends AppCompatActivity {
    private Button btn;

    //Model
    List<ProductItem> items;

    //Referències a elements de la pantalla
    private RecyclerView recyclerView;
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

        items = new ArrayList<>();
        recyclerView = findViewById(R.id.listProducts);
        adapter = new ProductItemAdapter(this, items);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        adapter.setOnClickListener(new ProductItemAdapter.OnClickListener() {
            @Override
            public void onClick(int position) {
                Intent intent = new Intent(CategoryActivity.this, Detail_product.class);
                intent.putExtra("nameProduct", items.get(position).getNameProduct());
                startActivity(intent);
            }
        });

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        database.getReference("categories").child(text).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                items.removeAll(items);
                for (DataSnapshot snapshot :
                        dataSnapshot.getChildren()){
                    ProductItem product = snapshot.getValue(ProductItem.class);
                    items.add(product);
                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

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
