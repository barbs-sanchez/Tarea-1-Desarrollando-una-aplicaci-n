package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText Nombre;
    private EditText telefono;
    private EditText email;
    private EditText desc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Nombre = (EditText)findViewById(R.id.Nombre);

        telefono = (EditText)findViewById(R.id.telefono);

        email= (EditText)findViewById(R.id.email);

        desc= (EditText)findViewById(R.id.desc);

    }
       public void GuardarG(View View)
       {
           Intent i = new Intent(this,RevisionContacto.class);
           i.putExtra("dato",Nombre.getText().toString());
           i.putExtra("dato2",telefono.getText().toString());
           i.putExtra("dato3",email.getText().toString());
           i.putExtra("dato4",desc.getText().toString());
           startActivity(i);
       }

}