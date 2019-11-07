package com.example.sysparking.Vistas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.Toast;

import com.example.sysparking.Presentador.ConsultFireBase;
import com.example.sysparking.Presentador.Interfaces.FirebaseSuccesListener;
import com.example.sysparking.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainPage extends AppCompatActivity implements FirebaseSuccesListener {

    DatabaseReference mDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getSupportActionBar().hide();

        mDatabase = FirebaseDatabase.getInstance().getReference().child("Persona");
        ConsultFireBase tdf = new ConsultFireBase(this);
        tdf.setInterfaz(this);
        tdf.getDatos(mDatabase);
    }

    @Override
    public void onDatosDescargados(boolean Descargados) {
        if (Descargados){
            Toast.makeText(this,"Se termino de descargar los datos.", Toast.LENGTH_LONG).show();
        }
    }
}
