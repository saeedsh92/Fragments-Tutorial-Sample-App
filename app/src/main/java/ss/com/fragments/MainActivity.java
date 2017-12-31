package ss.com.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import ss.com.fragments.childfragment.FragmentInsideFragmentSample;
import ss.com.fragments.multipane.MultipaneLayoutActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupViews();
    }

    private void setupViews() {
        Toolbar toolbar = findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);

        Button sayHelloToFragmentsButton = findViewById(R.id.btn_main_simple);
        sayHelloToFragmentsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SayHelloToFragmentsActivity.class));
            }
        });


        Button fragmentTransactionButton = findViewById(R.id.btn_main_fragmentTransaction);
        fragmentTransactionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FragmentTrasactionsActivity.class));
            }
        });

        Button viewPagerButton = findViewById(R.id.btn_main_viewPager);
        viewPagerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ViewPagerActivity.class));
            }
        });

        Button multipaneLayoutButton = findViewById(R.id.btn_main_multipaneLayout);
        multipaneLayoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MultipaneLayoutActivity.class));
            }
        });

        Button childFragmentButton=findViewById(R.id.btn_main_childFragment);
        childFragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FragmentInsideFragmentSample.class));
            }
        });
    }

}
