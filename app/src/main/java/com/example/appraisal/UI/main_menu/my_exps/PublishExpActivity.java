package com.example.appraisal.UI.main_menu.my_exps;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appraisal.R;
import com.example.appraisal.backend.experiment.Experiment;
import com.example.appraisal.model.PublishExpModel;

public class PublishExpActivity extends AppCompatActivity {
    private EditText description_field;
    private Spinner type_field;
    private RadioButton geo_yes;
    private EditText min_trials_field;
    private EditText rules_field;
    private EditText region_field;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publish_exp);

        description_field = findViewById(R.id.expDesc);
        type_field = findViewById(R.id.exp_types);

        geo_yes = findViewById(R.id.radioButtonYes);

        min_trials_field = findViewById(R.id.expMinTrials);
        rules_field = findViewById(R.id.expRules);
        region_field = findViewById(R.id.expRegion);
    }

    public void createNewExp(){
        String description = description_field.getText().toString();
        String type = type_field.getSelectedItem().toString();
        Boolean geo_required = geo_yes.isChecked();
        Integer min_trials = Integer.valueOf(min_trials_field.getText().toString());

        String region = region_field.getText().toString();

        String owner = "";// get profile of user to specify owner
        String rules = rules_field.getText().toString();//do we need rules?

        Experiment experiment = new Experiment(owner, description, type, geo_required, min_trials, region);
    }

}
