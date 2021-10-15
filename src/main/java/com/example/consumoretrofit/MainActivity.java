package com.example.consumoretrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView id;
    TextView nombre;
    TextView correo;
    TextView telefono;
    TextView tiposangre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        id=findViewById(R.id.id);
        nombre=findViewById(R.id.nombre);
        correo=findViewById(R.id.correo);
        telefono=findViewById(R.id.telefono);
        tiposangre=findViewById(R.id.tiposangre);
        
    }
}