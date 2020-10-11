package com.android_second.ueeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.app.Notification;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class Payment extends AppCompatActivity {

    private Button btnChange;
    private RadioButton btnCard;
    private Button order_place;

    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        dialog = new Dialog(this);

        order_place = findViewById(R.id.button_place_order);
        order_place.setOnClickListener((view) ->{
            OrderConfirmation();
        });

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

        ImageView back = findViewById(R.id.img_arrow);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Payment.this, CartActivity.class);
                startActivity(intent);
            }
        });
    }

    private void OrderConfirmation() {
        TextView txtclose;
        Button OK;
        dialog.setContentView(R.layout.order_confirmation_popup);
        txtclose = (TextView) dialog.findViewById(R.id.close);
        OK = (Button) dialog.findViewById(R.id.ok);

        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        OK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }
}