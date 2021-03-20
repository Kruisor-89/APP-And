package com.larguijo.mvparch;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textNombreUsuairo;
    private TextView txtPeso;
    private TextView textMasaCorporal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textNombreUsuairo= findViewById(R.id.textName);

    }

    private void bindViews() {
        textNombreUsuairo.findViewById(R.id.textName);
        txtPeso.findViewById(R.id.textPeso);
        textMasaCorporal.findViewById(R.id.textMasaCorporal);
    }

    private void setText() {
        String nombre = "Luis arguijo";
        String peso = "70 kg";
        String masaCoproral = "30%";
        textNombreUsuairo.setText(nombre);
    }
}