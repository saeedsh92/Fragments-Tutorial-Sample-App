package ss.com.fragments.viewpager.pageradapter;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import ss.com.fragments.R;

public class PagerAdapterSampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager_adapter_sample);
        setupViews();
    }
    private void setupViews() {
        Toolbar toolbar = findViewById(R.id.toolbar_pagerAdapter);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ViewPager viewPager=findViewById(R.id.viewPager_pagerAdapter);
        viewPager.setOffscreenPageLimit(3);
        TabLayout tabLayout=findViewById(R.id.tabLayout_pagerAdapterSample);
        viewPager.setAdapter(new SamplePagerAdapter(getSupportFragmentManager()));
        viewPager.setCurrentItem(1);
        tabLayout.setupWithViewPager(viewPager);
    }

}
