package ss.com.fragments.viewpager.onefragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by user on 12/31/2017.
 */

public class OneFragmentPagerAdapter extends FragmentPagerAdapter {

    public OneFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position==0){
            return NewsFragment.newInstance(NewsRepo.getLatestNews());
        }else if (position==1){
            return NewsFragment.newInstance(NewsRepo.getMostPopularNews());
        }else {
            return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position==0){
            return "Latest News";
        }else if (position==1){
            return "Popular News";
        }else {
            return null;
        }
    }
}
