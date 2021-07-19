package com.farmerfriend.Contact;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
import com.nightonke.boommenu.BoomMenuButton;
import com.nightonke.boommenu.Types.BoomType;
import com.nightonke.boommenu.Types.ButtonType;
import com.nightonke.boommenu.Types.PlaceType;
import com.nightonke.boommenu.Util;

import com.farmerfriend.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_contact);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        ((ListView)findViewById(R.id.list_view1)).setAdapter(new MyAdapter());
        ((ListView)findViewById(R.id.list_view1)).setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        ((BoomMenuButton)view.findViewById(R.id.boom_circle)).boom();
                    }
                });
    }

    class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return 26;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @SuppressLint({"SetTextI18n", "InflateParams"})
        @Override
        public View getView(final int position, View convertView, final ViewGroup parent) {

            final ViewHolder viewHolder;
            if (convertView == null) {
                convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_item, null);

                viewHolder = new ViewHolder();
                viewHolder.tv = (TextView) (TextView) convertView.findViewById(R.id.text_view);
                viewHolder.circleBoomMenuButton = (BoomMenuButton) convertView.findViewById(R.id.boom_circle);

                convertView.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) convertView.getTag();
            }
            if (position==0) {
                viewHolder.tv.setText("Ariyalur");
            }
            if (position==1){
                viewHolder.tv.setText("Coimbatore");
            }
            if (position==2){
                viewHolder.tv.setText("Cuddalore");
            }
            if (position==3){
                viewHolder.tv.setText("Dharmapuri");
            }
            if (position==4){
                viewHolder.tv.setText("Dindigul");
            }
            if (position==5){
                viewHolder.tv.setText("Erode");
            }

            if (position==6){
                viewHolder.tv.setText("Kancheepuram");
            }
            if (position==7){
                viewHolder.tv.setText("kanyakumari");
            }
            if (position==8){
                viewHolder.tv.setText("Karur");
            }
            if (position==9){
                viewHolder.tv.setText("Krishnagiri");
            }
            if (position==10){
                viewHolder.tv.setText("Nagapattinam");
            }
            if (position==11){
                viewHolder.tv.setText("Namakkal");
            }
            if (position==12){
                viewHolder.tv.setText("Perambalur");
            }
            if (position==13){
                viewHolder.tv.setText("Pudukkottai");
            }
            if (position==14){
                viewHolder.tv.setText("Ramanathapuram");
            }
            if (position==15){
                viewHolder.tv.setText("Salem");
            }
            if (position==16){
                viewHolder.tv.setText("Sivagangai");
            }

            if (position==17){
                viewHolder.tv.setText("Thanjavur");
            }
            if (position==18){
                viewHolder.tv.setText("Theni");
            }
            if (position==19){
                viewHolder.tv.setText("Thiruvallur");
            }
            if (position==20){
                viewHolder.tv.setText("Thiruvarur");
            }
            if (position==21){
                viewHolder.tv.setText("Thoothukudi");
            }
            if (position==22){
                viewHolder.tv.setText("Thirunelveli");
            }
            if (position==23){
                viewHolder.tv.setText("Tiruvannamali");
            }
            if (position==24){
                viewHolder.tv.setText("Nilgiris");
            }
            if (position==25){
                viewHolder.tv.setText("Vellore");
            }
            if (position==26){
                viewHolder.tv.setText("Villupuram");
            }
            if (position==27){
                viewHolder.tv.setText("Virudhunagar");
            }




            final Drawable[] circleSubButtonDrawables = new Drawable[3];
            int[] drawablesResource = new int[]{
                    R.drawable.phn,
                    R.drawable.phn, R.drawable.phn
            };
            for (int i = 0; i < 3; i++)
                circleSubButtonDrawables[i]
                        = ContextCompat.getDrawable(parent.getContext(), drawablesResource[i]);



            final String[] circleSubButtonTexts = new String[]{
                    "AO" ,
                    "HO",

"AAO"};
            final String[] circleSubButtonTexts1 = new String[]{
                    "9884632588" , "7402714354",
            "7373657722"};
            final String[] circleSubButtonTexts2 = new String[]{
                    "9487019885" ,"9443059186","9943366422"
            };
            final String[] circleSubButtonTexts3 = new String[]{
                    "9952991806" ,"9786867588",
            "9487063616"};
            final String[] circleSubButtonTexts4 = new String[]{
                    "9443513745" ,"9790161522",
            "9842808003"};
            final String[] circleSubButtonTexts5 = new String[]{
                    "9842545476" ,"9487076611","9788453175"};
            final String[] circleSubButtonTexts6 = new String[]{
                    "9488911262" ,"9362119780",
            "9789356607"};

            final String[] circleSubButtonTexts7 = new String[]{
                    "9445957787" ,"9362119780",
            "9789356607"};

            final String[] circleSubButtonTexts8 = new String[]{
                    "9445957787" ,"9444796094",
            "9380917722"};

            final String[] circleSubButtonTexts9 = new String[]{
                    "9488911262" ,"94442132935",
            "9789356607"};

            final String[] circleSubButtonTexts10 = new String[]{
                    "9445957787" ,"944476094",
            "9380917722"};

            final String[] circleSubButtonTexts11 = new String[]{
                    "9894297613" ,"9443580495",
            "9444213293"};

            final String[] circleSubButtonTexts12 = new String[]{
                    "9487568099" ,"9751678794",
            "9486018415"};

            final String[] circleSubButtonTexts13 = new String[]{
                    "9486448460" ,"9944439331",
            "9486448460"};

            final String[] circleSubButtonTexts14 = new String[]{
                    "984262514" ,"9524585752",
            "8526343852"};

            final String[] circleSubButtonTexts15 = new String[]{
                    "9788829333" ,"9786080333",
            "9095169418"};

            final String[] circleSubButtonTexts16 = new String[]{
                    "7639410333" ,"9443905346",
            "8056569831"};

            final String[] circleSubButtonTexts17 = new String[]{
                    "9551335891" ,"9786030418",
            "9786261746"};

            final String[] circleSubButtonTexts18 = new String[]{
                    "9865171306" ,"7010205692",
            "72000766866"};
            final String[] circleSubButtonTexts19 = new String[]{
                    "9486118714" ,"9788643941",
            "72000766866"};

            final String[] circleSubButtonTexts20 = new String[]{
                    "9095072563" ,"9976742142",
            "9696513060"};

            final String[] circleSubButtonTexts21 = new String[]{
                    "9629288369" ,"9443935420",
            "7373834331"};

            final String[] circleSubButtonTexts22 = new String[]{
                    "7550218057" ,"9894626915",
            "9787804774"};

            final String[] circleSubButtonTexts23 = new String[]{
                    "852395169" ,"9790180549",
            "9750353596"};

            final String[] circleSubButtonTexts24 = new String[]{
                    "9551350811" ,"9176691999",
            "9894095576"};

            final String[] circleSubButtonTexts25 = new String[]{
                    "9786979205" ,"9488122294",
            "9786581418"};

            final String[] circleSubButtonTexts26 = new String[]{
                    "9842468605" ,"9443455755",
            "9488232207"};

            final String[] circleSubButtonTexts27 = new String[]{
                    "9443430490" ,"9751280490",
            "9092745081"};

            final String[] circleSubButtonTexts28 = new String[]{
                    "9383434323" ,"7418653569",
            "9787876037"};

            final String[] circleSubButtonTexts29 = new String[]{
                    "9500556783" ,"9786486143",
            "984351426"};

            final String[] circleSubButtonTexts30 = new String[]{
                    "9894804130" ,"9566732062",
            "9585536458"};

            final String[] circleSubButtonTexts31 = new String[]{
                    "9488470723" ,"9442716933",
            "9994101599"};

            final String[] circleSubButtonTexts32 = new String[]{
                    "9600328797" ,"9865150681",
            "89404999"};



            final int[][] subButtonColors = new int[3][2];
            for (int i = 0; i < 3; i++) {
                subButtonColors[i][1] = GetRandomColor();
                subButtonColors[i][0] = Util.getInstance().getPressedColor(subButtonColors[i][1]);
            }

            // init the BMB with delay

            viewHolder.circleBoomMenuButton.postDelayed(new Runnable() {
                @Override
                public void run() {
                    // Now with Builder, you can init BMB more convenient
                    new BoomMenuButton.Builder()
                            .subButtons(circleSubButtonDrawables, subButtonColors, circleSubButtonTexts)
                            .button(ButtonType.CIRCLE)
                            .boom(BoomType.PARABOLA)
                            .place(PlaceType.CIRCLE_3_1)
                            .subButtonsShadow(Util.getInstance().dp2px(2), Util.getInstance().dp2px(2))
                            .onSubButtonClick(new BoomMenuButton.OnSubButtonClickListener() {
                                @SuppressLint("ShowToast")
                                @Override
                                public void onClick(int buttonIndex) {
                                    if (position==0){
                                        if (buttonIndex==0)
                                        {
                                            String dial = "tel: "+circleSubButtonTexts1[0];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else if (buttonIndex==1)
                                        {
                                            String dial = "tel: "+circleSubButtonTexts1[1];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else {
                                            String dial = "tel: "+circleSubButtonTexts1[2];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }
                                    }
                                    if (position==1){
                                        if (buttonIndex==0) {
                                            String dial = "tel: "+circleSubButtonTexts2[0];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else if (buttonIndex==1)
                                        {
                                            String dial = "tel: "+circleSubButtonTexts2[1];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else {
                                            String dial = "tel: "+circleSubButtonTexts2[2];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }
                                    }
                                    if (position==2){
                                        if (buttonIndex==0) {
                                            String dial = "tel: "+circleSubButtonTexts3[0];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else if (buttonIndex==1)
                                        {
                                            String dial = "tel: "+circleSubButtonTexts3[1];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else {
                                            String dial = "tel: "+circleSubButtonTexts3[2];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }
                                    }
                                    if (position==3){
                                        if (buttonIndex==0) {
                                            String dial = "tel: "+circleSubButtonTexts4[0];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else if (buttonIndex==1){
                                            String dial = "tel: "+circleSubButtonTexts4[1];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else {
                                            String dial = "tel: "+circleSubButtonTexts4[2];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }
                                    }
                                    if (position==4){
                                        if (buttonIndex==0) {
                                            String dial = "tel: "+circleSubButtonTexts5[0];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else if (buttonIndex==1){
                                            String dial = "tel: "+circleSubButtonTexts5[1];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else {
                                            String dial = "tel: "+circleSubButtonTexts5[2];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }
                                    }
                                    if (position==5){
                                        if (buttonIndex==0) {
                                            String dial = "tel: "+circleSubButtonTexts6[0];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else if (buttonIndex==1)
                                        {
                                            String dial = "tel: "+circleSubButtonTexts6[1];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else {
                                            String dial = "tel: "+circleSubButtonTexts6[2];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }
                                    }
                                    if (position==6){
                                        if (buttonIndex==0) {
                                            String dial = "tel: "+circleSubButtonTexts7[0];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else if (buttonIndex==1)
                                        {
                                            String dial = "tel: "+circleSubButtonTexts7[1];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else {
                                            String dial = "tel: "+circleSubButtonTexts7[2];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }
                                    }
                                    if (position==7){
                                        if (buttonIndex==0) {
                                            String dial = "tel: "+circleSubButtonTexts8[0];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else if (buttonIndex==1)
                                        {
                                            String dial = "tel: "+circleSubButtonTexts8[1];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else {
                                            String dial = "tel: "+circleSubButtonTexts8[2];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }
                                    }
                                    if (position==8){
                                        if (buttonIndex==0) {
                                            String dial = "tel: "+circleSubButtonTexts9[0];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else if (buttonIndex==1)
                                        {
                                            String dial = "tel: "+circleSubButtonTexts9[1];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else {
                                            String dial = "tel: "+circleSubButtonTexts9[2];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }
                                    }
                                    if (position==9){
                                        if (buttonIndex==0) {
                                            String dial = "tel: "+circleSubButtonTexts10[0];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else if (buttonIndex==1)
                                        {
                                            String dial = "tel: "+circleSubButtonTexts10[1];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else {
                                            String dial = "tel: "+circleSubButtonTexts10[2];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }
                                    }
                                    if (position==10){
                                        if (buttonIndex==0) {
                                            String dial = "tel: "+circleSubButtonTexts11[0];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else if (buttonIndex==1)
                                        {
                                            String dial = "tel: "+circleSubButtonTexts11[1];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else {
                                            String dial = "tel: "+circleSubButtonTexts11[2];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }
                                    }
                                    if (position==11){
                                        if (buttonIndex==0) {
                                            String dial = "tel: "+circleSubButtonTexts12[0];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else if (buttonIndex==1)
                                        {
                                            String dial = "tel: "+circleSubButtonTexts12[1];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else {
                                            String dial = "tel: "+circleSubButtonTexts12[2];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }
                                    }
                                    if (position==12){
                                        if (buttonIndex==0) {
                                            String dial = "tel: "+circleSubButtonTexts13[0];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else if (buttonIndex==1)
                                        {
                                            String dial = "tel: "+circleSubButtonTexts13[1];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else {
                                            String dial = "tel: "+circleSubButtonTexts13[2];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }
                                    }
                                    if (position==13){
                                        if (buttonIndex==0) {
                                            String dial = "tel: "+circleSubButtonTexts14[0];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else if (buttonIndex==1)
                                        {
                                            String dial = "tel: "+circleSubButtonTexts14[1];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else {
                                            String dial = "tel: "+circleSubButtonTexts14[2];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }
                                    }
                                    if (position==14){
                                        if (buttonIndex==0) {
                                            String dial = "tel: "+circleSubButtonTexts15[0];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else if (buttonIndex==1)
                                        {
                                            String dial = "tel: "+circleSubButtonTexts15[1];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else {
                                            String dial = "tel: "+circleSubButtonTexts15[2];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }
                                    }
                                    if (position==15){
                                        if (buttonIndex==0) {
                                            String dial = "tel: "+circleSubButtonTexts16[0];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else if (buttonIndex==1)
                                        {
                                            String dial = "tel: "+circleSubButtonTexts16[1];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else {
                                            String dial = "tel: "+circleSubButtonTexts16[2];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }
                                    }
                                    if (position==16){
                                        if (buttonIndex==0) {
                                            String dial = "tel: "+circleSubButtonTexts17[0];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else if (buttonIndex==1)
                                        {
                                            String dial = "tel: "+circleSubButtonTexts17[1];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else {
                                            String dial = "tel: "+circleSubButtonTexts17[2];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }
                                    }
                                    if (position==17){
                                        if (buttonIndex==0) {
                                            String dial = "tel: "+circleSubButtonTexts18[0];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else if (buttonIndex==1)
                                        {
                                            String dial = "tel: "+circleSubButtonTexts18[1];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else {
                                            String dial = "tel: "+circleSubButtonTexts18[2];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }
                                    }
                                    if (position==18){
                                        if (buttonIndex==0) {
                                            String dial = "tel: "+circleSubButtonTexts19[0];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else if (buttonIndex==1)
                                        {
                                            String dial = "tel: "+circleSubButtonTexts19[1];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else {
                                            String dial = "tel: "+circleSubButtonTexts19[2];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }
                                    }
                                    if (position==19){
                                        if (buttonIndex==0) {
                                            String dial = "tel: "+circleSubButtonTexts20[0];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else if (buttonIndex==1)
                                        {
                                            String dial = "tel: "+circleSubButtonTexts20[1];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else {
                                            String dial = "tel: "+circleSubButtonTexts20[2];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }
                                    }
                                    if (position==20){
                                        if (buttonIndex==0) {
                                            String dial = "tel: "+circleSubButtonTexts21[0];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else if (buttonIndex==1)
                                        {
                                            String dial = "tel: "+circleSubButtonTexts21[1];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else {
                                            String dial = "tel: "+circleSubButtonTexts21[2];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }
                                    }
                                    if (position==21){
                                        if (buttonIndex==0) {
                                            String dial = "tel: "+circleSubButtonTexts22[0];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else if (buttonIndex==1)
                                        {
                                            String dial = "tel: "+circleSubButtonTexts22[1];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else {
                                            String dial = "tel: "+circleSubButtonTexts22[2];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }
                                    }
                                    if (position==22){
                                        if (buttonIndex==0) {
                                            String dial = "tel: "+circleSubButtonTexts23[0];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else if (buttonIndex==1)
                                        {
                                            String dial = "tel: "+circleSubButtonTexts23[1];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else {
                                            String dial = "tel: "+circleSubButtonTexts23[2];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }
                                    }
                                    if (position==23){
                                        if (buttonIndex==0) {
                                            String dial = "tel: "+circleSubButtonTexts24[0];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else if (buttonIndex==1)
                                        {
                                            String dial = "tel: "+circleSubButtonTexts24[1];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else {
                                            String dial = "tel: "+circleSubButtonTexts24[2];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }
                                    }
                                    if (position==24){
                                        if (buttonIndex==0) {
                                            String dial = "tel: "+circleSubButtonTexts25[0];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else if (buttonIndex==1)
                                        {
                                            String dial = "tel: "+circleSubButtonTexts25[1];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else {
                                            String dial = "tel: "+circleSubButtonTexts25[2];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }
                                    }
                                    if (position==25){
                                        if (buttonIndex==0) {
                                            String dial = "tel: "+circleSubButtonTexts26[0];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else if (buttonIndex==1)
                                        {
                                            String dial = "tel: "+circleSubButtonTexts26[1];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else {
                                            String dial = "tel: "+circleSubButtonTexts26[2];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }
                                    }
                                    if (position==26){
                                        if (buttonIndex==0) {
                                            String dial = "tel: "+circleSubButtonTexts27[0];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else if (buttonIndex==1)
                                        {
                                            String dial = "tel: "+circleSubButtonTexts27[1];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else {
                                            String dial = "tel: "+circleSubButtonTexts27[2];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }
                                    }
                                    if (position==27){
                                        if (buttonIndex==0) {
                                            String dial = "tel: "+circleSubButtonTexts28[0];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else if (buttonIndex==1)
                                        {
                                            String dial = "tel: "+circleSubButtonTexts28[1];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }else {
                                            String dial = "tel: "+circleSubButtonTexts28[2];
                                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                                        }
                                    }


                                }
                            })
                            .init(viewHolder.circleBoomMenuButton);
                }
            }, 1);


            return convertView;
        }

            class ViewHolder {
                public TextView tv;
                public BoomMenuButton circleBoomMenuButton;
            }
        }

        private static String[] Colors = {
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

        public static int GetRandomColor() {
            Random random = new Random();
            int p = random.nextInt(Colors.length);
            return Color.parseColor(Colors[p]);
        }
    }
