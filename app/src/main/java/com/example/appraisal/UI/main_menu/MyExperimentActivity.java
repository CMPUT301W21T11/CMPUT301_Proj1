package com.example.appraisal.UI.main_menu;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.appraisal.R;
import com.example.appraisal.model.MainModel;
import com.example.appraisal.model.MyExperimentModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MyExperimentActivity extends MainMenuCommonActivity {
    private ListView my_experiment_display;
    private MyExperimentModel model;
    private ArrayAdapter<String> adapter;
    //private final CollectionReference my_exp_reference;
    BottomNavigationView bottom_nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_exp);

        my_experiment_display = findViewById(R.id.my_experiments);
        model = new MyExperimentModel();

        MainModel.getInstance();

        bottom_nav = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottom_nav.setOnNavigationItemSelectedListener(this);
        //my_exp_reference = db.collection("Cities");
        
    }


}
