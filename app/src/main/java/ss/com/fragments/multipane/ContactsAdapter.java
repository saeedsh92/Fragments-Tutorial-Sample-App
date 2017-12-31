package ss.com.fragments.multipane;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import ss.com.fragments.R;

/**
 * @author S.Shahini
 * @since 12/24/17
 */

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactViewHolder> {
    private List<Contact> contacts = new ArrayList<>();
    private ContactViewHolder.OnContactClickListener contactClickListener;

    public ContactsAdapter(ContactViewHolder.OnContactClickListener onContactClickListener) {
        this.contactClickListener = onContactClickListener;

        Contact c1 = new Contact("Ali Ahmadi");
        Contact c2 = new Contact("Vahid Shahmoradi");
        Contact c3 = new Contact("Keivan Alimohammadi");
        Contact c4 = new Contact("Majid Mohammadi");

        contacts.add(c1);
        contacts.add(c2);
        contacts.add(c3);
        contacts.add(c4);
        notifyDataSetChanged();
    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ContactViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact, parent, false), contactClickListener);
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {
        holder.bindContact(contacts.get(position));
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public static class ContactViewHolder extends RecyclerView.ViewHolder {
        private OnContactClickListener onContactClickListener;
        private TextView contactNameTextView;

        public ContactViewHolder(View itemView, OnContactClickListener onContactClickListener) {
            super(itemView);
            this.onContactClickListener = onContactClickListener;
            this.contactNameTextView = itemView.findViewById(R.id.tv_contact_name);
        }

        public void bindContact(final Contact contact) {
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onContactClickListener.onClick(contact);
                }
            });
            contactNameTextView.setText(contact.getContactName());
        }

        public interface OnContactClickListener {
            void onClick(Contact contact);
        }
    }
}
