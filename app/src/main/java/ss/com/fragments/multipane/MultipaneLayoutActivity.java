package ss.com.fragments.multipane;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import ss.com.fragments.ChatActivity;
import ss.com.fragments.R;

public class MultipaneLayoutActivity extends AppCompatActivity implements ContactsAdapter.ContactViewHolder.OnContactClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multipane_layout);
    }

    @Override
    public void onClick(Contact contact) {
        ChatFragment chatFragment = (ChatFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_multiPaneLayout_chat);
        if (chatFragment == null) {
            //Navigate to ChatActivity
            Intent intent = new Intent(this, ChatActivity.class);
            intent.putExtra("contact", contact.getContactName());
            startActivity(intent);
        } else {
            chatFragment.updateContent(contact);
        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}
