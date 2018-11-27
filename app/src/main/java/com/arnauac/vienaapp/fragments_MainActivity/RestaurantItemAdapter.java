package com.arnauac.vienaapp.fragments_MainActivity;

import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arnauac.vienaapp.R;

import java.util.List;

public class RestaurantItemAdapter extends RecyclerView.Adapter<RestaurantItemHolder> {
    private FragmentActivity mContext;
    private List<RestaurantItem> items;

    public RestaurantItemAdapter(FragmentActivity mContext, List<RestaurantItem> items) {
        this.mContext = mContext;
        this.items = items;
    }

    @NonNull
    @Override
    public RestaurantItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.item_restaurant, parent, false);
        return new RestaurantItemHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantItemHolder holder, int position) {
        holder.bind(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
