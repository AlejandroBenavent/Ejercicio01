package com.example.ejercicio01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Definicion de variables de Tipo Vista
    private TextView lblFrase;
    private EditText txtNombre;
    private Button btnReset;
    private Button btnSaludar;

    //Definicion de variables de Tipo Logico

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializaVista();

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lblFrase.setText("");
            }
        });

        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = txtNombre.getText().toString();
                if(!nombre.equals("")){
                    lblFrase.setText("Hola,"+nombre+" Buenos dias");
                }else{
                    Toast.makeText(MainActivity.this, "No has escrito ningun nombre", Toast.LENGTH_SHORT).show();
                }
                txtNombre.setText("");
            }
        });
    }

    private void inicializaVista() {
        lblFrase = findViewById(R.id.lblFraseMain);
        btnReset = findViewById(R.id.btnResetMain);
        btnSaludar = findViewById(R.id.btnSaludarMain);
        txtNombre = findViewById(R.id.txtNombreMain);
    }
}