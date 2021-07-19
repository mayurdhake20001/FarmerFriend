package com.farmerfriend.Video_Success_Stories.Videos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;
import com.farmerfriend.R;

public class MainActivityVideo extends AppCompatActivity {

    // RECYCLER VIEW FIELD
    RecyclerView recyclerView;

    // VECTOR FOR VIDEO URL'S
    Vector<YoutubeVideo> youtubeVideos = new Vector<YoutubeVideo>();

    int video_limit = 15;
    
    String video_Url[] = new String[video_limit];

    EditText custom_search;

    Button cs_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_video);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        video_Url[0] = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/xcRWqGwUUO8\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>";
        video_Url[1] = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/s1VDLdL4mbc\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>";
        video_Url[2] = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/6MVbTfAMNXA\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>";
        video_Url[3] = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/T9HdSqyZUjU\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>";
        video_Url[4] = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/h_LMR-zjWMg\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>";
        video_Url[5] = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Bnf8e65-F84\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>";
        video_Url[6] = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/GAeyseh-BGs\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>";
        video_Url[7] = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/VWeIWbKEjD0\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>";
        video_Url[8] = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/-_tvJtUHnmU\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>";
        video_Url[9] = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/lEfI_sytST8\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>";
        video_Url[10] = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ZnNVj1vlQCo\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>";
        video_Url[11] = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/XgwUnlTLlRQ\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>";
        video_Url[12] = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/_uOPbf5_9GU\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>";
        video_Url[13] = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/P3Z7g6G8tEY\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>";
        video_Url[14] = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/5cp3R26coHU\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>";

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        custom_search = (EditText) findViewById(R.id.custom_search);

        cs_button = (Button) findViewById(R.id.cs_button);

        cs_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String search_query = custom_search.getText().toString();

                custom_search.setText("");

                Intent intent = new Intent(getApplicationContext(), Webview.class);

                intent.putExtra("Search_Query", search_query);

                startActivity(intent);

            }
        });

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random random_num_generator = new Random();
        
        while (numbers.size() < video_limit) {
            int random = random_num_generator.nextInt(video_limit);
            if(!numbers.contains(random)) {
                numbers.add(random);
            }
        }
        
        // Load video list
        for (int num: numbers) {
            youtubeVideos.add(new YoutubeVideo(video_Url[numbers.get(num)]));
        }

//        youtubeVideos.add(new YoutubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/1bUlFUxMRvI\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
//        youtubeVideos.add(new YoutubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/3RpJ7m10vIg\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
//        youtubeVideos.add(new YoutubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/b6nWmWFxJDU\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
//        youtubeVideos.add(new YoutubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/MFgQdzkNWiE\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));

        VideoAdapter videoAdapter = new VideoAdapter(youtubeVideos);

        recyclerView.setAdapter(videoAdapter);

    }
}
