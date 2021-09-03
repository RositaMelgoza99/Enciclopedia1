package com.example.enciclopedia1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class Descripcionanimal extends AppCompatActivity {


    private ImageView imagen1 ;
    private TextView  titulo, descripcion;
    Bundle idAnimal;

    ////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcionanimal);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        // Inicializando lo componentes
        imagen1 = findViewById(R.id.imagenAnimal);
        titulo = findViewById(R.id.tituloAnimal);
        descripcion = findViewById(R.id.descripcionAnimal);

        // Recuperar la informacion
        idAnimal = getIntent().getExtras();
        String idRecuperado = idAnimal.getString("id");



            if (idRecuperado.equals("1")) {
                imagen1.setImageResource(R.drawable.perro);
                titulo.setText("PERRO");
                descripcion.setText("El perro doméstico proviene de un grupo ancestral común que data de hace aproximadamente treinta mil años y desde entonces se ha extendido a todas partes del mundo. Los primeros restos fósiles de perros enterrados junto con humanos fueron encontrados en Israel y datan de hace unos doce mil años.16\u200B Desde entonces, los perros y los humanos han evolucionado conjuntamente, tanto en las culturas africanas y euroasiáticas, como en las que poblaron América y se mantuvieron sin contacto con aquellas hasta el siglo XV.17\u200B Los perros comparten el entorno, los hábitos y el estilo de vida humanos, como las dietas ricas en cereales y almidón. La alimentación inadecuada, así como el uso de antibióticos, son la causa del desarrollo de muchas enfermedades inflamatorias e inmunológicas. hoy en día se conocen alrededor de 800 razas distintas con tamaños y fisonomías muy diferentes y originadas a partir de la selección artificial por parte de los seres humanos. A pesar de que no cuentan con un gran sentido de la vista, tienen muy buen oído y el sentido del olfato muy desarrollado, siendo esta la herramienta que define sus mejores cualidades como cazador o rastreador, pero también su capacidad de socialización reconociendo olores familiares.. A pesar de que no cuentan con un gran sentido de la vista, tienen muy buen oído y el sentido del olfato muy desarrollado, siendo esta la herramienta que define sus mejores cualidades como cazador o rastreador, pero también su capacidad de socialización reconociendo olores familiares.   Las hembras pasan el celo dos veces al año, su periodo de gestación dura un poco más de dos meses y suelen tener camadas de entre 8 y 12 crías. A pesar de que su esperanza de vida está entre los 12 y los 15 años, hay algunos que pueden alcanzar los 20 años.  ");


            } else if (idRecuperado.equals("2")) {
                imagen1.setImageResource(R.drawable.gato);
                titulo.setText("GATO");
                descripcion.setText("Los gatos se comunican marcando árboles, postes o muebles con sus zarpas o con su orín. Dejar su rastro es el modo que tienen de informar a otros del alcance de su territorio. Su repertorio vocal va desde el ronroneo hasta el chillido.Al igual que sus parientes salvajes, los gatos domésticos son cazadores natos, capaces de acechar a sus presas y abalanzarse sobre ellas con sus garras y dientes. Son particularmente eficaces de noche, cuando sus ojos reflectantes les dotan de una visión mucho más nítida que la de sus víctimas La dieta de los gatos domésticos se ha mantenido predominantemente carnívora a lo largo de la evolución, por ello han desarrollado un estómago simple, apropiado para digerir carne cruda.Los gatos domésticos machos tienen una esperanza de vida de entre doce y catorce años, mientras que las hembras suelen vivir uno o dos años más. El ejemplo más longevo del que se tiene registro vivió treinta y ocho años");

            }else if (idRecuperado.equals("3")){
                imagen1.setImageResource(R.drawable.oso);
                titulo.setText("OSO");
                descripcion.setText("Se pueden encontrar osos desde la tundra ártica hasta los bosques tropicales, montañas, praderas y unos cuantos en zonas áridas. El oso panda se localiza en bosques montañosos de bambú al sur de China. Sus orejas, ojos y cola son pequeñas. Están cubiertos por pelaje largo, abundante y áspero que puede ser de color marrón, negro, blanco o con manchas. Sus cuerpos son muy voluminosos y robustos y están acompañados de extremidades cortas.  Los osos cuentan con una enorme y fuerte mandíbula que les permite alimentarse de carne además de frutos, raíces e insectos.  Se trata de animales omnívoros que comen prácticamente de todo y que a pesar de que su vista y su oído son limitados, gozan de un muy buen olfato con el que son capaces de detectar a kilómetros un pequeño rastro de comida.  Pueden llegar a medir 2,80 metros de largo y pesan alrededor 500 kilos aproximadament. Se trata de animales omnívoros que comen prácticamente de todo y que a pesar de que su vista y su oído son limitados, gozan de un muy buen olfato con el que son capaces de detectar a kilómetros un pequeño rastro de comida.  Pueden llegar a medir 2,80 metros de largo y pesan alrededor 500 kilos aproximadamente. Suelen tener un pelaje denso y oscuro –excepto los osos polares y los pandas– y unas fuertes garras en sus extremidades. ");
            } else if(idRecuperado.equals("4")){
                imagen1.setImageResource(R.drawable.lobo);
                titulo.setText("LOBO");
                descripcion.setText("Son animales cuadrúpedos, mamíferos, con cuerpos de entre 60 y 90 cm de alto y un peso de entre 32 y 70 kg. Suelen medir entre 1,30 y 2 metros de largo. Poseen una cola larga, y no son, en principio, demasiado diferentes anatómicamente de un perro. Los lobos son cazadores, y su dieta es eminentemente carnívora. Un lobo solo puede comer entre 3 y 4 kilos de carne por comida, lo cual arroja la increíble cifra de una tonelada de carne al año. Viven entre seis y ocho años. Las manadas suelen tener un comportamiento territorial, cubriendo alrededor de 200 kilómetros cuadrados. Evitan los lindes de su propio territorio para no tener encuentros –en ocasiones muy agresivos– con las demás manadas.  Aunque estos casi nunca atacan a los seres humanos, los lobos han sido históricamente considerados uno de los enemigos naturales más temibles del mundo animal. " );
            } else if(idRecuperado.equals("5")){
                imagen1.setImageResource(R.drawable.elefante);
                titulo.setText("ELEFANTE");
                descripcion.setText("Son animales mamíferos, exclusivamente herbívoros cuya característica principal –además del gran tamaño– es su larga trompa y sus enormes orejas. Se organizan en manadas de unos 20 miembros, miden casi 4 metros los ejemplares más grandes y pueden llegar a pesar más de 6.000 kilos.Debido a su gran tamaño, tienen también un cerebro muy grande por lo cual son animales muy inteligentes a los que se asocian comportamientos como el duelo por una pérdida, la asociación con otros miembros, el uso de herramientas, la adopción, el juego e incluso el autorreconocimiento. Las orejas de los elefantes actúan como termostato ayudando a soportar el fuerte calor de las zonas donde habitan y su trompa en realidad no es más que una nariz muy desarrollada que también usan como un brazo largo. Los elefantes de los bosques africanos habitan la densa selva tropical de África occidental y central, mientras que los elefantes de la sabana africana habitan principalmente en las sabanas boscosas y los pastizales del África subsahariana. También difieren físicamente. Los elefantes de la sabana africana son más grandes y sus colmillos se curvan hacia afuera." );
            } else if(idRecuperado.equals("6")){
                imagen1.setImageResource(R.drawable.jirafa);
                titulo.setText("JIRAFA");
                descripcion.setText("La jirafa es el animal terrestre más alto del mundo y uno de los protagonistas indiscutibles de la sabana africana. La jirafa habita exclusivamente en África, en las zonas de sabana, pastizales y bosques abiertos. Su área de distribución es bastante dispersa, desde el Chad hasta Sudáfrica, y desde Níger hasta Somalia.las jirafas son animales sociables y no suelen temer al hombre. Viven en manadas de unos diez ejemplares aproximadamente y son grupos abiertos, sin vínculos sociales fuertes, cuyos integrantes cambian constantemente. las jirafas son animales sociables y no suelen temer al hombre. Viven en manadas de unos diez ejemplares aproximadamente y son grupos abiertos, sin vínculos sociales fuertes, cuyos integrantes cambian constantemente. " );
            }




    }

    ////////////////////////////////////////////////////////////////////////////

// Volver al menu de  cada uno de las listas
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
