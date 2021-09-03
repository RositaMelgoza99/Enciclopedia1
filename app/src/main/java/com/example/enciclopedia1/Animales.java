package com.example.enciclopedia1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Animales extends AppCompatActivity {


    // Se crea inicializa el componente ListView
    ListView listaAnimales;
    // Se cra un arreglo que extiende de componentes
    ArrayList <componentes> arreglo;
    Bundle idAnimal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animales);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // Se crea una isntancia de las lista animales referenciadolos por los id

        listaAnimales = (ListView) findViewById(R.id.list);
        arreglo  = new ArrayList<>();

        idAnimal = getIntent().getExtras();
        String idRecuperado = idAnimal.getString("id");
         // permitira recuperar los id de cada una de las cards que se encuentra en el main para mostrar  las lista de cada animal


        // Lista general de animales mediante un ciclo if se evalua a que tipo de card se pertence cada lista de los animales
        if(idRecuperado.equals("m")){
            arreglo.add(new componentes(1,"Perro", "Son llamados el mejor amigo del hombre, es un mamífero carnívoro de la familia de los cánidos", R.drawable.perro));
            arreglo.add(new componentes(2,"Gato", "Son unos pequeños felinos, es un mamífero carnívoro de la familia Felidae.", R.drawable.gato));
            arreglo.add(new componentes(3,"Oso", " Los osos o úrsidos son una familia de mamíferos omnívoros", R.drawable.oso));
            arreglo.add(new componentes(4,"Lobo", "El lobo es una especie de mamífero placentario del orden de los carnívoros.", R.drawable.lobo));
            arreglo.add(new componentes(5,"Elefante", "Los elefantes son una familia de mamíferos placentarios del orden Proboscidea.", R.drawable.elefante));
            arreglo.add(new componentes(6,"Jirafa", "Jirafa es una especie de mamífero artiodáctilo, de la familia Giraffidae propio de África", R.drawable.jirafa));

        }else if(idRecuperado.equals("a"))
        {
            arreglo.add(new componentes(1,"Aguila", "Nombre dado a las aves de presa, del orden de Accipitriformes, Pertenecen a varios géneros, los cuales están sujetos a una reclasificación", R.drawable.aguila));
            arreglo.add(new componentes(2,"Avestruz", " Es una especie de ave estrutioniforme de la familia Struthionidae", R.drawable.avestruz));
            arreglo.add(new componentes(3,"Ganso", "Se llama comúnmente gansos u ocas a algunas aves de la subfamilia Anserinae", R.drawable.ganso));
            arreglo.add(new componentes(4,"Colibri", "El Colibrí es un género de aves apodiformes pertenecientes a la subfamilia de los troquilinos ", R.drawable.colibri));
            arreglo.add(new componentes(5,"Cardenal", "Es una especie de ave paseriforme de la familia Cardinalidae que vive en Centro y Norteamérica.", R.drawable.cardenal));
            arreglo.add(new componentes(6,"Canario", "El canario es una especie de ave paseriforme de la familia de los fringílidos", R.drawable.canario));

        }
        else if(idRecuperado.equals("r"))
        {
            arreglo.add(new componentes(1,"Cocodrilo", "Se trata de grandes reptiles semiacuáticos que viven en las regiones tropicales de África", R.drawable.cocodrilo));
            arreglo.add(new componentes(2,"Tortuga", " Son el grupo de reptiles más antiguo que existe ya que perdura desde el periodo Triásico.", R.drawable.tortuga));
            arreglo.add(new componentes(3,"Serpiente", "Las serpientes son un tipo de reptiles que se caracterizan principalmente por la carencia de patas.", R.drawable.serpiente));
            arreglo.add(new componentes(4,"Lagarto", "Reptil terrestre del orden de los saurios, de 50 a 80 cm de largo, de color verdoso, cabeza ovalada ", R.drawable.lagarto));
            arreglo.add(new componentes(5,"Camaleon", "Los camaleones son pequeños reptiles saurópsidos escamosos y pertenecen al grupo de los animales vertebrados", R.drawable.camal));
            arreglo.add(new componentes(6,"Iguana", "Es un gran lagarto arbóreo. Mide hasta 2 m de longitud de cabeza a cola.", R.drawable.iguana));

        }
        else if(idRecuperado.equals("p"))
        {
            arreglo.add(new componentes(1,"Goldfish", "Puede ser uno de los peces de agua fría más conocidos y criados en cautividad en todo el mundo.", R.drawable.goldfi));
            arreglo.add(new componentes(2,"Payaso", "El pez betta, conocido también como el pez combatiente o luchador de siam, es un ejemplar muy especial. ", R.drawable.payaso));
            arreglo.add(new componentes(3,"Disco", " Proviene originariamente de la región amazónica y en la actualidad se encuentra en muchos acuarios", R.drawable.disco));
            arreglo.add(new componentes(4,"Globo", "Los biólogos creen que el pez globo desarrolló su famosa habilidad para inflarse debido a que su estilo para nadar es lento y torpe .", R.drawable.globo));
            arreglo.add(new componentes(5,"Molly negro", "Este pez, negro como la noche y con un brillo aterciopelado, es muy popular entre acuaristas tanto experimentados como principiantes.", R.drawable.molly));
            arreglo.add(new componentes(6,"Ciclidos", "La mayoría de cíclidos proceden de África y casi todas las especies viven en los lagos del este del continente.", R.drawable.ciclidos));

        }
        else if(idRecuperado.equals("i"))
        {
            arreglo.add(new componentes(1,"Mariposa", "Las mariposas cuentan con detalles fabulosos que constituyen su cuerpo. La cabeza es una pequeña cápsula peluda. Lo que más le resalta son los ojos", R.drawable.mariposa));
            arreglo.add(new componentes(2,"Abeja", " Las abejas son unos insectos extremadamente sociables que viven en colonias que se establecen en forma de enjambres", R.drawable.abeja));
            arreglo.add(new componentes(3,"Libelua", "A pesar de su tamaño, la libélula efectúa vuelos transoceánicos simplemente con sus dos pares de alas", R.drawable.libelula));
            arreglo.add(new componentes(4,"Mosca", "Estos insectos polinizan las plantas, devoran cadáveres en descomposición, se comen los residuos de nuestros drenajes", R.drawable.mosca));
            arreglo.add(new componentes(5,"Avispa", "Estos insectos ostentan todos los colores que podamos imaginar, desde el amarillo al que ya estamos acostumbrados, al marrón, el azul metálico.", R.drawable.avispa));
            arreglo.add(new componentes(6,"Chinche", "Las chinches son pequeños insectos parásitos de color marrón rojizo que pican la piel expuesta de los seres humanos y de los animales", R.drawable.chinche));

        }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        adaptador adap = new adaptador(getApplicationContext(), arreglo);
        listaAnimales.setAdapter(adap);


        listaAnimales.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              if(idRecuperado.equals("m")){
                  if ( id == 1) {
                      Intent intent = new Intent(Animales.this,Descripcionanimal.class);
                      intent.putExtra("id","1");
                      startActivity(intent);
                  }
                  else if (id == 2) {
                      Intent intent = new Intent(Animales.this,Descripcionanimal.class);
                      intent.putExtra("id","2");
                      startActivity(intent);
                  }
                  else if (id == 3) {
                      Intent intent = new Intent(Animales.this,Descripcionanimal.class);
                      intent.putExtra("id","3");
                      startActivity(intent);
                  }
                  else if (id == 4) {
                      Intent intent = new Intent(Animales.this,Descripcionanimal.class);
                      intent.putExtra("id","4");
                      startActivity(intent);
                  }
                  else if (id == 5) {
                      Intent intent = new Intent(Animales.this,Descripcionanimal.class);
                      intent.putExtra("id","5");
                      startActivity(intent);
                  }
                  else if (id == 6) {
                      Intent intent = new Intent(Animales.this,Descripcionanimal.class);
                      intent.putExtra("id","6");
                      startActivity(intent);
                  }
              }else if(idRecuperado.equals("a")){
                          if ( id == 1) {
                              Intent intent = new Intent(Animales.this,DescripcionAve.class);
                              intent.putExtra("id","1");
                              startActivity(intent);
                          }
                          else if (id == 2) {
                              Intent intent = new Intent(Animales.this, DescripcionAve.class);
                              intent.putExtra("id","2");
                              startActivity(intent);
                          }
                          else if (id == 3) {
                              Intent intent = new Intent(Animales.this,DescripcionAve.class);
                              intent.putExtra("id","3");
                              startActivity(intent);
                          }
                          else if (id == 4) {
                              Intent intent = new Intent(Animales.this,DescripcionAve.class);
                              intent.putExtra("id","4");
                              startActivity(intent);
                          }
                          else if (id == 5) {
                              Intent intent = new Intent(Animales.this,DescripcionAve.class);
                              intent.putExtra("id","5");
                              startActivity(intent);
                          }
                          else if (id == 6) {
                              Intent intent = new Intent(Animales.this,DescripcionAve.class);
                              intent.putExtra("id","6");
                              startActivity(intent);
                          }
                      }else if(idRecuperado.equals("r")){
                       if ( id == 1) {
                      Intent intent = new Intent(Animales.this,DescripcionReptiles.class);
                      intent.putExtra("id","1");
                      startActivity(intent);
                     }
                  else if (id == 2) {
                      Intent intent = new Intent(Animales.this, DescripcionReptiles.class);
                      intent.putExtra("id","2");
                      startActivity(intent);
                  }
                  else if (id == 3) {
                      Intent intent = new Intent(Animales.this,DescripcionReptiles.class);
                      intent.putExtra("id","3");
                      startActivity(intent);
                  }
                  else if (id == 4) {
                      Intent intent = new Intent(Animales.this,DescripcionReptiles.class);
                      intent.putExtra("id","4");
                      startActivity(intent);
                  }
                  else if (id == 5) {
                      Intent intent = new Intent(Animales.this,DescripcionReptiles.class);
                      intent.putExtra("id","5");
                      startActivity(intent);
                  }
                  else if (id == 6) {
                      Intent intent = new Intent(Animales.this,DescripcionReptiles.class);
                      intent.putExtra("id","6");
                      startActivity(intent);
                  }

              }if(idRecuperado.equals("p")) {
                    if (id == 1) {
                        Intent intent = new Intent(Animales.this,DescripcionPeces.class);
                        intent.putExtra("id", "1");
                        startActivity(intent);
                    } else if (id == 2) {
                        Intent intent = new Intent(Animales.this,DescripcionPeces.class);
                        intent.putExtra("id", "2");
                        startActivity(intent);
                    } else if (id == 3) {
                        Intent intent = new Intent(Animales.this, DescripcionPeces.class);
                        intent.putExtra("id", "3");
                        startActivity(intent);
                    } else if (id == 4) {
                        Intent intent = new Intent(Animales.this, DescripcionPeces.class);
                        intent.putExtra("id", "4");
                        startActivity(intent);
                    } else if (id == 5) {
                        Intent intent = new Intent(Animales.this, DescripcionPeces.class);
                        intent.putExtra("id", "5");
                        startActivity(intent);
                    } else if (id == 6) {
                        Intent intent = new Intent(Animales.this, DescripcionPeces.class);
                        intent.putExtra("id", "6");
                        startActivity(intent);
                    }

                }if(idRecuperado.equals("i")) {
                    if (id == 1) {
                        Intent intent = new Intent(Animales.this,DescripcionInsectos.class);
                        intent.putExtra("id", "1");
                        startActivity(intent);
                    } else if (id == 2) {
                        Intent intent = new Intent(Animales.this,DescripcionInsectos.class);
                        intent.putExtra("id", "2");
                        startActivity(intent);
                    } else if (id == 3) {
                        Intent intent = new Intent(Animales.this, DescripcionInsectos.class);
                        intent.putExtra("id", "3");
                        startActivity(intent);
                    } else if (id == 4) {
                        Intent intent = new Intent(Animales.this, DescripcionInsectos.class);
                        intent.putExtra("id", "4");
                        startActivity(intent);
                    } else if (id == 5) {
                        Intent intent = new Intent(Animales.this, DescripcionInsectos.class);
                        intent.putExtra("id", "5");
                        startActivity(intent);
                    } else if (id == 6) {
                        Intent intent = new Intent(Animales.this, DescripcionInsectos.class);
                        intent.putExtra("id", "6");
                        startActivity(intent);
                    }

                }





            }
        });
    }


    // Metodo para crear la flecha y se desplace entre ventanas
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}