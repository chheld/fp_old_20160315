package de.fischerprofil.fp.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import de.fischerprofil.fp.ui.fragments.HintFragment;
import de.fischerprofil.fp.ui.fragments.OrderDetailsFragment;

public class OrderTabPagerAdapter extends FragmentStatePagerAdapter {

    private int mNumOfTabs;
    private Bundle mBundle = null;

    public OrderTabPagerAdapter(FragmentManager fm, int NumOfTabs) {

        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    public void setArguments (Bundle b) {

        mBundle = b;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                OrderDetailsFragment tab1 = new OrderDetailsFragment();
                tab1.setArguments(mBundle);
                return tab1;
            case 1: // test
                HintFragment tab2 = new HintFragment();
                tab2.setArguments(mBundle);
                return tab2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {

        return mNumOfTabs;
    }
}