package edu.mx.ipn.cecyt9.intenciones;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void intenciones(View view) {
        Intent t=new Intent(this, MainActivity.class);
        startActivity(t);
    }

    public void calculadora(View view) {
        Intent t=new Intent(this, calculadora.class);
        startActivity(t);
    }

    public void reserva(View view) {
        Intent t=new Intent(this, reserva.class);
        startActivity(t);
    }
}
