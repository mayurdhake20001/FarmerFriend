package com.farmerfriend;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.nightonke.boommenu.*;
import com.nightonke.boommenu.Types.BoomType;
import com.nightonke.boommenu.Types.ButtonType;
import com.nightonke.boommenu.Types.DimType;
import com.nightonke.boommenu.Types.PlaceType;
import com.nightonke.boommenu.Util;

import java.util.Random;


public class MainActivity extends AppCompatActivity implements BoomMenuButton.OnSubButtonClickListener{

    //private BoomMenuButton boomMenuButton;
    private BoomMenuButton boomMenuButtonInActionBar;

    private Context mContext;
    private View mCustomView;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext=this;

        ActionBar mActionBar=getSupportActionBar();
        mActionBar.setDisplayShowHomeEnabled(false);
        mActionBar.setDisplayShowTitleEnabled(false);
        LayoutInflater mInflater=LayoutInflater.from(this);
        mActionBar.setTitle("Farmer's Friend");
        mCustomView=mInflater.inflate(R.layout.custom_actom_bar,null);
        TextView mTitleTextView=(TextView)mCustomView.findViewById(R.id.title_text);
        mTitleTextView.setText("Farmer's Friend");

        boomMenuButtonInActionBar=(BoomMenuButton)mCustomView.findViewById(R.id.boom);

        mActionBar.setCustomView(mCustomView);
        mActionBar.setDisplayShowCustomEnabled(true);
        ((Toolbar)mCustomView.getParent()).setContentInsetsAbsolute(0,0);
        String data_temp[]=new String[5];
//        boomMenuButton=(BoomMenuButton)findViewById(R.id.boom);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                boomMenuButtonInActionBar.boom();

            }
        }, 1000);




    }
    @Override
    public void onWindowFocusChanged(boolean hasFocus){
        super.onWindowFocusChanged(hasFocus);
        initBoom();
    }


    private void initBoom(){
        int number=4;

        Drawable[]drawables=new Drawable[number];
        int[]drawablesResource=new int[]{
               // R.drawable.sun1,
                R.drawable.suggestions,
             //   R.drawable.irrigation,
                R.drawable.success,
                R.drawable.contact,
                R.drawable.water1
        };
        for(int i=0;i<number;i++)
            drawables[i]=ContextCompat.getDrawable(mContext,drawablesResource[i]);

        String[]STRINGS=new String[]{
                "Whether",
                "Suggestions",
                "Pest&Irrigation",
                "Success Story",
                "Contact to Agroadvisories",
                "Water Contamination"
        };
        String[]strings=new String[number];
        for(int i=0;i<number;i++)
            strings[i]=STRINGS[i];

        int[][]colors=new int[number][2];
        for(int i=0;i<number;i++){
            colors[i][1]=GetRandomColor();
            colors[i][0]=Util.getInstance().getPressedColor(colors[i][1]);
        }

        ButtonType buttonType=ButtonType.CIRCLE;


        // Now with Builder, you can init BMB more convenient
//        new BoomMenuButton.Builder()
//        .subButtons(drawables,colors,strings)
//        .button(buttonType)
//        .boom(BoomType.PARABOLA)
//        .place(PlaceType.CIRCLE_9_1)
//        .boomButtonShadow(Util.getInstance().dp2px(2),Util.getInstance().dp2px(2))
//        .subButtonsShadow(Util.getInstance().dp2px(2),Util.getInstance().dp2px(2))
//        .onSubButtonClick(this)
//        .animator(this)
//        .init(boomMenuButton);
//

        // Now with Builder, you can init BMB more convenient
        new BoomMenuButton.Builder()
                .subButtons(drawables,colors,strings)
                .button(buttonType)
                .boom(BoomType.PARABOLA)
                .place(PlaceType.CIRCLE_6_5)
                .subButtonsShadow(Util.getInstance().dp2px(2),Util.getInstance().dp2px(2))
                .onSubButtonClick(this)
                //.animator()
                .dim(DimType.DIM_0)
                .init(boomMenuButtonInActionBar);
    }

    private String[]Colors={
            "#F44336",
            "#E91E63",
            "#9C27B0",
            "#2196F3",
            "#03A9F4",
            "#00BCD4",
            "#009688",
            "#4CAF50",
            "#8BC34A",
            "#CDDC39",
            "#FFEB3B",
            "#FFC107",
            "#FF9800",
            "#FF5722",
            "#795548",
            "#9E9E9E",
            "#607D8B"};

    public int GetRandomColor(){
        Random random=new Random();
        int p=random.nextInt(Colors.length);
        return Color.parseColor(Colors[p]);
    }

    @Override
    public void onClick(int buttonIndex) {
        if (buttonIndex==1){
            Intent success_stories=new Intent(MainActivity.this,com.farmerfriend.Video_Success_Stories.Videos.MainActivityVideo.class);
            startActivity(success_stories);
        }/*else if(buttonIndex==0){
         //   Intent weather = new Intent(MainActivity.this, com.farmerfriend.Weather_Report.activities.MainActivity.class);
        //    startActivity(weather);
        }else if (buttonIndex==2){
        //    Intent pest = new Intent(MainActivity.this, com.farmerfriend.FSecurity_CProd_Pest_Irrigation.Pest_Protection.Pesticides.class);
         //   startActivity(pest);
        }*/else if (buttonIndex==2){
            Intent contact = new Intent(MainActivity.this, com.farmerfriend.Contact.MainActivity.class);
            startActivity(contact);
        } else if (buttonIndex == 0) {
            Intent suggestion = new Intent(MainActivity.this, com.farmerfriend.Suggestion.Suggestion.class);
            startActivity(suggestion);
        } else if(buttonIndex==3) {
            Intent water = new Intent(MainActivity.this, com.farmerfriend.Water.Water.class);
            startActivity(water);
        }
    }
}
