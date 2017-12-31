package ss.com.fragments.viewpager.pageradapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import ss.com.fragments.viewpager.common.FragmentA;
import ss.com.fragments.viewpager.common.FragmentB;
import ss.com.fragments.viewpager.common.FragmentC;

/**
 * Created by user on 12/31/2017.
 */

public class SamplePagerAdapter extends FragmentPagerAdapter{
    public SamplePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FragmentA();
            case 1:
                return new FragmentB();
            case 2:
                return new FragmentC();
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
                return "A";
            case 1:
                return "B";
            case 2:
                return "C";
        }
        return super.getPageTitle(position);
    }
}
