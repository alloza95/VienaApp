package com.arnauac.vienaapp.fragments_MainActivity.MenuFragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
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

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu, container, false);
        items = new ArrayList<>();
        items.add(new CategoryItem("Hamburgueses", R.drawable.cat_01_hamburgueses));
        items.add(new CategoryItem("Coques", R.drawable.cat_02_coques));
        items.add(new CategoryItem("Flautes", R.drawable.cat_03_flautes));
        items.add(new CategoryItem("Lleugers", R.drawable.cat_04_lleugers));
        items.add(new CategoryItem("Patates", R.drawable.cat_05_patates));

        //Referències a elements de la pantalla
        RecyclerView recyclerView = view.findViewById(R.id.listCategory);
        CategoryItemAdapter adapter = new CategoryItemAdapter(this.getActivity(), items);

        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));

        recyclerView.setAdapter(adapter);

        return view;
    }
}
