package com.example.appraisal.UI.main_menu.subscription;

import android.os.Build;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.RequiresApi;

import com.example.appraisal.R;
import com.example.appraisal.UI.main_menu.MainMenuCommonActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExpSubscriptionActivity extends MainMenuCommonActivity {

    // TODO
    private ListView subscribed_list;
    private List<String> subscribed_content;
    private ArrayAdapter<String> adapter;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subscription);

        // Testing dummy data
        String[] dummy = {"a", "b", "c"};
        subscribed_content = Arrays.stream(dummy).collect(Collectors.toList());

        subscribed_list = findViewById(R.id.subscribedList);
        adapter = new ArrayAdapter<>(this, R.layout.list_content, subscribed_content);
        subscribed_list.setAdapter(adapter);


    }
}
