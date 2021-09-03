package com.example.enciclopedia1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class DescripcionAve extends AppCompatActivity {

    private ImageView imagen1 ;
    private TextView titulo, descripcion;
    Bundle idAnimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion_ave);



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        // Inicializando lo componentes
        imagen1 = findViewById(R.id.imagenAve);
        titulo = findViewById(R.id.tituloAve);
        descripcion = findViewById(R.id.descripcionAve);

        // Recuperar la informacion
        idAnimal = getIntent().getExtras();
        String idRecuperado = idAnimal.getString("id");



        if (idRecuperado.equals("1")) {
            imagen1.setImageResource(R.drawable.aguila);
            titulo.setText("AGUILA");
            descripcion.setText(" Majestuosas, sigilosas, veloces, inteligentes y hábiles: si el mar es de los tiburones y la sabana de los leones, la hegemonía del reino de los cielos es delas águilas. Pertenecientes a las familia Accipitridae, este tipo de aves sobrevuelan los cielos de todo el mundo excepto los antárticos. Depredadores por excelencia estos pájaros son temibles aves de presa.  Cuentan con un pico fuerte y robusto acabado en punta y hacia abajo que les facilita la tarea de separar los pedazos de carne de sus víctimas. También gozan de un sentido de la vista extraordinario con el que pueden divisar a sus presas a grandes distancias y además, sus potentes y robustas garras les permiten atrapar animales más grandes  que ellas y trasladarlos por el aire. \n" +
                    "La longevidad del águila oscila en promedio entre unos 14 y 25 años, ya que carece de depredadores naturales. Las especies más voluminosas tienden a vivir más años\n" +
                    "\n");

        } else if (idRecuperado.equals("2")) {
            imagen1.setImageResource(R.drawable.avestruz);
            titulo.setText("AVESTRUZ");
            descripcion.setText("El avestruz es típico de un grupo de aves no voladoras llamadas rátidas, lo que las hace animales terrestres, no aéreos. Las poblaciones de avestruces que difieren ligeramente en el color de la piel, el tamaño y las características de los huevos antes se consideraban especies separadas, pero ahora se consideran simplemente razas.\n" +
                    " Una zancada puede cubrir hasta 4.9 metros. Puede correr un poco más de 64 kilómetros por hora para una distancia corta, y puede mantener una velocidad de más de 48 kilómetros por hora para distancias más largas. El avestruz utiliza sus alas cortas para equilibrarse, manteniéndolas extendidas cuando corre.\n" +
                    "\n" +
                    "\nEl avestruz es típico de un grupo de aves no voladoras llamadas rátidas, lo que las hace animales terrestres, no aéreos. Las poblaciones de avestruces que difieren ligeramente en el color de la piel, el tamaño y las características de los huevos antes se consideraban especies separadas, pero ahora se consideran simplemente razas.\n" +
                    " Una zancada puede cubrir hasta 4.9 metros. Puede correr un poco más de 64 kilómetros por hora para una distancia corta, y puede mantener una velocidad de más de 48 kilómetros por hora para distancias más largas. El avestruz utiliza sus alas cortas para equilibrarse, manteniéndolas extendidas cuando corre.\n" +
                    "\n" +
                    "\n");

        }else if (idRecuperado.equals("3")){
            imagen1.setImageResource(R.drawable.ganso);
            titulo.setText("GANSO");
            descripcion.setText("El ganso es un ave acuática similar al pato, pero de tamaño y peso mayor. Sus tres primeros dedos están unidos por una membrana que le permite nadar en el agua.\n" +
                    "Una de las características del ganso que hoy se encuentra silenciada, pero que hizo que fuera de gran popularidad y uso en el pasado, es su alto grado de lealtad, tanto con sus criadores como con otras ocas.\n" +
                    "La fidelidad del ganso no hace excepciones para su vida en pareja; cada uno elige a la suya a los tres años y la mantiene hasta la muerte\n");
        } else if(idRecuperado.equals("4")){
            imagen1.setImageResource(R.drawable.colibri);
            titulo.setText("COLIBRI");
            descripcion.setText("La especie más pequeña es el colibrí originario de Cuba llamado Elfo de las abejas, pues con todo su pico y cola, solo llega a los 5.5-6 cm y pesa menos de 2 g. Por el contrario, el colibrí gigante mide 25 cm. El pico es una característica especial que los diferencia de cada especie, ya que está adaptado a su alimentación y al tipo de flor de donde se alimenta para llegar al néctar con facilidad.\n" +
                    "Habitan en zonas templadas y tropicales, pero el ambiente en donde vive puede ser variado. Encontramos ejemplares tanto en zonas costeras a nivel del mar, como en zonas montañosas a 5000 metros de altitud.\n" );
        } else if(idRecuperado.equals("5")){
            imagen1.setImageResource(R.drawable.cardenal);
            titulo.setText("CARDENAL");
            descripcion.setText("Los cardenales son aves de naturaleza sociable que se agrupan en bandadas a las que se unen incluso pájaros de otras especies. Los cardenales son aves de naturaleza sociable que se agrupan en bandadas a las que se unen incluso pájaros de otras especies. \n" +
                    "Lindes de bosques, matorrales, jardines suburbanos, ciudades y deslaves desérticos. Se lo encuentra en una variedad de hábitats con arbustos o en espacios semiabiertos en el este, desde claros de bosques y pantanos hasta parques de ciudades, en casi todos los lugares donde haya arbustos densos para nidificar\n" );
        } else if(idRecuperado.equals("6")){
            imagen1.setImageResource(R.drawable.canario);
            titulo.setText("CANARIO");
            descripcion.setText(" Una de las principales características por las que resalta este animal es su capacidad para cantar e imitar sonidos.\n" +
                    "El canario es el más grande de todos los pájaros que conforman la familia de los fringílidos ya que mide unos 15 a 16 centímetros de longitud.\n" +
                    "Su pico es corto y puntiagudo y la coloración de sus plumas puede ser amarillo, gris o verde.\n" +
                    "Su esperanza de vida en estado salvaje suele ser de entre cinco y diez años como mucho. Su hábitat natural son las áreas semiabiertas, destacando los huertos y selvas. Habita en lugares de diversas características lo que incluye bosques de pino y dunas de arena.\n" );
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