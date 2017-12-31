package ss.com.fragments.viewpager.rtlviewpager;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import ss.com.fragments.R;

public class RtlViewPagerSampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rtl_view_pager_sample);
        setupViews();
    }

    private void setupViews() {
        Toolbar toolbar = findViewById(R.id.toolbar_rtlViewPager);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ViewPager viewPager=findViewById(R.id.viewPager_rtlViewPager);
        TabLayout tabLayout=findViewById(R.id.tabLayout_rtlViewPager);
        viewPager.setAdapter(new RtlViewPagerSampleAdapter(getSupportFragmentManager()));
        viewPager.setCurrentItem(2,false);
        tabLayout.setupWithViewPager(viewPager);

    }
}
