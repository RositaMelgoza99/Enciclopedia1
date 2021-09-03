package com.example.enciclopedia1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class adaptador extends BaseAdapter {
       Context contexto;
       List<componentes> lista;

    public adaptador(Context contexto, List<componentes> lista) {
        this.contexto = contexto;
        this.lista = lista;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return lista.get(position).getId();
    }
     //El adapatador ayuda a conectar el xml  con la clase java paRA QUE almacene los valores en la
    // clase componentes
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vista = convertView;
        LayoutInflater inflater = LayoutInflater.from(contexto);
        vista =  inflater.inflate(R.layout.itemlistview, null);
        ImageView imageView = (ImageView) vista.findViewById(R.id.imagen);
        TextView textView = (TextView)   vista.findViewById(R.id.titulo);
        TextView textView2 = (TextView)   vista.findViewById(R.id.descripcion);


        imageView.setImageResource(lista.get(position).getImagen());
        textView.setText(lista.get(position).getTitulo().toString());
        textView2.setText(lista.get(position).getDescripcion().toString());

        return vista;
    }
}
