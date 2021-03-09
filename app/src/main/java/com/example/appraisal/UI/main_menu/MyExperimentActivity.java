package com.example.appraisal.UI.main_menu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.appraisal.R;
import com.example.appraisal.model.MainModel;
import com.example.appraisal.model.MyExperimentModel;

public class MyExperimentActivity extends MainMenuCommonActivity {
    private ListView my_experiment_display;
    private MyExperimentModel model;
    private ArrayAdapter<String> adapter;
    //private final CollectionReference my_exp_reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_exp);

        my_experiment_display = findViewById(R.id.my_experiments);
        model = new MyExperimentModel();

        MainModel.getInstance();

        //my_exp_reference = db.collection("Cities");
        
    }

    public void publishExperiment(View v) {
        Intent publishExp_intent = new Intent(this, PublishExpActivity.class);
        startActivity(publishExp_intent);
    }


}
