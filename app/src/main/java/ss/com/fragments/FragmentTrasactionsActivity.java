package ss.com.fragments;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FragmentTrasactionsActivity extends AppCompatActivity {
    private Fragment lastFragment;
    private static final String TAG = "FragmentTrasactionsActi";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_trasactions);
        Button addFragment = findViewById(R.id.btn_fragmentTransaction_add);
        addFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                final SimpleFragment simpleFragment = new SimpleFragment();
                simpleFragment.setOnFragmentViewInflated(new SimpleFragment.OnFragmentViewInflated() {
                    @Override
                    public void onInflated() {
                        simpleFragment.updateContent(fragmentManager.getBackStackEntryCount());
                    }
                });
                transaction.add(R.id.frame_fragmentTransaction_fragmentContainer, simpleFragment);
                transaction.addToBackStack("SimpleFragment");
                transaction.commit();
                lastFragment = simpleFragment;
            }
        });
        Button remove = findViewById(R.id.btn_fragmentTransaction_remove);
        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.remove(lastFragment);
                fragmentTransaction.commit();
                lastFragment = null;
            }
        });
        Button replaceFragment = findViewById(R.id.btn_fragmentTransaction_replace);
        replaceFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                final SimpleFragment simpleFragment = new SimpleFragment();
                simpleFragment.setOnFragmentViewInflated(new SimpleFragment.OnFragmentViewInflated() {
                    @Override
                    public void onInflated() {
                        simpleFragment.updateContent(fragmentManager.getBackStackEntryCount());
                    }
                });
                transaction.replace(R.id.frame_fragmentTransaction_fragmentContainer, simpleFragment);
                transaction.addToBackStack("SimpleFragment");
                transaction.commit();
                lastFragment = simpleFragment;
            }
        });

        getSupportFragmentManager().addOnBackStackChangedListener(new FragmentManager.OnBackStackChangedListener() {
            @Override
            public void onBackStackChanged() {
                Log.d(TAG, "onBackStackChanged() called, Count=> " + getSupportFragmentManager().getBackStackEntryCount());
            }
        });
    }
}
