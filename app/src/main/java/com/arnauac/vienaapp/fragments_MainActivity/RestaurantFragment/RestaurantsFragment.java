package com.arnauac.vienaapp.fragments_MainActivity.RestaurantFragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arnauac.vienaapp.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class RestaurantsFragment extends Fragment {

    List<RestaurantItem> items;
    private RestaurantItemAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_restaurants, container, false);

        items = new ArrayList<>();
        RecyclerView recyclerView = view.findViewById(R.id.listRestaurant);
        adapter = new RestaurantItemAdapter(this.getContext(), items);

        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        recyclerView.addItemDecoration(
                new DividerItemDecoration(this.getContext(), DividerItemDecoration.VERTICAL)
        );
        recyclerView.setAdapter(adapter);

        adapter.setOnClickListener(new RestaurantItemAdapter.OnClickListener() {
            @Override
            public void onClick(int position) {
                Intent intent = new Intent(getActivity(), RestaurantActivity.class);
                RestaurantItem restaurant = items.get(position);
                intent.putExtra("itemRestaurant", restaurant);

                startActivity(intent);
            }
        });

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        database.getReference("restaurants").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                items.removeAll(items);
                for (DataSnapshot snapshot :
                        dataSnapshot.getChildren()){
                    RestaurantItem restaurant = snapshot.getValue(RestaurantItem.class);
                    items.add(restaurant);
                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        return view;
    }
}
