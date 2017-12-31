package ss.com.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by user on 12/24/2017.
 */

public class SimpleFragment extends Fragment {
    private View rootView;
    private TextView fragmentLabelTextView;
    private OnFragmentViewInflated onFragmentViewInflated;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (rootView == null) {
            rootView = inflater.inflate(R.layout.fragment_simple, container, false);
            setupViews();
        }
        if (onFragmentViewInflated != null)
            onFragmentViewInflated.onInflated();
        return rootView;
    }

    public void setOnFragmentViewInflated(OnFragmentViewInflated onFragmentViewInflated) {
        this.onFragmentViewInflated = onFragmentViewInflated;
    }


    private void setupViews() {
        fragmentLabelTextView = rootView.findViewById(R.id.tv_simpleFragment);
    }

    public void updateContent(final int position) {
        fragmentLabelTextView.setText("Fragment Num " + position);
    }

    public interface OnFragmentViewInflated {
        void onInflated();
    }


}
