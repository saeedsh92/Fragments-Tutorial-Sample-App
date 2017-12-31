package ss.com.fragments.viewpager.onefragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import ss.com.fragments.R;

/**
 * @author S.Shahini
 * @since 12/31/17
 */

public class NewsFragment extends Fragment {
    public static final String EXTRA_KEY_NEWS = "news";
    private RecyclerView recyclerView;
    private ArrayList<News> newsArrayList;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        newsArrayList = getArguments().getParcelableArrayList(EXTRA_KEY_NEWS);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (recyclerView == null) {
            recyclerView = (RecyclerView) inflater.inflate(R.layout.fragment_news, container, false);
            setupViews();
        }
        return recyclerView;
    }

    private void setupViews() {
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(new NewsAdapter(getContext(), newsArrayList));
    }

    public static NewsFragment newInstance(ArrayList<News> newsArrayList) {

        Bundle args = new Bundle();
        args.putParcelableArrayList(EXTRA_KEY_NEWS, newsArrayList);
        NewsFragment fragment = new NewsFragment();
        fragment.setArguments(args);
        return fragment;
    }


}
