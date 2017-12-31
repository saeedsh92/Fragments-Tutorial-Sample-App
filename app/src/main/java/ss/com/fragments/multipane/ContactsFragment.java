package ss.com.fragments.multipane;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ss.com.fragments.R;

/**
 * @author S.Shahini
 * @since 12/24/17
 */

public class ContactsFragment extends Fragment {
    private View rootView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (rootView == null) {
            rootView = inflater.inflate(R.layout.fragment_contacts, container, false);
            setupViews();
        }
        return rootView;
    }

    private void setupViews() {
        RecyclerView recyclerView = rootView.findViewById(R.id.rv_contacts);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        ContactsAdapter contactsAdapter = new ContactsAdapter((ContactsAdapter.ContactViewHolder.OnContactClickListener) getActivity());
        recyclerView.setAdapter(contactsAdapter);
    }
}
