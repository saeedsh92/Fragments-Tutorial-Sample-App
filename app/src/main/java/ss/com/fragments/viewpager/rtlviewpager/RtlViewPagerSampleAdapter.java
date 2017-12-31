package ss.com.fragments.viewpager.rtlviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import ss.com.fragments.viewpager.common.FragmentA;
import ss.com.fragments.viewpager.common.FragmentB;
import ss.com.fragments.viewpager.common.FragmentC;

/**
 * Created by user on 12/31/2017.
 */

public class RtlViewPagerSampleAdapter extends FragmentPagerAdapter{

    public RtlViewPagerSampleAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FragmentC();
            case 1:
                return new FragmentB();
            case 2:
                return new FragmentA();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "ت";
            case 1:
                return "ب";
            case 2:
                return "الف";
        }
        return super.getPageTitle(position);
    }
}
