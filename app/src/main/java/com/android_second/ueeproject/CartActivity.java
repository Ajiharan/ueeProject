package com.android_second.ueeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class CartActivity extends AppCompatActivity {
    private Spinner spin1,spin2,spin3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        spin1=findViewById(R.id.spin1);
        spin2=findViewById(R.id.spin2);
        spin3=findViewById(R.id.spin3);

        addSpinner(spin1);
        addSpinner(spin2);
        addSpinner(spin3);

    }

    private void addSpinner(Spinner spin){

        String[] items = new String[]{"1", "2", "3"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        spin.setAdapter(adapter);
    }
}