package com.example.cl.sprintfinalmodulo4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.cl.sprintfinalmodulo4.databinding.ActivityMainBinding;
import com.example.cl.sprintfinalmodulo4.databinding.ActivitySegundaPantallaBinding;

public class SegundaPantalla extends AppCompatActivity {

    private ActivitySegundaPantallaBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_pantalla);

        binding = ActivitySegundaPantallaBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());


        binding.btnLinkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent implicitIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/felipe-gonzalez-urriola-9ab033207/"));
                startActivity(implicitIntent);
            }
        });

        binding.btnLlamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_CALL,
                        Uri.parse("tel:97928869"));
                startActivity(i);
            }
        });

        binding.btnContactar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mensaje = binding.textenviarCorreo.getText().toString();
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL,
                        new String[] { "felipegonzalezurr@gmail.com" });
                intent.putExtra(Intent.EXTRA_SUBJECT, "Sin asunto");
                intent.putExtra(Intent.EXTRA_TEXT, mensaje);

                intent.setType("message/rfc822");


                // Lanzo el selector de cliente de Correo
                startActivity(
                        Intent
                                .createChooser(intent,
                                        "Elije un cliente de Correo:"));

            }
        });

        binding.btnWhatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Creación de método con intent implícito para enviar mensaje por Whatsapp.

                    String contact = "+56999999999";
                    String url = "https://api.whatsapp.com/send?phone="+ contact +"&text= te comunicas con";
                    Intent implicitIntentWhatsapp = new Intent(Intent.ACTION_VIEW);
                    implicitIntentWhatsapp.setData(Uri.parse(url));
                    startActivity(implicitIntentWhatsapp);


            }
        });
    }
}