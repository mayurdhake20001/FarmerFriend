package com.farmerfriend.Video_Success_Stories.Success_Stories;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import com.farmerfriend.Constants;
import com.farmerfriend.FSecurity_CProd_Pest_Irrigation.Food_Security.WebVieW;
import com.farmerfriend.R;

public class Success_Stories extends AppCompatActivity implements View.OnClickListener{

    Button madurai1, madurai2, dindigul, cuddalore, karaikal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success__stories);

        madurai1 = (Button) findViewById(R.id.madurai1);
        madurai2 = (Button) findViewById(R.id.madurai2);
        dindigul = (Button) findViewById(R.id.dindigul);
        cuddalore = (Button) findViewById(R.id.cuddalore);
        karaikal = (Button) findViewById(R.id.karaikal);

        madurai1.setOnClickListener(this);
        madurai2.setOnClickListener(this);
        dindigul.setOnClickListener(this);
        cuddalore.setOnClickListener(this);
        karaikal.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.madurai1:
                Constants.Url = Constants.Madurai1;
//                Intent intent = new Intent(getApplicationContext(), WebVieW.class);
//                intent.putExtra("Url", Constants.Madurai1);
                startActivity(new Intent(getApplicationContext(), WebVieW.class));
                break;
            case R.id.madurai2:
                Constants.Url = Constants.Madurai2;
//                Intent intent1 = new Intent(getApplicationContext(), WebVieW.class);
//                intent1.putExtra("Url", Constants.Madurai2);
//                startActivity(intent1);
                startActivity(new Intent(getApplicationContext(), WebVieW.class));
                break;
            case R.id.dindigul:
                Constants.Url = Constants.Dindigul;
//                Intent intent2 = new Intent(getApplicationContext(), WebVieW.class);
//                intent2.putExtra("Url", Constants.Dindigul);
//                startActivity(intent2);
                startActivity(new Intent(getApplicationContext(), WebVieW.class));
                break;
            case R.id.cuddalore:
                Constants.Url = Constants.Cuddalore;
//                Intent intent3 = new Intent(getApplicationContext(), WebVieW.class);
//                intent3.putExtra("Url", Constants.Cuddalore);
//                startActivity(intent3);
                startActivity(new Intent(getApplicationContext(), WebVieW.class));
                break;
            case R.id.karaikal:
                Constants.Url = Constants.Karaikal;
//                Intent intent4 = new Intent(getApplicationContext(), WebVieW.class);
//                intent4.putExtra("Url", Constants.Karaikal);
//                startActivity(intent4);
                startActivity(new Intent(getApplicationContext(), WebVieW.class));
                break;
        }

    }
}
