package com.example.student.ccscoreboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //look in resources folder for layout and in layout folder for activity.main

    }
}

//R. refers to our assets and resources (sound files/images/xml files)
//when R is a big red error, the XML file has an error