package com.example.appraisal.UI;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.example.appraisal.R;
import com.example.appraisal.UI.SpecificExpFragments.SpecificExpViewAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class SpecificExpActivity extends AppCompatActivity {

    // This tab view and view pager UI interface is taken from android developers documentation
    // Author: Google
    // URL: https://developer.android.com/guide/navigation/navigation-swipe-view-2#java
    // URL2: https://developer.android.com/training/animation/screen-slide-2

    private SpecificExpViewAdapter specific_exp_view_adapter;
    private ViewPager2 viewpager;

    private String[] tab_names= {"DETAILS", "QR CODE", "DATA ANALYSIS", "CONTRIBUTORS"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_specific_exp);
        viewpager = (ViewPager2) findViewById(R.id.specific_exp_pager);
        specific_exp_view_adapter = new SpecificExpViewAdapter(this);
        viewpager.setAdapter(specific_exp_view_adapter);

        TabLayout tabLayout = findViewById(R.id.specific_exp_tab_layout);
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayout, viewpager, (tab, position) -> tab.setText(tab_names[position]));
        tabLayoutMediator.attach();
    }
}