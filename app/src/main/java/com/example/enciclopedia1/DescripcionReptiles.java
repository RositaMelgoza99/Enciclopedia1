package com.example.enciclopedia1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class DescripcionReptiles extends AppCompatActivity {
    private ImageView imagen1 ;
    private TextView titulo, descripcion;
    Bundle idAnimal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion_reptiles);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // Inicializando lo componentes
        imagen1 = findViewById(R.id.imagenReptil);
        titulo = findViewById(R.id.tituloReptil);
        descripcion = findViewById(R.id.descipcionReptil);

        // Recuperar la informacion
        idAnimal = getIntent().getExtras();
        String idRecuperado = idAnimal.getString("id");





        if (idRecuperado.equals("1")) {
            imagen1.setImageResource(R.drawable.cocodrilo);
            titulo.setText("COCODRILO");
            descripcion.setText("Estos reptiles viven en África, América, Asia y Australia y los científicos estiman que aparecieron hace unos 55 millones de años, durante el Eoceno. Con un modo de vida semiacuático, y con una tendencia a vivir en congregaciones, los cocodrilos son depredadores y se alimentan principalmente de otros animales vertebrados, aunque no es raro encontrar algunas especies que se alimenten de moluscos y crustáceos.\n" +
                    "Los cocodrilos están dotados de una piel escamosa, muy dura y seca. Sus fosas nasales y sus ojos se encuentran en la parte superior de la cabeza, lo que le permite ver y respirar mientras permanece en el agua. Tienen además cuerpos pesados y metabolismos generalmente lentos, aunque pueden controlar la velocidad de su digestión según la abundancia de presas y de la temperatura ambiente. \n ");

        } else if (idRecuperado.equals("2")) {
            imagen1.setImageResource(R.drawable.tortuga);
            titulo.setText("Tortuga");
            descripcion.setText("Las tortugas o quelonios son un grupo de reptiles de hábitat acuático y terrestre. Su principal característica es poseer un fuerte caparazón que les protege los órganos internos y que abarca todo el torso del animal. Diseñado como una caja resistente y fabricado de hueso y cartílago, este caparazón crece junto al animal y forma parte de su propia columbra vertebral, de modo que puede refugiarse dentro. Poseen una buena visión, que privilegian por encima del resto de sus sentidos, aunque también empleen a menudo el olfato y el oído. Poseen un sistema nervioso superior, como todos los animales vertebrados, con un cerebro y una médula espinal. ");

        }else if (idRecuperado.equals("3")){
            imagen1.setImageResource(R.drawable.serpiente);
            titulo.setText("SERPEINTE");
            descripcion.setText("Las serpientes son un tipo de reptiles que se caracterizan principalmente por la carencia de patas. Su anatomía, caracterizada por un cuerpo alargado, está preparada para permitir un desplazamiento sin necesidad de extremidades: pueden moverse cómodamente tanto por tierra como por agua. Tienen la piel recubierta de escamas, un esqueleto que les proporciona mucha flexibilidad y una lengua bífida. Algunas especies matan a sus presas por constricción –por ejemplo las boas–, pero otras lo hacen mediante el veneno que inoculan con los dientes cuando muerden a sus víctimas. Todos los miembros de esta especie son animales carnívoros.");
        } else if(idRecuperado.equals("4")){
            imagen1.setImageResource(R.drawable.lagarto);
            titulo.setText("LAGARTO");
            descripcion.setText("Los lagartos son animales de sangre fría. Es decir que su temperatura corporal cambia según la temperatura del entorno. Por esta razón, la mayoría de los lagartos no vive en lugares muy fríos. Muchas especies habitan los trópicos húmedos y desiertos áridos. Los lagartos pueden vivir bajo tierra, sobre la superficie y en árboles o plantas. Unas pocas especies viven alternadamente en el agua y en la tierra. mayoría de los lagartos tiene cuatro patas fuertes, pero también hay algunos que no tienen patas. Se parecen a las serpientes y a menudos se los confunde con ellas. Hay dos tipos de lagartos venenosos. Son el monstruo de Gila del sur de los Estados Unidos y el lagarto perlado de México. Su veneno es tan potente que puede llegar a matar a un ser humano." );
        } else if(idRecuperado.equals("5")){
            imagen1.setImageResource(R.drawable.camal);
            titulo.setText("CAMALEON");
            descripcion.setText("Estos reptiles se caracterizan por su cuerpo comprimido y aplanado, sus pies zigodáctilos y la cresta o cuerno en las cabezas de algunas especies. Tienen patas con 5 dedos, 3 hacia afuera y 2 hacia adentro. Son conocidos por sus cambios de color, que incluyen una variada gama de los colores menos imaginados. Viven en ambientes forestales, es decir, en todo tipo de bosques tropicales y de montaña, selvas, sabanas y ocasionalmente estepas y desiertos." );
        } else if(idRecuperado.equals("6")){
            imagen1.setImageResource(R.drawable.iguana);
            titulo.setText("IGUANA");
            descripcion.setText("Las iguanas habitan en Centroamérica, Sudamérica, Caribe, a lo largo de las Antillas e Islas Galápagos. Podemos encontrar a estas especies en manglares, selvas, pastizales y riberas de ríos. El tamaño de las iguanas va desde los 14 cm hasta los 1.5-1.8 metros de largo. La iguana verde puede alcanzar un peso de 15 kg. Su sentido de la vista está muy desarrollado, pues pueden percibir formas, sombras, colores y movimientos a largas distancias. Utilizan su par de ojos para encontrar su comida y comunicarse entre ellos, pues emplean señales visuales. " );
        }


    }
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
