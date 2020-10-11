package com.android_second.ueeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Payment extends AppCompatActivity {

    private Button btnChange;
    private RadioButton btnCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        btnChange = findViewById(R.id.button_change_address);
        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Payment.this, AddressChange.class);
                startActivity(intent);
            }
        });

        btnCard  = findViewById(R.id.radio_btn_card);
        btnCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Payment.this, AddCardDetail.class);
                startActivity(intent);
            }
        });
    }
}