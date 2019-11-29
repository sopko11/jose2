package com.example.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class segundoActiviti extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo_activiti);
    }
    public void sigiente( View view){
        Intent sigiente=new Intent(this,TreceraVentana.class);
        startActivity(sigiente);
    }

    public void anterior( View view){
        Intent volver=new Intent(this,MainActivity.class);
        startActivity(volver);
    }
}
