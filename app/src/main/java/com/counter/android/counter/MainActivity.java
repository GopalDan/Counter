package com.counter.android.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(" ");
    }
    public void countup(View v){
        score= score+1;
        TextView count = (TextView) findViewById(R.id.count);
        count.setText(""+ score);
    }
    public void countdown(View v){
        score= score-1;
        TextView count = (TextView) findViewById(R.id.count);
        count.setText("" + score);
    }
    public void reset (View v){
        score= 0;
        TextView count = (TextView) findViewById(R.id.count);
        count.setText(" " + score);
    }
}
