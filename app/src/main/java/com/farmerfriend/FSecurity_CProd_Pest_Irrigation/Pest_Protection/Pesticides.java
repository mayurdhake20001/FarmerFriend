package com.farmerfriend.FSecurity_CProd_Pest_Irrigation.Pest_Protection;


import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.farmerfriend.R;

public class Pesticides extends AppCompatActivity {

    GridLayout mainGrid,mainGrid1,mainGrid2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesticides);

        mainGrid = (GridLayout) findViewById(R.id.mainGrid);
        mainGrid1=(GridLayout)findViewById(R.id.mainGrid1);
        mainGrid2=(GridLayout)findViewById(R.id.mainGrid2) ;

        //Set Event
        setSingleEvent(mainGrid);
        setSingleEvent1(mainGrid1);
        setSingleEvent2(mainGrid2);
        //setToggleEvent(mainGrid);
    }

    private void setToggleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            final CardView cardView = (CardView) mainGrid.getChildAt(i);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (cardView.getCardBackgroundColor().getDefaultColor() == -1) {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
                        Toast.makeText(Pesticides.this, "State : True", Toast.LENGTH_SHORT).show();

                    } else {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                        Toast.makeText(Pesticides.this, "State : False", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
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

                    if (finalI==0){
                        Intent rice = new Intent(Pesticides.this,Rice.class);
                        startActivity(rice);
                    }else {
                        Intent sorghum = new Intent(Pesticides.this,Sorghum.class);
                        startActivity(sorghum);
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
                        Intent redgram = new Intent(Pesticides.this,RedGram.class);
                        startActivity(redgram);
                    }else {
                        Intent soybean = new Intent(Pesticides.this,Soybean.class);
                        startActivity(soybean);
                    }

                }
            });
        }
    }
    private void setSingleEvent2(GridLayout mainGrid2) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid2.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            CardView cardView = (CardView) mainGrid2.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (finalI==0){
                        Intent sunflower = new Intent(Pesticides.this,Sunflower.class);
                        startActivity(sunflower);
                    }else if (finalI==1){
                        Intent cotton = new Intent(Pesticides.this,Cotton.class);
                        startActivity(cotton);
                    }

                }
            });
        }
    }
}
