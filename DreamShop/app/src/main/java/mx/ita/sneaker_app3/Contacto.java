package mx.ita.sneaker_app3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Contacto extends AppCompatActivity {

    private Button buttonwhats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);




        buttonwhats = findViewById(R.id.buttonwhatscomp);
        Button buttonemail = findViewById(R.id.buttonemail);

        buttonemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto","smartorder@outlook.com", null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Contacto");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "Sugerencias y aclaraciones.");
                startActivity(Intent.createChooser(emailIntent, "enviar correo ..."));
            }
        });
        buttonwhats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
                sendIntent.setType("text/plain");
                startActivity(sendIntent);

            }
        });
    }
}