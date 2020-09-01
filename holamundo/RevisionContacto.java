package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
public class RevisionContacto extends AppCompatActivity {

    private TextView nombre2;
    private TextView telefono2;
    private TextView email2;
    private TextView desc2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.evision_contacto);

        nombre2 = (TextView)findViewById(R.id.nombre2);
        String dato=getIntent().getStringExtra("dato");
          nombre2.setText("Nombre: "+dato);


        telefono2 = (TextView)findViewById(R.id.telefono2);
        String dato2=getIntent().getStringExtra("dato2");
        telefono2.setText("Telefono: "+dato2);

        email2 = (TextView)findViewById(R.id.email2);
        String dato3=getIntent().getStringExtra("dato3");
        email2.setText("Email: "+dato3);

      desc2 = (TextView)findViewById(R.id.desc2);
        String dato4=getIntent().getStringExtra("dato4");
        desc2.setText("Descripción: "+dato4);
    }
    public void Regresar(View View)
    {
        Intent v= new Intent(this,MainActivity.class);
        startActivity(v);
    }

}