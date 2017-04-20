package com.example.hppav.restraunt;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Welcome");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ffff8800")));


    }
    public void continue_(View v)
    {
        Intent i=new Intent(this,Home.class);
        startActivity(i);
    }
    public void sign_up(View v1)
    {
        Intent j=new Intent(this,Create_New_Account.class);
        startActivity(j);
    }
}
