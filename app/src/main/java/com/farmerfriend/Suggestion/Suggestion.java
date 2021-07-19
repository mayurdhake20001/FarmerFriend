package com.farmerfriend.Suggestion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Formatter;

import com.farmerfriend.Constants;
import com.farmerfriend.R;

import static com.farmerfriend.Constants.Alluvial_Soil;
import static com.farmerfriend.Constants.Autumn;
import static com.farmerfriend.Constants.Black_Soil;
import static com.farmerfriend.Constants.Desert_Soil;
import static com.farmerfriend.Constants.Laterite_Soil;
import static com.farmerfriend.Constants.Mountain_Soil;
import static com.farmerfriend.Constants.Red_Soil;
import static com.farmerfriend.Constants.Spring;
import static com.farmerfriend.Constants.Summer;
import static com.farmerfriend.Constants.Winter;

public class Suggestion extends AppCompatActivity {

    ListView listView;

    TextView suggest;

    ArrayList<String> Result = new ArrayList<>();

    String state1, town1, motor1, soil1, water_level, season;

    String data[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestion);

        listView = (ListView) findViewById(R.id.listview);

        suggest = (TextView) findViewById(R.id.suggest);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

                state1 = "Tamil Nadu";
                town1 = "Dindigul";
                motor1 = "5";
                soil1 = "Laterite Soil";

                Formatter fmt = new Formatter();
                Calendar cal = Calendar.getInstance();
                fmt = new Formatter();
                fmt.format("%tB", cal);

                switch (Integer.parseInt(motor1)) {
                    case 1:
                        water_level = "Low";
                        break;
                    case 3:
                        water_level = "Medium";
                        break;
                    case 5:
                        water_level = "High";
                        break;
                    default:
                        water_level = "High";
                        break;
                }

                switch (fmt.toString()) {
                    case "January":
                        season = "Winter";
                        break;
                    case "February":
                        season = "Winter";
                        break;
                    case "March":
                        season = "Spring";
                        break;
                    case "April":
                        season = "Spring";
                        break;
                    case "May":
                        season = "Spring";
                        break;
                    case "June":
                        season = "Summer";
                        break;
                    case "July":
                        season = "Summer";
                        break;
                    case "August":
                        season = "Summer";
                        break;
                    case "September":
                        season = "Autumn";
                        break;
                    case "October":
                        season = "Autumn";
                        break;
                    case "November":
                        season = "Autumn";
                        break;
                    case "December":
                        season = "Winter";
                        break;
                }

//                if(Arrays.asList(Alluvial_Soil1).contains("Rice")) {
//                    Toast.makeText(getApplicationContext(), "Found: " + Arrays.toString(Alluvial_Soil1), Toast.LENGTH_LONG).show();
//                }

                suggest_location();

//                soil.setText("");

    }

    private void suggest_location() {
//        switch (soil1) {
//
//        }

        if(soil1.equals("Alluvial Soil")) {
//            Toast.makeText(getApplicationContext(), Alluvial_Soil.toString(), Toast.LENGTH_LONG).show();
            if(season.equals("Winter")) {
                for (String data : Alluvial_Soil) {
                    if (Arrays.asList(Alluvial_Soil).contains(data) && Arrays.asList(Winter).contains(data)) {
                        Result.add(data);
                    }
//                    Toast.makeText(getApplicationContext(), Result.toString(), Toast.LENGTH_LONG).show();
                }
            } else if (season.equals("Summer")) {
                for (String data : Alluvial_Soil) {
                    if (Arrays.asList(Alluvial_Soil).contains(data) && Arrays.asList(Summer).contains(data)) {
                        Result.add(data);
                    }
//                    Toast.makeText(getApplicationContext(), Result.toString(), Toast.LENGTH_LONG).show();
                }
            } else if (season.equals("Spring")) {
                for (String data : Alluvial_Soil) {
                    if (Arrays.asList(Alluvial_Soil).contains(data) && Arrays.asList(Spring).contains(data)) {
                        Result.add(data);
                    }
//                    Toast.makeText(getApplicationContext(), Result.toString(), Toast.LENGTH_LONG).show();
                }
            } else if (season.equals("Autumn")) {
                for (String data : Alluvial_Soil) {
                    if (Arrays.asList(Alluvial_Soil).contains(data) && Arrays.asList(Autumn).contains(data)) {
                        Result.add(data);
                    }
                    //Toast.makeText(getApplicationContext(), Result.toString(), Toast.LENGTH_LONG).show();
                }
            }
        } else if(soil1.equals("Red Soil")) {
//            Toast.makeText(getApplicationContext(), Red_Soil.toString(), Toast.LENGTH_LONG).show();
            if(season.equals("Winter")) {
                for (String data : Red_Soil) {
                    if (Arrays.asList(Red_Soil).contains(data) && Arrays.asList(Winter).contains(data)) {
                        Result.add(data);
                    }
                    //Toast.makeText(getApplicationContext(), Result.toString(), Toast.LENGTH_LONG).show();
                }
            } else if (season.equals("Summer")) {
                for (String data : Red_Soil) {
                    if (Arrays.asList(Red_Soil).contains(data) && Arrays.asList(Summer).contains(data)) {
                        Result.add(data);
                    }
                    //Toast.makeText(getApplicationContext(), Result.toString(), Toast.LENGTH_LONG).show();
                }
            } else if (season.equals("Spring")) {
                for (String data : Red_Soil) {
                    if (Arrays.asList(Red_Soil).contains(data) && Arrays.asList(Spring).contains(data)) {
                        Result.add(data);
                    }
                    //Toast.makeText(getApplicationContext(), Result.toString(), Toast.LENGTH_LONG).show();
                }
            } else if (season.equals("Autumn")) {
                for (String data : Red_Soil) {
                    if (Arrays.asList(Red_Soil).contains(data) && Arrays.asList(Autumn).contains(data)) {
                        Result.add(data);
                    }
                    //Toast.makeText(getApplicationContext(), Result.toString(), Toast.LENGTH_LONG).show();
                }
            }
        } else if(soil1.equals("Black Soil")) {
//            Toast.makeText(getApplicationContext(), Black_Soil.toString(), Toast.LENGTH_LONG).show();
            if(season.equals("Winter")) {
                for (String data : Black_Soil) {
                    if (Arrays.asList(Black_Soil).contains(data) && Arrays.asList(Winter).contains(data)) {
                        Result.add(data);
                    }
                    //Toast.makeText(getApplicationContext(), Result.toString(), Toast.LENGTH_LONG).show();
                }
            } else if (season.equals("Summer")) {
                for (String data : Black_Soil) {
                    if (Arrays.asList(Black_Soil).contains(data) && Arrays.asList(Summer).contains(data)) {
                        Result.add(data);
                    }
                    //Toast.makeText(getApplicationContext(), Result.toString(), Toast.LENGTH_LONG).show();
                }
            } else if (season.equals("Spring")) {
                for (String data : Black_Soil) {
                    if (Arrays.asList(Black_Soil).contains(data) && Arrays.asList(Spring).contains(data)) {
                        Result.add(data);
                    }
                    //Toast.makeText(getApplicationContext(), Result.toString(), Toast.LENGTH_LONG).show();
                }
            } else if (season.equals("Autumn")) {
                for (String data : Black_Soil) {
                    if (Arrays.asList(Black_Soil).contains(data) && Arrays.asList(Autumn).contains(data)) {
                        Result.add(data);
                    }
                    //Toast.makeText(getApplicationContext(), Result.toString(), Toast.LENGTH_LONG).show();
                }
            }
        } else if(soil1.equals("Laterite Soil")) {
//            Toast.makeText(getApplicationContext(), Laterite_Soil.toString(), Toast.LENGTH_LONG).show();
            if(season.equals("Winter")) {
                for (String data : Laterite_Soil) {
                    if (Arrays.asList(Laterite_Soil).contains(data) && Arrays.asList(Winter).contains(data)) {
                        Result.add(data);
                    }
                    //Toast.makeText(getApplicationContext(), Result.toString(), Toast.LENGTH_LONG).show();
                }
            } else if (season.equals("Summer")) {
                for (String data : Laterite_Soil) {
                    if (Arrays.asList(Laterite_Soil).contains(data) && Arrays.asList(Summer).contains(data)) {
                        Result.add(data);
                    }
                    //Toast.makeText(getApplicationContext(), Result.toString(), Toast.LENGTH_LONG).show();
                }
            } else if (season.equals("Spring")) {
                for (String data : Laterite_Soil) {
                    if (Arrays.asList(Laterite_Soil).contains(data) && Arrays.asList(Spring).contains(data)) {
                        Result.add(data);
                    }
                    //Toast.makeText(getApplicationContext(), Result.toString(), Toast.LENGTH_LONG).show();
                }
            } else if (season.equals("Autumn")) {
                for (String data : Laterite_Soil) {
                    if (Arrays.asList(Laterite_Soil).contains(data) && Arrays.asList(Autumn).contains(data)) {
                        Result.add(data);
                    }
                    //Toast.makeText(getApplicationContext(), Result.toString(), Toast.LENGTH_LONG).show();
                }
            }
        } else if (soil1.equals("Desert Soil")) {
//            Toast.makeText(getApplicationContext(), Desert_Soil.toString(), Toast.LENGTH_LONG).show();
            if(season.equals("Winter")) {
                for (String data : Desert_Soil) {
                    if (Arrays.asList(Desert_Soil).contains(data) && Arrays.asList(Winter).contains(data)) {
                        Result.add(data);
                    }
                    //Toast.makeText(getApplicationContext(), Result.toString(), Toast.LENGTH_LONG).show();
                }
            } else if (season.equals("Summer")) {
                for (String data : Desert_Soil) {
                    if (Arrays.asList(Desert_Soil).contains(data) && Arrays.asList(Summer).contains(data)) {
                        Result.add(data);
                    }
                    //Toast.makeText(getApplicationContext(), Result.toString(), Toast.LENGTH_LONG).show();
                }
            } else if (season.equals("Spring")) {
                for (String data : Desert_Soil) {
                    if (Arrays.asList(Desert_Soil).contains(data) && Arrays.asList(Spring).contains(data)) {
                        Result.add(data);
                    }
                    //Toast.makeText(getApplicationContext(), Result.toString(), Toast.LENGTH_LONG).show();
                }
            } else if (season.equals("Autumn")) {
                for (String data : Desert_Soil) {
                    if (Arrays.asList(Desert_Soil).contains(data) && Arrays.asList(Autumn).contains(data)) {
                        Result.add(data);
                    }
                    //Toast.makeText(getApplicationContext(), Result.toString(), Toast.LENGTH_LONG).show();
                }
            }
        } else if (soil1.equals("Mountain Soil")) {
//            Toast.makeText(getApplicationContext(), Mountain_Soil.toString(), Toast.LENGTH_LONG).show();
            if(season.equals("Winter")) {
                for (String data : Mountain_Soil) {
                    if (Arrays.asList(Mountain_Soil).contains(data) && Arrays.asList(Winter).contains(data)) {
                        Result.add(data);
                    }
                    //Toast.makeText(getApplicationContext(), Result.toString(), Toast.LENGTH_LONG).show();
                }
            } else if (season.equals("Summer")) {
                for (String data : Mountain_Soil) {
                    if (Arrays.asList(Mountain_Soil).contains(data) && Arrays.asList(Summer).contains(data)) {
                        Result.add(data);
                    }
                    //Toast.makeText(getApplicationContext(), Result.toString(), Toast.LENGTH_LONG).show();
                }
            } else if (season.equals("Spring")) {
                for (String data : Mountain_Soil) {
                    if (Arrays.asList(Mountain_Soil).contains(data) && Arrays.asList(Spring).contains(data)) {
                        Result.add(data);
                    }
                    //Toast.makeText(getApplicationContext(), Result.toString(), Toast.LENGTH_LONG).show();
                }
            } else if (season.equals("Autumn")) {
                for (String data : Mountain_Soil) {
                    if (Arrays.asList(Mountain_Soil).contains(data) && Arrays.asList(Autumn).contains(data)) {
                        Result.add(data);
                    }
                    //Toast.makeText(getApplicationContext(), Result.toString(), Toast.LENGTH_LONG).show();
                }
            }
        }

        Toast.makeText(getApplicationContext(), Result.toString(), Toast.LENGTH_LONG).show();

        suggest.setText("You are suggested to plant one of the following crops in your farm land: (Your location, sand and water content were taken into consideration)");

        data = Result.toArray(new String[Result.size()]);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);

        listView.setAdapter(arrayAdapter);

    }
}
