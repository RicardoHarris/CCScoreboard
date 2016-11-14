package com.example.student.ccscoreboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private TextView t1butt;
    viewVar.setText(""+0));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //look in resources folder for layout and in layout folder for activity.main
        t1butt = (TextView)findViewById(R.id.t1btv);
        t1btv.setText("0");
    }
    public void t1p1(){
        1++;
    }
}
//I tap out. I thought I knew java.. I was wrong

//R. refers to our assets and resources (sound files/images/xml files)
//when R is a big red error, the XML file has an error