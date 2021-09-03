package com.example.enciclopedia1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.CharacterPickerDialog;
import android.view.View;

public class MainActivity extends AppCompatActivity {
     // Se inicializa el tipo de dato para card
      CardView card1;
      CardView card2;
      CardView card3;
      CardView card4;
      CardView card5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // se crea la instancia de las tarjetas que corresponden al id del componenete
        card1 = (CardView) findViewById(R.id.c1);

        card2 = (CardView) findViewById(R.id.c2);

        card3= (CardView) findViewById(R.id.c3);

        card4= (CardView) findViewById(R.id.c4);

        card5= (CardView) findViewById(R.id.c5);

        // Cada una de las cards tiene su evento onClick para que al momento de que sean presionada reconozca su id y mande
        // a su lista de animales correspondiente referenciando a la clase animales  donde se encuntra la lista de los animales
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // crea una instancia para mandar la informacion a la clase animales mediante el id y se realice
                // la accion al momento de entrar al metodo onclick
                Intent salto = new Intent(MainActivity.this, Animales.class);
                salto.putExtra("id", "m");
                startActivity(salto);
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent salto = new Intent(MainActivity.this, Animales.class);
                salto.putExtra("id", "a");
                startActivity(salto);
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent salto = new Intent(MainActivity.this, Animales.class);
                salto.putExtra("id", "r");
                startActivity(salto);
            }
        });

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent salto = new Intent(MainActivity.this, Animales.class);
                salto.putExtra("id", "p");
                startActivity(salto);
            }
        });


        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent salto = new Intent(MainActivity.this, Animales.class);
                salto.putExtra("id", "i");
                startActivity(salto);
            }
        });
    }

}