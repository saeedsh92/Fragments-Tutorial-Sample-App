package ss.com.fragments.viewpager.onefragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import ss.com.fragments.R;

public class OneFragmentWithDifferentContentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_fragment_with_different_content);
        setupViews();
    }
    private void setupViews() {
        Toolbar toolbar = findViewById(R.id.toolbar_oneFragmentWithDifferentContent);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ViewPager viewPager=findViewById(R.id.viewPager_oneFragment);
        TabLayout tabLayout=findViewById(R.id.tabLayout_oneFragment);
        viewPager.setAdapter(new OneFragmentPagerAdapter(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);
    }

}
