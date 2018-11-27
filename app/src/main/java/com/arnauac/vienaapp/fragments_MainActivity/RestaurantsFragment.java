package com.arnauac.vienaapp.fragments_MainActivity;

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

import java.util.ArrayList;
import java.util.List;

public class RestaurantsFragment extends Fragment {

    //Model
    List<RestaurantItem> items;

    //Referències a elements de la pantalla
    private RecyclerView recyclerView;
    private RestaurantItemAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_restaurants, container, false);

        items = new ArrayList<>();
        items.add(new RestaurantItem(
                "Can Solà",
                "Carrer de Can Solà" + ",",
                " " + "1",
                "08173" + ",",
                " " + "Sant Cugat del Vallès"
        ));
        items.add(new RestaurantItem(
                "Can Solà",
                "Carrer de Can Solà" + ",",
                " " + "1",
                "08173" + ",",
                " " + "Sant Cugat del Vallès"
        ));
        items.add(new RestaurantItem(
                "Can Solà",
                "Carrer de Can Solà" + ",",
                " " + "1",
                "08173" + ",",
                " " + "Sant Cugat del Vallès"
        ));
        items.add(new RestaurantItem(
                "Can Solà",
                "Carrer de Can Solà" + ",",
                " " + "1",
                "08173" + ",",
                " " + "Sant Cugat del Vallès"
        ));

        recyclerView = view.findViewById(R.id.listRestaurant);
        adapter = new RestaurantItemAdapter(this.getActivity(), items);

        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        recyclerView.addItemDecoration(
                new DividerItemDecoration(this.getActivity(), DividerItemDecoration.VERTICAL)
        );

        recyclerView.setAdapter(adapter);

        return view;
    }
}
