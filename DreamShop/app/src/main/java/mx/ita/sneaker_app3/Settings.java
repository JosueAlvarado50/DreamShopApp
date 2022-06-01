package mx.ita.sneaker_app3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Settings extends AppCompatActivity {

        private Button noche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        //boton de idiomas inicio
        Button en=findViewById(R.id.btnIdioma);
        Button es=findViewById(R.id.BtnEspañol);
        LanguageManager lang = new LanguageManager(this);
        //boton ingles
        en.setOnClickListener(view ->
        {
            lang.updateResource("en");
            recreate();
        });
        es.setOnClickListener(view ->
        {
            lang.updateResource("es");
            recreate();
        });
//boton de idiomas cierre

        noche = findViewById(R.id.buttonnoche);

        noche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nightMode = AppCompatDelegate.getDefaultNightMode();
                if (nightMode == AppCompatDelegate.MODE_NIGHT_YES) {
                    AppCompatDelegate.setDefaultNightMode
                            (AppCompatDelegate.MODE_NIGHT_NO);
                } else {
                    AppCompatDelegate.setDefaultNightMode
                            (AppCompatDelegate.MODE_NIGHT_YES);
                }

            }
        });
    }
}