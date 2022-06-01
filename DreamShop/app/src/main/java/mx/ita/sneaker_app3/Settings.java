package mx.ita.sneaker_app3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Settings extends AppCompatActivity {

        private Button noche;
        int nightMode = AppCompatDelegate.getDefaultNightMode();
        int banderaIdioma ;//español == 1 && ingles == 2

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("banderaIdioma", banderaIdioma);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        //boton de idiomas inicio
        Button en=findViewById(R.id.btnIdioma);
        Button es=findViewById(R.id.BtnEspañol);
        LanguageManager lang = new LanguageManager(this);
        //boton ingles
        en.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                banderaIdioma = 2;
                lang.updateResource("en");
                recreate();
            }
        });
        es.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                banderaIdioma = 1;
                lang.updateResource("es");
                recreate();
            }
        });

//boton de idiomas cierre

        noche = findViewById(R.id.buttonnoche);
        noche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (nightMode == AppCompatDelegate.MODE_NIGHT_YES) {
                    AppCompatDelegate.setDefaultNightMode
                            (AppCompatDelegate.MODE_NIGHT_NO);
                    nightMode = 1;
                } else {
                    AppCompatDelegate.setDefaultNightMode
                            (AppCompatDelegate.MODE_NIGHT_YES);
                    nightMode = 2;
                }

            }

        });


    }
}