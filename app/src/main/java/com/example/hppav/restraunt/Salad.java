package com.example.hppav.restraunt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Salad extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salad);


        EditText e = (EditText) findViewById(R.id.editText8);
        Spinner s = (Spinner) findViewById(R.id.spinner);
        switch (s.getId())

        {
            case 0:
                Toast.makeText(getApplicationContext(), "" + 500, Toast.LENGTH_SHORT).show();
                break;
            case 1:
                Toast.makeText(getApplicationContext(), "" + 300, Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(getApplicationContext(), "" + 600, Toast.LENGTH_SHORT).show();
                break;

        }
        Button drink=(Button)findViewById(R.id.button9);
        drink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent o5=new Intent(Salad.this,timer.class);
                startActivity(o5);
            }
        });

    }

}
