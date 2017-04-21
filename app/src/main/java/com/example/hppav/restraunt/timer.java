package com.example.hppav.restraunt;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.app.Activity;

import android.os.Handler;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class timer extends AppCompatActivity {


    private int sec=1800;
    private boolean running;
    private boolean wasrunning;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ffff8800")));
        // Bundle bundle=new Bundle();
        if(savedInstanceState!=null) {

            sec = savedInstanceState.getInt("sec");
            running=savedInstanceState.getBoolean("running");
            wasrunning=savedInstanceState.getBoolean("wasrunning");
        }

        runTimer();
    }

    private void runTimer()
    {
        running=true;
        final TextView t=(TextView)findViewById(R.id.timeview);
        final Handler handler= new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hrs=sec/3600;
                int min=(sec%3600)/60;
                int s=sec%60;
                String time=String.format("%d:%02d:%02d",hrs,min,s);
                t.setText(time);
                if(running)
                {
                    sec--;
                }
                handler.postDelayed(this,500);
            }


        });
    }
    @Override
    public void onSaveInstanceState(Bundle b)
    {
        b.putInt("sec",sec);
        b.putBoolean("running",running);

    }

    @Override
    public  void onResume()
    {
        super.onResume();

        if(wasrunning)
            running=true;
    }
    public void rate(View v)
    {
        Intent p=new Intent(timer.this,rate.class);
        startActivity(p);
    }


}