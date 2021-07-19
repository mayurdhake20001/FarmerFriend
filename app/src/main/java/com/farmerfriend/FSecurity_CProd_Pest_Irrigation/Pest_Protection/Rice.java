package com.farmerfriend.FSecurity_CProd_Pest_Irrigation.Pest_Protection;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

import com.farmerfriend.R;

public class Rice extends AppCompatActivity {

    GridLayout mainGrid,mainGrid1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rice);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mainGrid = (GridLayout) findViewById(R.id.mainGrid);
        mainGrid1=(GridLayout)findViewById(R.id.mainGrid1);

        setSingleEvent(mainGrid);
        setSingleEvent1(mainGrid1);
    }
    private void setSingleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (finalI==0) {
                        Intent intent = new Intent(Rice.this, Rice_thrips.class);
                        startActivity(intent);
                    }else {
                        Intent gl = new Intent(Rice.this,Rice_Green_Leafhopper.class);
                        startActivity(gl);
                    }

                }
            });
        }
    }
    private void setSingleEvent1(GridLayout mainGrid1) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid1.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            CardView cardView = (CardView) mainGrid1.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (finalI==0){
                        Intent ps =new Intent(Rice.this,Rice_Paddy_stemborer.class);
                        startActivity(ps);
                    }else {
                        Toast.makeText(Rice.this, "Gall midge.....Under Construction", Toast.LENGTH_SHORT).show();
                    }

                }
            });
        }
    }
}
