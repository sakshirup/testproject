package com.example.hppav.restraunt;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Home");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ffff8800")));
        Button b1 = (Button) findViewById(R.id.starter);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, Starter.class);
                startActivity(i);
            }
        });
        Button b3 = (Button) findViewById(R.id.mc);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Home.this, main_course.class);
                startActivity(k);
            }
        });
        Button b4 = (Button) findViewById(R.id.salad);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l = new Intent(Home.this, Salad.class);
                startActivity(l);
            }
        });
        Button b5 = (Button) findViewById(R.id.drinks);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m = new Intent(Home.this,drink.class);
                startActivity(m);
            }
        });

        Button b2=(Button)findViewById(R.id.dessert);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(Home.this,Dessert.class);
                startActivity(j);
            }
        });
    }

        @Override
        public boolean onCreateOptionsMenu (Menu m)
        {
            getMenuInflater().inflate(R.menu.menu_act, m);
            return super.onCreateOptionsMenu(m);
        }

        @Override
        public boolean onOptionsItemSelected (MenuItem item){
            switch (item.getItemId()) {
                case R.id.Location:
                    Intent i = new Intent(Home.this, location.class);
                    startActivity(i);
                    return true;

                case R.id.About_us:
                    Intent k = new Intent(Home.this, about_us.class);
                    startActivity(k);
                    return true;

                case R.id.Feedback:
                    Intent j = new Intent(Home.this, feedback.class);
                    startActivity(j);
                    return true;


                default:
                    return super.onOptionsItemSelected(item);
            }


        }
    }

