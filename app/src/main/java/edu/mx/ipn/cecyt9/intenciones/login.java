package edu.mx.ipn.cecyt9.intenciones;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {

    TextView user,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user=findViewById(R.id.txtuser);
        pass=findViewById(R.id.txtpass);
    }

    public void entrar(View view) {
        if(!user.getText().toString().equals("")&&!pass.getText().toString().equals("")
                &&user.getText().toString().equals("alexis")&&pass.getText().toString().equals("practica")){
            Intent nueva=new Intent(this, menu.class);
            startActivity(nueva);
        }
        else{
            Toast.makeText(this, "Usuario y/o contraseña incorrectos", Toast.LENGTH_SHORT).show();
        }
    }
}
