package com.android_second.ueeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {
    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        myDialog = new Dialog(this);

        Button login = findViewById(R.id.login);
        Button skip_login = findViewById(R.id.skiplogin);
        TextView create_account = findViewById(R.id.create_account);
        TextView forget_password = findViewById(R.id.forgetpassword);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHomeActivity();
            }
        });

        skip_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHomeActivity();
            }
        });

        create_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRegisterActivity();
            }
        });

        forget_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowPopup();
            }
        });




    }

    public void openHomeActivity(){
        Intent home = new Intent(this, HomeScreen.class);
        startActivity(home);
    }
    public void openRegisterActivity(){
        Intent register = new Intent(this, RegisterActivity.class);
        startActivity(register);
    }
    public void ShowPopup(){
        TextView txtclose;
        Button cancel;
        Button submit;
        myDialog.setContentView(R.layout.forgotpw_popup);
        txtclose = (TextView) myDialog.findViewById(R.id.close);
        cancel = (Button) myDialog.findViewById(R.id.forgetcancel);
        submit = (Button) myDialog.findViewById(R.id.forgetsubmit);

        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }
}