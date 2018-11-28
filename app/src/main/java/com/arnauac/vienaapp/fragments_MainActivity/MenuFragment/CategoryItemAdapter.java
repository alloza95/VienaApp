package com.arnauac.vienaapp.fragments_MainActivity.MenuFragment;

import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arnauac.vienaapp.R;

import java.util.List;

public class CategoryItemAdapter extends RecyclerView.Adapter<CategoryItemHolder> {
    private FragmentActivity mContext;
    private List<CategoryItem> items;

    CategoryItemAdapter(FragmentActivity mContext, List<CategoryItem> items) {
        this.mContext = mContext;
        this.items = items;
    }

    @NonNull
    @Override
    public CategoryItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.item_category, parent, false);
        return new CategoryItemHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryItemHolder holder, int position) {
        holder.bind(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
