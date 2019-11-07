package com.example.sysparking.Presentador;

import android.content.Context;
import android.nfc.Tag;
import android.util.Log;

import androidx.annotation.NonNull;

import com.example.sysparking.Modelos.Persona;
import com.example.sysparking.Presentador.Interfaces.FirebaseSuccesListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ConsultFireBase {
    private  static final String TAG = "TraerDatosFireBase";
    Context contexto;
    private FirebaseSuccesListener mSuccessListener;

    public ConsultFireBase(Context contexto) {
        this.contexto = contexto;
    }

    public void setInterfaz(FirebaseSuccesListener interfaz){
        this.mSuccessListener = interfaz;
    }

    public void  getDatos(DatabaseReference mDatabase){
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot snapshot : dataSnapshot.getChildren()){
                    Persona person = snapshot.getValue(Persona.class);
                    assert person != null;
                    String Nombre = person.getNombres();
                    Log.i(TAG, "onDataChange: " + Nombre);
                }
                mSuccessListener.onDatosDescargados(true);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
