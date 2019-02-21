package com.cs541.abel.contactsapp.Activites;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.cs541.abel.contactsapp.Fragments.ContactsProfileFragment;
import com.cs541.abel.contactsapp.R;

public class ContactProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_profile);

        Intent intent = getIntent();
        int selectedPosition = intent.getIntExtra("selectedPosition", 0);

        Toast.makeText(this, Integer.toString(selectedPosition), Toast.LENGTH_SHORT).show();
        Bundle bundle = new Bundle();
        bundle.putInt("selectedPosition", selectedPosition);

        Fragment contactsProfileFragment =  new ContactsProfileFragment();

        FragmentManager fragmentManager = getSupportFragmentManager();
        contactsProfileFragment.setArguments(bundle);
        fragmentManager.beginTransaction()
                .replace(R.id.contact_profile_container, contactsProfileFragment)
                .commit();



    }
}
