package com.arnauac.vienaapp.ProductActivity;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arnauac.vienaapp.R;

import java.util.List;

public class ProductItemAdapter extends RecyclerView.Adapter<ProductItemHolder> {
    private Context mContext;
    private List<ProductItem> items;

    public ProductItemAdapter(Context mContext, List<ProductItem> items) {
        this.mContext = mContext;
        this.items = items;
    }

    @NonNull
    @Override
    public ProductItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.item_product, parent, false);
        return new ProductItemHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductItemHolder holder, int position) {
        holder.bind(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }


}
