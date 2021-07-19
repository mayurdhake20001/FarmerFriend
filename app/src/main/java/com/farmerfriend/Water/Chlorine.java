package com.farmerfriend.Water;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.farmerfriend.Constants;
import com.farmerfriend.FSecurity_CProd_Pest_Irrigation.Food_Security.WebVieW;
import com.farmerfriend.R;

public class Chlorine extends AppCompatActivity {

    TextView text, link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chlorine);

        text = (TextView) findViewById(R.id.text);
        link = (TextView) findViewById(R.id.link);

        text.setText(Constants.Chlorine);
        link.setText(Constants.Chlorine_link);

        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebVieW.class);
                Constants.Url = Constants.Chlorine_link;
                startActivity(intent);
            }
        });


    }
}
