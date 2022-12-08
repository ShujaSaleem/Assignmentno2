package com.example.assignmentno2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class sms_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);
        Toast.makeText(sms_activity.this, "Welcome", Toast.LENGTH_SHORT).show();
        SMS();
    }

    public void SMS(){
        Button button = findViewById(R.id.b) ;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText_1 = findViewById(R.id.pn);
                EditText editText_2 = findViewById(R.id.m);

                String ph = editText_1.getText().toString();
                String msg = editText_2.getText().toString();

                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage(ph,null, msg, null,null);

                Toast.makeText(getApplicationContext(), "Message Send Successfully", Toast.LENGTH_SHORT).show();


            }
        });
    }
}