package com.arnauac.vienaapp.ProductActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.arnauac.vienaapp.Detail_product;
import com.arnauac.vienaapp.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class CategoryActivity extends AppCompatActivity {
    //Model
    List<ProductItem> items;

    private ProductItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        Intent intent = getIntent();
        String text = intent.getStringExtra("nameCategory");
        TextView title = findViewById(R.id.category_name_toolbar);
        ImageView btn_back = findViewById(R.id.btn_back_category);

        items = new ArrayList<>();
        //Referències a elements de la pantalla
        RecyclerView recyclerView = findViewById(R.id.listProducts);
        adapter = new ProductItemAdapter(this, items);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        adapter.setOnClickListener(new ProductItemAdapter.OnClickListener() {
            @Override
            public void onClick(int position) {
                Intent intent = new Intent(CategoryActivity.this, Detail_product.class);
                ProductItem producte = items.get(position);
                intent.putExtra("product", producte);

                startActivity(intent);
            }
        });

        title.setText(text);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
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
}
