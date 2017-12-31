package ss.com.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import ss.com.fragments.viewpager.onefragment.OneFragmentWithDifferentContentActivity;
import ss.com.fragments.viewpager.pageradapter.PagerAdapterSampleActivity;
import ss.com.fragments.viewpager.rtlviewpager.RtlViewPagerSampleActivity;
import ss.com.fragments.viewpager.statepageradapter.StatePagerAdapterSampleActivity;

public class ViewPagerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veiw_pager);
        setupViews();
    }

    private void setupViews() {
        Toolbar toolbar = findViewById(R.id.toolbar_viewPager);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button buttonPagerAdapter = findViewById(R.id.btn_viewPager_pagerAdapter);
        buttonPagerAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ViewPagerActivity.this, PagerAdapterSampleActivity.class));
            }
        });

        Button buttonStatePagerAdapter = findViewById(R.id.btn_viewPager_statePagerAdapter);
        buttonStatePagerAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ViewPagerActivity.this, StatePagerAdapterSampleActivity.class));
            }
        });

        Button buttonRtlViewPager = findViewById(R.id.btn_viewPager_rtlViewPager);
        buttonRtlViewPager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ViewPagerActivity.this, RtlViewPagerSampleActivity.class));

            }
        });

        Button buttonOneFragmentWithDifferentContent = findViewById(R.id.btn_viewPager_oneFragmentWithDifferentContent);
        buttonOneFragmentWithDifferentContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ViewPagerActivity.this, OneFragmentWithDifferentContentActivity.class));
            }
        });
    }
}
