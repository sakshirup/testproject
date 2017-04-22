package com.example.hppav.restraunt;

import android.Manifest;
import android.app.ActionBar;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Create_New_Account extends AppCompatActivity {
    private static final int MY_PERMISSIONS_REQUEST_SEND_SMS = 0;
    String phoneNo;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create__new__account);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Create New Account");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ffff8800")));
        Button c=(Button)findViewById(R.id.button2);
        c.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                //sendSMSMessage();
                Intent i=new Intent(Create_New_Account.this,sms.class);
                startActivity(i);
                Toast.makeText(Create_New_Account.this, "Your account has been succesfully created", Toast.LENGTH_SHORT).show();

            }
        });
    }
    public  void sendSMSMessage() {
      EditText txtphoneNo = (EditText) findViewById(R.id.editText7);
       EditText username=(EditText)findViewById(R.id.editText4);
    phoneNo = txtphoneNo.getText().toString();
        name=username.getText().toString();
        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
        PendingIntent pi= PendingIntent.getActivity(getApplicationContext(), 0, intent,0);
        SmsManager sms=SmsManager.getDefault();
        sms.sendTextMessage(phoneNo, null,"Hi"+name+"Your account has been successfully created.Now enjoy the special offers for our registered customers", pi,null);
        Toast.makeText(getApplicationContext(), "Message Sent successfully!",
                Toast.LENGTH_LONG).show();




    }
}

