package com.example.laba_2_ver3;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyAdapterViewPage extends FragmentPagerAdapter {
    public MyAdapterViewPage(FragmentManager mgr) {
        super(mgr);
    }
    @Override
    public int getCount() {
        return(10);
    }
    @Override
    public Fragment getItem(int position) {
        return(PageFragment.newInstance(position));
    }
}
