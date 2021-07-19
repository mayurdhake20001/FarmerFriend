package com.farmerfriend.Water;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.farmerfriend.R;

public class Water extends AppCompatActivity implements View.OnClickListener{

    String water[] = {"Muddy", "Contaminated", "Chlorine"};

    Button muddy, contaminated, chlorine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        muddy = (Button) findViewById(R.id.muddy);
        contaminated = (Button) findViewById(R.id.contaminated);
        chlorine = (Button) findViewById(R.id.chlorine);

        Toast.makeText(this, "Muddy", Toast.LENGTH_SHORT).show();

        muddy.setOnClickListener(this);
        contaminated.setOnClickListener(this);
        chlorine.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.muddy) {
            startActivity(new Intent(getApplicationContext(), Muddy.class));
        } else if(view.getId() == R.id.contaminated) {
            startActivity(new Intent(getApplicationContext(), Contaminated.class));
        } else if(view.getId() == R.id.chlorine) {
            startActivity(new Intent(getApplicationContext(), Chlorine.class));
        }
    }
}
