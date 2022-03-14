package com.example.a25hdesign.Support;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

import com.example.a25hdesign.R;

public class SupportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_support);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        FAQsFragment faQsFragment = new FAQsFragment();

        fragmentTransaction.add(R.id.linear_container,faQsFragment);
        fragmentTransaction.commit();



    }
}