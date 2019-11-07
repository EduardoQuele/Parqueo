package com.example.sysparking.Vistas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.sysparking.R;

public class MainActivity extends AppCompatActivity {

    Button btnReserva;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnReserva = findViewById(R.id.btnReserva);

        btnReserva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(this, R.layout.activity_zona_parqueo);
            }
        });
    }

    private void startActivity(View.OnClickListener onClickListener, int activity_zona_parqueo) {
    }
}
