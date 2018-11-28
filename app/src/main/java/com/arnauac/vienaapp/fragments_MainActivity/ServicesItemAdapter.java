package com.arnauac.vienaapp.fragments_MainActivity;

import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arnauac.vienaapp.R;

import java.util.List;

public class ServicesItemAdapter extends RecyclerView.Adapter<ServicesItemHolder> {
    FragmentActivity mContext;
    List<ServicesItem> items;

    public ServicesItemAdapter(FragmentActivity mContext, List<ServicesItem> items) {
        this.mContext = mContext;
        this.items = items;
    }

    @NonNull
    @Override
    public ServicesItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.item_services, parent, false);
        return new ServicesItemHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ServicesItemHolder holder, int position) {
        holder.bind(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
