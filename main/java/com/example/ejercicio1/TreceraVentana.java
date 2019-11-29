package com.example.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class TreceraVentana extends AppCompatActivity {
 private Button miboton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trecera_ventana);

    miboton=(Button)findViewById(R.id.c);

    }
    public void sigiente( View view){
        Intent sigiente=new Intent(this,cuatra.class);
        startActivity(sigiente);
    }
    public void anterior( View view){
        Intent volver=new Intent(this,segundoActiviti.class);
        startActivity(volver);
    }
    public void c(View vista){
        Toast.makeText(this,"c",Toast.LENGTH_SHORT).show();
    }
    public void n(View vista){
        Toast.makeText(this,"n",Toast.LENGTH_SHORT).show();
    }
    public void s(View vista){
        Toast.makeText(this,"s",Toast.LENGTH_SHORT).show();
    }
    public void no(View vista){
        Toast.makeText(this,"no",Toast.LENGTH_SHORT).show();
    }
    public void so(View vista){
        Toast.makeText(this,"so",Toast.LENGTH_SHORT).show();
    }
    public void o(View vista){
        Toast.makeText(this,"o",Toast.LENGTH_SHORT).show();
    }
    public void ne(View vista){
        Toast.makeText(this,"ne",Toast.LENGTH_SHORT).show();
    }
    public void se(View vista){
        Toast.makeText(this,"se",Toast.LENGTH_SHORT).show();
    }
    public void e(View vista){
        Toast.makeText(this,"e",Toast.LENGTH_SHORT).show();
    }



}
