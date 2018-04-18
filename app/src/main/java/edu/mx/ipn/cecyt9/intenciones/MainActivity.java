package edu.mx.ipn.cecyt9.intenciones;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirPaginaWeb(View paginaWeb)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://cursosprogra.website"));
        startActivity(intent);
    }

    public void llamadaTelefono(View llamada)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL,
                Uri.parse("tel:57296000"));
        startActivity(intent);
    }

    public void googleMaps(View maps)
    {
        Uri ubicacion = Uri.parse("google.streetview:cbll=19.5141517,-99.1895475");
        Intent mapa = new Intent(Intent.ACTION_VIEW, ubicacion);
        mapa.setPackage("com.google.android.apps.maps");
        startActivity(mapa);
    }

    public void tomarFoto(View maps)
    {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        startActivity(intent);
    }

    public void mandarCorreo(View correo)
    {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto: Prueba");
        intent.putExtra(Intent.EXTRA_TEXT, "Contenido del correo: Prueba");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "eoropezag@ipn.mx"} );
        startActivity(intent);
    }

    public void street(View view) {
        Uri gmmIntentUri = Uri.parse("google.streetview:cbll=46.414382,10.013988");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
}
