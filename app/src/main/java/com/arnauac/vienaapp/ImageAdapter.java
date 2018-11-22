package com.arnauac.vienaapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.arnauac.vienaapp.fragments_MainActivity.HomeFragment;

public class ImageAdapter extends PagerAdapter {
    private FragmentActivity mContext;
    private int[] mImageIds = new int[]{R.drawable.home_01, R.drawable.home_02, R.drawable.home_03, R.drawable.home_04, R.drawable.home_05 };

    public ImageAdapter(FragmentActivity context){
        mContext = context;

    }
    @Override
    public int getCount() {
        return  mImageIds.length;

    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(mImageIds[position]);
        container.addView(imageView, 0);
        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView)object);
    }
}
