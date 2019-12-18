package com.example.frutitas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner opcion;
    Button botonInsertar;
    Button  botonVerTodas ;
    Button botonVerUltima;
    Button  botonVerPorNombre;

    EditText textoNombre;
    EditText textPeso;
    Spinner SpinnerTipo;
    CheckBox checkBoxPodrido;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        opcion=(Spinner)findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.opcion,android.R.layout.simple_spinner_item);
        opcion.setAdapter(adapter);
        botonInsertar = (Button) findViewById(R.id.button);
        botonVerTodas = (Button) findViewById(R.id.button);
        botonVerUltima = (Button) findViewById(R.id.button);
        botonVerPorNombre = (Button) findViewById(R.id.button);

        textoNombre = (EditText) findViewById(R.id.editText);
        textPeso = (EditText) findViewById(R.id.editText2);
        checkBoxPodrido=(CheckBox) findViewById(R.id.checkBox);



        final BBDD_Helper dbHelper = new BBDD_Helper(this);



        botonInsertar.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {

                                                 SQLiteDatabase db = dbHelper.getWritableDatabase();

                                                 // Create a new map of values, where column names are the keys
                                                 ContentValues values = new ContentValues();

                                                 values.put(Extructura_BBDD.Nombre_campo2, textoNombre.getText().toString());
                                                 values.put(Extructura_BBDD.Nombre_campo3, textPeso.getText().toString());
                                                 values.put(Extructura_BBDD.Nombre_campo4, opcion.getSelectedItem().toString());
                                                 values.put(Extructura_BBDD.Nombre_campo5, checkBoxPodrido.isChecked());
                                                //

                                                 // Insert the new row, returning the primary key value of the new row
                                                 long newRowId = db.insert(Extructura_BBDD.Table_Name, null, values);
                                                 Toast.makeText(getApplicationContext(), "se a guardado:" + newRowId, Toast.LENGTH_LONG).show();
                                             }


                                         }
        );

    }

    public void verDatos(View view){
        Intent sigiente=new Intent(this,ventanaDeDatos.class);
        startActivity(sigiente);
    }
}
