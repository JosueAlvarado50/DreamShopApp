package mx.ita.sneaker_app3;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class FragmentUno extends Fragment {

    private View fragmento;
    private ImageView tenis, ropa;
    private ImageView accesorios, mas;

    public FragmentUno() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmento = inflater.inflate(R.layout.fragment_uno, container, false);

        tenis = (ImageView) fragmento.findViewById(R.id.tenis);
        ropa = (ImageView) fragmento.findViewById(R.id.ropa);
        accesorios = (ImageView) fragmento.findViewById(R.id.accesorios);


        tenis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), AgregarproductoActivity.class);
                i.putExtra("categoria", "tenis");
                startActivity(i);
            }
        });

        ropa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), AgregarproductoActivity.class);
                i.putExtra("categoria", "ropa");
                startActivity(i);
            }
        });
        accesorios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), AgregarproductoActivity.class);
                i.putExtra("categoria", "accesorios");
                startActivity(i);
            }
        });



        return fragmento;
    }
}