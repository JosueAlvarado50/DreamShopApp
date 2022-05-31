package mx.ita.sneaker_app3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Settings extends AppCompatActivity {

        private Button noche;
        int nightMode = AppCompatDelegate.getDefaultNightMode();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
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