package com.farmerfriend.FSecurity_CProd_Pest_Irrigation.Pest_Protection;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.farmerfriend.R;

@SuppressLint("Registered")
public class Cotton_american_boll_worm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cotton_american_boll_worm);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
