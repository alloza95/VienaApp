package com.arnauac.vienaapp.fragments_MainActivity.HomeFragment;

import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.arnauac.vienaapp.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

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
        Glide
                .with(imageView.getContext())
                .load(mImageIds[position])
                .apply(new RequestOptions().override(450,800).fitCenter())
                .into(imageView);

        container.addView(imageView, 0);
        return imageView;

        /*Glide
                .with(imageCategory_view.getContext())
                .load(item.getImageCategory())
                .apply(new RequestOptions().override(575,345).fitCenter())
                .into(imageCategory_view);*/
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView)object);
    }
}
