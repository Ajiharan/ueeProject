package com.android_second.ueeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);

        Button register = findViewById(R.id.register_user);
        TextView login = findViewById(R.id.log);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHomeActivity();
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLoginActivity();
            }
        });

    }
    public void openHomeActivity(){
        Intent home = new Intent(this, HomeScreen.class);
        startActivity(home);
    }
    public void openLoginActivity(){
        Intent login = new Intent(this, LoginActivity.class);
        startActivity(login);
    }
}