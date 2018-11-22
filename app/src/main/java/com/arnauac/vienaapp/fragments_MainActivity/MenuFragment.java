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

public class MenuFragment extends Fragment {

    //Model
    List<CategoryItem> items;

    //Referències a elements de la pantalla
    private RecyclerView recyclerView;
    private CategoryItemAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu, container, false);
        items = new ArrayList<>();
        items.add(new CategoryItem("Hamburgueses"));
        items.add(new CategoryItem("Flautes"));
        items.add(new CategoryItem("Postres"));
        items.add(new CategoryItem("Begudes"));
        items.add(new CategoryItem("Coques"));

        recyclerView = view.findViewById(R.id.listCaegory);
        adapter = new CategoryItemAdapter(this.getActivity(), items);

        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        recyclerView.addItemDecoration(
                new DividerItemDecoration(this.getActivity(), DividerItemDecoration.VERTICAL)
        );

        recyclerView.setAdapter(adapter);



        return view;
    }
}
