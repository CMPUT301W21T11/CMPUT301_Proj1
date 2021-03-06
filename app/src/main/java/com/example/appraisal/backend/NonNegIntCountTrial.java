package com.example.appraisal.backend;

import android.util.Log;

public class NonNegIntCountTrial extends Trial {
    private int counter;
    public NonNegIntCountTrial() {
        counter = 0;
    }

    public void addIntCount(String s) {
        int count = 0;
        try {
            count = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            Log.d("Warning", "User input caused integer overflow");
        }

        counter += count;
    }

    public int getCount() {
        return counter;
    }
}
