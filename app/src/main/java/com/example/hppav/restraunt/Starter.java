package com.example.hppav.restraunt;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;


public class Starter extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starter);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Home");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ffff8800")));
        CheckBox burger = (CheckBox) findViewById(R.id.beer);
        CheckBox dimsums = (CheckBox) findViewById(R.id.bm);
        CheckBox fries = (CheckBox) findViewById(R.id.Margarita);
        CheckBox pizza = (CheckBox) findViewById(R.id.ms);
        CheckBox pasta = (CheckBox) findViewById(R.id.bl);
        burger.setOnClickListener(this);
        dimsums.setOnClickListener(this);
        fries.setOnClickListener(this);
        pizza.setOnClickListener(this);
        pasta.setOnClickListener(this);
        Button drink=(Button)findViewById(R.id.button10);
        drink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent o6=new Intent(Starter.this,timer.class);
                startActivity(o6);
            }
        });
    }
    int p1 , p2 , p3 , p4 , p5 ;
    public void onClick(View v)
    {
        boolean check = ((CheckBox) v).isChecked();
        switch (v.getId()) {
            case R.id.beer:
                if(check)
                {
                    EditText e1 = (EditText) findViewById(R.id.e1);
                    int e11 = Integer.parseInt(e1.getText().toString());
                    p1 = e11 * 150;

                }
                break;
            case R.id.Margarita:
                if(check)
                {
                    EditText e3 = (EditText) findViewById(R.id.e2);
                    int e33 = Integer.parseInt(e3.getText().toString());
                    p3 = e33 * 120;

                }
                break;
            case R.id.bm:
                if(check)
                {
                    EditText e2 = (EditText) findViewById(R.id.e5);
                    int e22 = Integer.parseInt(e2.getText().toString());
                    p2 = e22 * 170;

                }
                break;
            case R.id.bl:
                if(check)
                {
                    EditText e5 = (EditText) findViewById(R.id.editText);
                    int e55 = Integer.parseInt(e5.getText().toString());
                    p5 = e55 * 330;

                }
                break;
            case R.id.ms:
                if(check)
                {
                    EditText e4 = (EditText) findViewById(R.id.editText3);
                    int e44 = Integer.parseInt(e4.getText().toString());
                    p4 = e44 * 300;

                }
                break;

        }
        float bill=p1+p2+p3+p4+p5;
        Toast.makeText(this, "your bill is"+bill, Toast.LENGTH_SHORT).show();


    }

}

