package com.farmerfriend.Water;

import android.content.Intent;
import android.nfc.NfcAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.farmerfriend.Constants;
import com.farmerfriend.FSecurity_CProd_Pest_Irrigation.Food_Security.WebVieW;
import com.farmerfriend.R;

public class Contaminated extends AppCompatActivity {

    TextView text, link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contaminated);


        text = (TextView) findViewById(R.id.text);
        link = (TextView) findViewById(R.id.link);

        text.setText(Constants.Contaminated);
        link.setText(Constants.Contaminated_link);

        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebVieW.class);
                Constants.Url = Constants.Contaminated_link;
                startActivity(intent);
            }
        });

    }
}
