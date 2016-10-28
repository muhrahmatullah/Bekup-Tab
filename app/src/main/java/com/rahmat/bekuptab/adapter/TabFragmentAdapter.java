package com.rahmat.bekuptab.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.rahmat.bekuptab.Tab1Fragment;
import com.rahmat.bekuptab.Tab2Fragment;

/**
 * Created by rahmat on 10/28/2016.
 */

public class TabFragmentAdapter extends FragmentPagerAdapter {
    String[] title = new String[]{
            "Tab 1", "Tab 2"
    };

    public TabFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    //method ini yang akan memanipulasi penampilan Fragment dilayar
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new Tab1Fragment();
                break;
            case 1:
                fragment = new Tab2Fragment();
                break;
            default:
                fragment = null;
                break;
        }

        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }

    @Override
    public int getCount() {
        return title.length;
    }
}
