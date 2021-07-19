package com.farmerfriend;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.TextView;
import android.widget.Toast;

import com.farmerfriend.R;

public class Home extends Activity implements OnItemSelectedListener {

    //SharedPrefs
    public static final String MyPREFERENCES = "MyPrefs";
    public static final String CROP = "cropkey";
    public static final String SOIL="soilkey";
    public static final String AREA = "areaKey";
    public static final String WATER_LEVEL = "waterlevelKey";
    public static final String STATE = "stateKey";
    public static final String CITY = "cityKey";
    public static final String LOCALLE = "localleKey";
    //Stored Objects
    public static String crop;
    public static String soil;
    public static String area;
    public static String water_level;
    public static String state;
    public static String city;
    //TextViews
    public TextView title,stateTV,cityTV,cropTV,soilTV,lengthTV,waterTV,contacts;

    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        state=getIntent().getStringExtra("state");

        if(state.equals("Tamil Nadu")){
            tamil_nadu();
        }else {
            andra_pradesh();
        }

    }

    public void tamil_nadu(){
//        SharedPreferences sharedPreferences;
        String currentLanguage;

        currentLanguage = "ta";

        final Locale locale = new Locale(currentLanguage);

        Locale.setDefault(locale);

        Configuration configuration = new Configuration();

        configuration.locale = locale;

        getBaseContext().getResources().updateConfiguration(configuration,
                getBaseContext().getResources().getDisplayMetrics());

        title=(TextView) findViewById(R.id.titleTV);
        cityTV=(TextView)findViewById(R.id.cityTV);
        cropTV=(TextView)findViewById(R.id.cropTV);
        soilTV=(TextView)findViewById(R.id.soilTV);
        lengthTV=(TextView)findViewById(R.id.lengthTV);
        waterTV=(TextView)findViewById(R.id.waterTV);

        title.setText(R.string.farmers_friend);
        cityTV.setText(R.string.select_city);
        cropTV.setText(R.string.choose_crop);
        soilTV.setText(R.string.select_soil);
        lengthTV.setText(R.string.choose_area_length_in_hectares);
        waterTV.setText(R.string.select_water_level);


        //Button
        Button submit = (Button) findViewById(R.id.submit);
        submit.setText(R.string.submit);
        final SharedPreferences sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        // Spinner elements
        Spinner spinner_crop = (Spinner) findViewById(R.id.spinner_crop);
        Spinner spinner_soil = (Spinner) findViewById(R.id.spinner_soil);
        Spinner spinner_area = (Spinner) findViewById(R.id.spinner_area);
        Spinner spinner_water_level = (Spinner) findViewById(R.id.spinner_water_level);
        Spinner spinner_city = (Spinner) findViewById(R.id.spinner_city);

        // Spinner click listeners
        spinner_crop.setOnItemSelectedListener(this);
        spinner_soil.setOnItemSelectedListener(this);
        spinner_area.setOnItemSelectedListener(this);
        spinner_water_level.setOnItemSelectedListener(this);
        spinner_city.setOnItemSelectedListener(this);

        // Spinner Drop down elements for crop
        List<String> categories_crop = new ArrayList<String>();
        categories_crop.add(getString(R.string.Rice));
        categories_crop.add(getString(R.string.Wheat));
        categories_crop.add(getString(R.string.Jowar));
        categories_crop.add(getString(R.string.Bajra));
        categories_crop.add(getString(R.string.Ragi));
//        categories_crop.add(getString(R.string.Maize));
        categories_crop.add(getString(R.string.Korra));
        categories_crop.add(getString(R.string.Varagu));
        categories_crop.add(getString(R.string.Samai));
        categories_crop.add(getString(R.string.Bengalgram));
        categories_crop.add(getString(R.string.Redgram));
        categories_crop.add(getString(R.string.Greengram));
        categories_crop.add(getString(R.string.Blackgram));
        categories_crop.add(getString(R.string.Horsegram));
        categories_crop.add(getString(R.string.Paddy));
        categories_crop.add(getString(R.string.Sugarcane));
        categories_crop.add(getString(R.string.Chillies));
        categories_crop.add(getString(R.string.Potato));
        categories_crop.add(getString(R.string.Banana));
        categories_crop.add(getString(R.string.Mango));
        categories_crop.add(getString(R.string.Groundnut));
        categories_crop.add(getString(R.string.Gingelly));
        categories_crop.add(getString(R.string.Cotton));
        categories_crop.add(getString(R.string.Cashewnut));

        //Spinner Drop down elements for soil
        List<String> categories_soil = new ArrayList<>();
        categories_soil.add(getString(R.string.alluvial_soil));
        categories_soil.add(getString(R.string.red_soil));
        categories_soil.add(getString(R.string.black_soil));
        categories_soil.add(getString(R.string.laterate_soil));
        categories_soil.add(getString(R.string.mountain_soil));

        //Spinner Drop down elements for area
        List<String> categories_area = new ArrayList<String>();
        categories_area.add(getString(R.string.Hectare));
        categories_area.add(getString(R.string.Hectares2));
        categories_area.add(getString(R.string.Hectares3));
        categories_area.add(getString(R.string.Hectares4));

        //Spinner Drop down elements for Water Level
        List<String> categories_water_level = new ArrayList<>();
        categories_water_level.add(getString(R.string.High));
        categories_water_level.add(getString(R.string.Medium));
        categories_water_level.add(getString(R.string.Low));

        //Spinner Drop down elements for city
        List<String> categories_city_tamilnadu = new ArrayList<>();
        categories_city_tamilnadu.add(getString(R.string.Ariyalur));
        categories_city_tamilnadu.add(getString(R.string.Chennai));
        categories_city_tamilnadu.add(getString(R.string.Coimbatore));
        categories_city_tamilnadu.add(getString(R.string.Cuddalore));
        categories_city_tamilnadu.add(getString(R.string.Dharmapuri));
        categories_city_tamilnadu.add(getString(R.string.Dindigul));
        categories_city_tamilnadu.add(getString(R.string.Erode));
        categories_city_tamilnadu.add(getString(R.string.Kancheepuram));
        categories_city_tamilnadu.add(getString(R.string.Karur));
        categories_city_tamilnadu.add(getString(R.string.Krishnagiri));
        categories_city_tamilnadu.add(getString(R.string.Madurai));
        categories_city_tamilnadu.add(getString(R.string.Nagapattinam));
        categories_city_tamilnadu.add(getString(R.string.Kanyakumari));
        categories_city_tamilnadu.add(getString(R.string.Namakkal));
        categories_city_tamilnadu.add(getString(R.string.Perambalur));
        categories_city_tamilnadu.add(getString(R.string.Pudukottai));
        categories_city_tamilnadu.add(getString(R.string.Ramanathapuram));
        categories_city_tamilnadu.add(getString(R.string.Salem));
        categories_city_tamilnadu.add(getString(R.string.Sivagangai));
        categories_city_tamilnadu.add(getString(R.string.Thanjavur));
        categories_city_tamilnadu.add(getString(R.string.Theni));
        categories_city_tamilnadu.add(getString(R.string.Thiruvallur));
        categories_city_tamilnadu.add(getString(R.string.Thiruvarur));
        categories_city_tamilnadu.add(getString(R.string.Tuticorin));
        categories_city_tamilnadu.add(getString(R.string.Trichirappalli));
        categories_city_tamilnadu.add(getString(R.string.Thirunelveli));
        categories_city_tamilnadu.add(getString(R.string.Tiruppur));
        categories_city_tamilnadu.add(getString(R.string.Thiruvannamalai));
        categories_city_tamilnadu.add(getString(R.string.TheNilgiris));
        categories_city_tamilnadu.add(getString(R.string.Vellore));
        categories_city_tamilnadu.add(getString(R.string.Villupuram));
        categories_city_tamilnadu.add(getString(R.string.Virudhunagar));

        ArrayAdapter<String> dataAdapter_crop = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories_crop);
        ArrayAdapter<String> dataAdapter_soil = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item, categories_soil);
        ArrayAdapter<String> dataAdapter_area = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories_area);
        ArrayAdapter<String> dataAdapter_water_level = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, categories_water_level);
        ArrayAdapter<String> dataAdapter_city = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, categories_city_tamilnadu);

        // Drop down layout style - list view with radio button
        dataAdapter_crop.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapter_soil.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapter_area.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapter_water_level.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapter_city.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinners
        spinner_crop.setAdapter(dataAdapter_crop);
        spinner_soil.setAdapter(dataAdapter_soil);
        spinner_area.setAdapter(dataAdapter_area);
        spinner_water_level.setAdapter(dataAdapter_water_level);
        spinner_city.setAdapter(dataAdapter_city);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                SharedPreferences sharedPreferences=getSharedPreferences(MyPREFERENCES,MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString(CROP, crop);
                editor.putString(SOIL,soil);
                editor.putString(AREA, area);
                editor.putString(WATER_LEVEL, water_level);
                editor.putString(STATE, state);
                editor.putString(CITY, city);
                editor.commit();
                Intent adk = new Intent(Home.this, MainActivity.class);
//                adk.putExtra("state",state);
                startActivity(adk);
//                Toast.makeText(Home.this, state, Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }

    public void andra_pradesh(){
        String currentLanguage;

        currentLanguage = "";

        final Locale locale = new Locale(currentLanguage);

        Locale.setDefault(locale);

        Configuration configuration = new Configuration();

        configuration.locale = locale;

        getBaseContext().getResources().updateConfiguration(configuration,
                getBaseContext().getResources().getDisplayMetrics());

        title=(TextView) findViewById(R.id.titleTV);
        cityTV=(TextView)findViewById(R.id.cityTV);
        cropTV=(TextView)findViewById(R.id.cropTV);
        soilTV=(TextView)findViewById(R.id.soilTV);
        lengthTV=(TextView)findViewById(R.id.lengthTV);
        waterTV=(TextView)findViewById(R.id.waterTV);

        title.setText(R.string.farmers_friend);
        cityTV.setText(R.string.select_city);
        cropTV.setText(R.string.choose_crop);
        soilTV.setText(R.string.select_soil);
        lengthTV.setText(R.string.choose_area_length_in_hectares);
        waterTV.setText(R.string.select_water_level);


        //Button
        Button submit = (Button) findViewById(R.id.submit);
        submit.setText(R.string.submit);
        final SharedPreferences sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        // Spinner elements
        Spinner spinner_crop = (Spinner) findViewById(R.id.spinner_crop);
        Spinner spinner_soil = (Spinner) findViewById(R.id.spinner_soil);
        Spinner spinner_area = (Spinner) findViewById(R.id.spinner_area);
        Spinner spinner_water_level = (Spinner) findViewById(R.id.spinner_water_level);
        Spinner spinner_city = (Spinner) findViewById(R.id.spinner_city);

        // Spinner click listeners
        spinner_crop.setOnItemSelectedListener(this);
        spinner_soil.setOnItemSelectedListener(this);
        spinner_area.setOnItemSelectedListener(this);
        spinner_water_level.setOnItemSelectedListener(this);
        spinner_city.setOnItemSelectedListener(this);

        // Spinner Drop down elements for crop
        List<String> categories_crop = new ArrayList<String>();
        categories_crop.add(getString(R.string.Rice));
        categories_crop.add(getString(R.string.Wheat));
        categories_crop.add(getString(R.string.Jowar));
        categories_crop.add(getString(R.string.Bajra));
        categories_crop.add(getString(R.string.Ragi));
//        categories_crop.add(getString(R.string.Maize));

        categories_crop.add(getString(R.string.Redgram));
        categories_crop.add(getString(R.string.Greengram));
        categories_crop.add(getString(R.string.Blackgram));
        categories_crop.add(getString(R.string.Horsegram));
        categories_crop.add(getString(R.string.Paddy));
        categories_crop.add(getString(R.string.Sugarcane));
        categories_crop.add(getString(R.string.Chillies));
        categories_crop.add(getString(R.string.Potato));
        categories_crop.add(getString(R.string.Banana));
        categories_crop.add(getString(R.string.Mango));
        categories_crop.add(getString(R.string.Groundnut));

        categories_crop.add(getString(R.string.Cotton));
        categories_crop.add(getString(R.string.Cashewnut));

        //Spinner Drop down elements for soil
        List<String> categories_soil = new ArrayList<>();
        categories_soil.add(getString(R.string.alluvial_soil));
        categories_soil.add(getString(R.string.red_soil));
        categories_soil.add(getString(R.string.black_soil));
        categories_soil.add(getString(R.string.laterate_soil));
        categories_soil.add(getString(R.string.mountain_soil));

        //Spinner Drop down elements for area
        List<String> categories_area = new ArrayList<String>();
        categories_area.add(getString(R.string.Hectare));
        categories_area.add(getString(R.string.Hectares2));
        categories_area.add(getString(R.string.Hectares3));
        categories_area.add(getString(R.string.Hectares4));

        //Spinner Drop down elements for Water Level
        List<String> categories_water_level = new ArrayList<>();
        categories_water_level.add(getString(R.string.High));
        categories_water_level.add(getString(R.string.Medium));
        categories_water_level.add(getString(R.string.Low));

        List<String> categories_city = new ArrayList<>();
        categories_city.add("Jalgaon");
        categories_city.add("Bhusawal");
        categories_city.add("Amalner");
        categories_city.add("Pachora");
        categories_city.add("Bhadgaon");
        categories_city.add("Raver");
        categories_city.add("Chopda");
        categories_city.add("Muktainagar");
        categories_city.add("Jamner");
        categories_city.add("Faizpur");
        categories_city.add("Yawal");
        categories_city.add("Bodwad");

        ArrayAdapter<String> dataAdapter_crop = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories_crop);
        ArrayAdapter<String> dataAdapter_soil = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item, categories_soil);
        ArrayAdapter<String> dataAdapter_area = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories_area);
        ArrayAdapter<String> dataAdapter_water_level = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, categories_water_level);
        ArrayAdapter<String> dataAdapter_city = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, categories_city);

        // Drop down layout style - list view with radio button
        dataAdapter_crop.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapter_soil.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapter_area.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapter_water_level.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapter_city.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinners
        spinner_crop.setAdapter(dataAdapter_crop);
        spinner_soil.setAdapter(dataAdapter_soil);
        spinner_area.setAdapter(dataAdapter_area);
        spinner_water_level.setAdapter(dataAdapter_water_level);
        spinner_city.setAdapter(dataAdapter_city);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                SharedPreferences sharedPreferences=getSharedPreferences(MyPREFERENCES,MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString(CROP, crop);
                editor.putString(SOIL,soil);
                editor.putString(AREA, area);
                editor.putString(WATER_LEVEL, water_level);
                editor.putString(STATE, state);
                editor.putString(CITY, city);
                editor.commit();
                Intent adk = new Intent(Home.this, MainActivity.class);
                adk.putExtra("state",state);
                startActivity(adk);
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?>parent, View view, int position, long id) {

        switch (parent.getId()) {
            case R.id.spinner_city:
                city = parent.getItemAtPosition(position).toString();
            case R.id.spinner_crop:
                crop = parent.getItemAtPosition(position).toString();
            case R.id.spinner_area:
                area = parent.getItemAtPosition(position).toString();
            case R.id.spinner_water_level:
                water_level = parent.getItemAtPosition(position).toString();
        }
    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }
}