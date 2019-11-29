package com.example.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class cuatra extends AppCompatActivity {
    private int contador=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuatra);
    }
    public void mas1(View vista){
        contador=contador+1;
        mostrar();
    }
    public void mas2(View vista){
        contador=contador+2;
        mostrar();
    }
    public void mas3(View vista){
        contador=contador+3;
        mostrar();
    }
    public void mas4(View vista){
        contador=contador+4;
        mostrar();
    }
    public void mas5(View vista){
        contador=contador+5;
        mostrar();
    }
    public void mas6(View vista){
        contador=contador+6;
        mostrar();
    }
    public void mas7(View vista){
        contador=contador+7;
        mostrar();
    }
    public void mas8(View vista){
        contador=contador+8;
        mostrar();
    }
    public void mas9(View vista){
        contador=contador+9;
        mostrar();
    }
    public void mas0(View vista){
        contador=contador+0;
        mostrar();
    }
    public void mostrar(){
        TextView texto=(TextView)findViewById(R.id.textView);
        texto.setText(""+contador);

    }
}
