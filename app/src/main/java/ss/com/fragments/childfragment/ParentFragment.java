package ss.com.fragments.childfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import ss.com.fragments.R;

/**
 * @author S.Shahini
 * @since 12/31/17
 */

public class ParentFragment extends Fragment {
    private View rootLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (rootLayout == null) {
            rootLayout = inflater.inflate(R.layout.fragment_parent, container, false);
            setupViews();
        }
        return rootLayout;
    }

    private void setupViews() {
        Button showChildButton = rootLayout.findViewById(R.id.btn_parent_showChild);
        showChildButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChildFragment childFragment = new ChildFragment();
                FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
                transaction.add(R.id.frameLayout_parentFragment, childFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
    }
}
