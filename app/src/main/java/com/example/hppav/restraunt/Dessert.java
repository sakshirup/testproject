package com.example.hppav.restraunt;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Dessert extends AppCompatActivity implements View.OnClickListener{
    private float total=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Home");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ffff8800")));
        CheckBox brownie = (CheckBox) findViewById(R.id.cb1);
        CheckBox apple_pie = (CheckBox) findViewById(R.id.cb2);
        CheckBox waffle = (CheckBox) findViewById(R.id.cb3);
        CheckBox ice_cream = (CheckBox) findViewById(R.id.cb4);
        CheckBox cheesecake = (CheckBox) findViewById(R.id.cb5);
        brownie.setOnClickListener(this);
        apple_pie.setOnClickListener(this);
        waffle.setOnClickListener(this);
        ice_cream.setOnClickListener(this);
        cheesecake.setOnClickListener(this);
    }
    int p1 , p2 , p3 , p4 , p5 ;
    public void onClick(View v)
    {
        boolean check = ((CheckBox) v).isChecked();
        switch (v.getId()) {
            case R.id.cb1:
                if(check)
                {
                    EditText e1 = (EditText) findViewById(R.id.brownie);
                    int e11 = Integer.parseInt(e1.getText().toString());
                    p1 = e11 * 500;

                }
                break;
            case R.id.cb2:
                if(check)
                {
                    EditText e3 = (EditText) findViewById(R.id.apple_pie);
                    int e33 = Integer.parseInt(e3.getText().toString());
                    p3 = e33 * 450;

                }
                break;
            case R.id.cb3:
                if(check)
                {
                    EditText e2 = (EditText) findViewById(R.id.waffle);
                    int e22 = Integer.parseInt(e2.getText().toString());
                    p2 = e22 * 300;

                }
                break;
            case R.id.cb4:
                if(check)
                {
                    EditText e5 = (EditText) findViewById(R.id.ice_cream);
                    int e55 = Integer.parseInt(e5.getText().toString());
                    p5 = e55 * 350;

                }
                break;
            case R.id.cb5:
                if(check)
                {
                    EditText e4 = (EditText) findViewById(R.id.cheesecake);
                    int e44 = Integer.parseInt(e4.getText().toString());
                    p4 = e44 * 650;

                }
                break;

        }
        float bill=p1+p2+p3+p4+p5;
        Toast.makeText(this, "your bill is"+bill, Toast.LENGTH_SHORT).show();


    }
}



