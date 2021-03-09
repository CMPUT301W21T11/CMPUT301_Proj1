package com.example.appraisal.UI.main_menu;

import android.content.Intent;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.appraisal.R;
import com.example.appraisal.UI.main_menu.forum.ForumHomeActivity;
import com.example.appraisal.UI.main_menu.subscription.ExpSubscriptionActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainMenuCommonActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.home_button){
            return true;
        }
        else if (id == R.id.search_button){
            return true;
        }
        else if (id == R.id.forum_button){
            return true;
        }
        else if (id == R.id.list_button){
            return true;
        }
        else if (id == R.id.profile_button){
            return true;
        }
        return false;
    }

    public void toHome(View v) {
        if (this.getClass() == ExpSubscriptionActivity.class)
            return;
        Intent intent = new Intent(this, ExpSubscriptionActivity.class);
        startActivity(intent);
    }

    public void toSearch(View v) {
        // TODO When click on search button
    }

    public void toForum(View v) {
        // When click on forum button
        if (this.getClass() == ForumHomeActivity.class)
            return;
        Intent intent = new Intent(this, ForumHomeActivity.class);
        startActivity(intent);
    }

    public void toMyExps(View v) {
        // When click on expList button
        if (this.getClass() == MyExperimentActivity.class)
            return;
        Intent intent = new Intent(this, MyExperimentActivity.class);
        startActivity(intent);
    }

    public void toProfile(View v) {
        // TODO When click on profile button
    }
}
