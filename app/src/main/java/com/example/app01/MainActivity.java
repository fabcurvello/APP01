package com.example.app01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etPrato ;
    TextView tvPedido ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPrato = findViewById(R.id.etPrato);
        tvPedido = findViewById(R.id.tvPedido);


    }

    public void fazerPedido(View view) {

        String prato = etPrato.getText().toString();
        tvPedido.setText("Seu prato: " + prato);

    }


}
