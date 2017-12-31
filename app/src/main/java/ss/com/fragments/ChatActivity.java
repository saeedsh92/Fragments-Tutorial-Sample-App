package ss.com.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ss.com.fragments.multipane.ChatFragment;
import ss.com.fragments.multipane.Contact;

public class ChatActivity extends AppCompatActivity {

    private String contactName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        contactName = getIntent().getStringExtra("contact");
        ChatFragment chatFragment = (ChatFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_chat_chatFragment);
        chatFragment.updateContent(new Contact(contactName));
    }
}
