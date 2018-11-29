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
import com.arnauac.vienaapp.RestaurantActivity;

import java.util.ArrayList;
import java.util.List;

public class RestaurantsFragment extends Fragment {

    //Model
    List<RestaurantItem> items;
    public static final int RES = 0;

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
                " " + "Sant Cugat del Vallès",
                new ServicesItem(
                        true,
                        true,
                        true,
                        true,
                        false
                )
        ));
        items.add(new RestaurantItem(
                "Xalet Sant Cugat",
                "Passeig de Ca n'Ametller" + ",",
                " " + "1-3",
                "08173" + ",",
                " " + "Sant Cugat del Vallès",
                new ServicesItem(
                        true,
                        true,
                        true,
                        true,
                        false
                )
        ));
        items.add(new RestaurantItem(
                "Cabrera",
                "Carretera N-11" + ",",
                " " + "km 643",
                "04171" + ",",
                " " + "Cabrera de Mar",
                new ServicesItem(
                        true,
                        true,
                        true,
                        true,
                        true
                )
        ));
        items.add(new RestaurantItem(
                "Parc Vallès",
                "Av. Tèxtil" + ",",
                " " + "s/n",
                "08223" + ",",
                " " + "Terrassa",
                new ServicesItem(
                        true,
                        true,
                        false,
                        true,
                        false
                )
        ));


        //Referències a elements de la pantalla
        RecyclerView recyclerView = view.findViewById(R.id.listRestaurant);
        RestaurantItemAdapter adapter = new RestaurantItemAdapter(this.getContext(), items);

        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        recyclerView.addItemDecoration(
                new DividerItemDecoration(this.getContext(), DividerItemDecoration.VERTICAL)
        );
        recyclerView.setAdapter(adapter);

        adapter.setOnClickListener(new RestaurantItemAdapter.OnClickListener() {

            @Override
            public void onClick(int position) {
                Intent intent = new Intent(getActivity(), RestaurantActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
