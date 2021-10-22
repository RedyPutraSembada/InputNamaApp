package com.example.inputnamaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView hasil,input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hasil=findViewById(R.id.hasil);
        input=findViewById(R.id.input);
    }

    public void cetakNama(View v){
        hasil.setText("Nama Anda : "+input.getText());
    }
}