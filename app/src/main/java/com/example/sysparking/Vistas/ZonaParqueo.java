package com.example.sysparking.Vistas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.sysparking.R;

public class ZonaParqueo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zona_parqueo);
        getSupportActionBar().hide();
    }
}
