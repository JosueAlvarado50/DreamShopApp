package mx.ita.sneaker_app3;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.widget.Toast;

import java.util.Locale;

public class LanguageManager {

    private Context ct;
    public LanguageManager(Context ctx)
    {
        ct=ctx;
    }
    int idiomaValor;

    public void updateResource(String code)
    {
        Locale locale=new Locale(code);
        Locale.setDefault(locale);
        Resources resources =ct.getResources();
        Configuration configuration = resources.getConfiguration();
        configuration.locale = locale;
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }

}
