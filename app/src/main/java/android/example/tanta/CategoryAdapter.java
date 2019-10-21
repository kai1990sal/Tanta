package android.example.tanta;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm){
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new RestaurantsFragment();
        } else if (position == 1) {
            return new MesuemFragment();
        } else if (position == 2) {
            return new ShopsFragment();
        } else {
            return new PlayGroundFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.restaurant);
        } else if (position == 1) {
            return mContext.getString(R.string.mesuems);
        } else if (position == 2) {
            return mContext.getString(R.string.shops);
        } else {
            return mContext.getString(R.string.play_ground);
        }
    }
}