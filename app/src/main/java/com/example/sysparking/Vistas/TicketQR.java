package com.example.sysparking.Vistas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.sysparking.R;

public class TicketQR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_qr);
        getSupportActionBar().hide();

    }
}
