package cn.edu.gdmec.s07150826.shiwu.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/4/25.
 */
public class HomePagerAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> mFragments;


    public HomePagerAdapter(FragmentManager fm, ArrayList<Fragment> fragments) {

        super(fm);
        this.mFragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {

        return mFragments.get(position);
    }

    @Override
    public int getCount() {

        return mFragments.size();
    }
}
