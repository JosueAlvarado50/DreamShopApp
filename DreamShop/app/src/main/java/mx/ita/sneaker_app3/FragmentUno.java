package mx.ita.sneaker_app3;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;

public class FragmentUno extends Fragment {

    private View fragmento;
    private ImageView comics, figuras, consolas;

    public FragmentUno() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmento = inflater.inflate(R.layout.fragment_uno, container, false);

        comics = (ImageView) fragmento.findViewById(R.id.comics);
        figuras = (ImageView) fragmento.findViewById(R.id.figuras);
        consolas = (ImageView) fragmento.findViewById(R.id.consolas);


        comics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), AgregarproductoActivity.class);
                i.putExtra("categoria", "Cómics");
                startActivity(i);
            }
        });

        figuras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), AgregarproductoActivity.class);
                i.putExtra("categoria", "Figuras de colección");
                startActivity(i);
            }
        });

        consolas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), AgregarproductoActivity.class);
                i.putExtra("categoria", "Consolas de videojuegos");
                startActivity(i);
            }
        });

        return fragmento;
    }
}