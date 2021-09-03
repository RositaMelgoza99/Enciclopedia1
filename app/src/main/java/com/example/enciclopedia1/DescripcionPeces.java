package com.example.enciclopedia1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class DescripcionPeces extends AppCompatActivity {
    private ImageView imagen1 ;
    private TextView titulo, descripcion;
    Bundle idAnimal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion_peces);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        // Inicializando lo componentes
        imagen1 = findViewById(R.id.imagenPez);
        titulo = findViewById(R.id.tituloPez);
        descripcion = findViewById(R.id.despripcionPez);

        // Recuperar la informacion
        idAnimal = getIntent().getExtras();
        String idRecuperado = idAnimal.getString("id");
        if (idRecuperado.equals("1")) {
            imagen1.setImageResource(R.drawable.goldfi);
            titulo.setText("GODFISH");
            descripcion.setText("El goldfish pertenece a la familia de las carpas y ya hace tiempo que se tiene como pez ornamental. A través de la cría milenaria del goldfish han surgido numerosas versiones de este pez. El carpín dorado es un pez de agua dulce natural de la región de Asia Oriental. Como decíamos, estos peces se empezaron a criar hace mil años como animales domésticos exclusivamente para fines ornamentales.\n" +
                    "En general, el pez dorado no presenta grandes exigencias a su cuidador. El agua no se debe calentar, sino que basta con que se caliente pasivamente a través de la temperatura del aire de la estancia de 12 a 23 °C.  Dado que estos peces no tienen sensación de saciedad, es importante darles una cantidad adecuada. Por regla general, se dice que hay que darles la cantidad de comida que puedan ingerir en un minuto\n");

        } else if (idRecuperado.equals("2")) {
            imagen1.setImageResource(R.drawable.payaso);
            titulo.setText("PAYASO");
            descripcion.setText("En el lenguaje común, a menudo se denomina pez payaso a todo el género de peces anémona. Es un pez de agua salada natural del oeste del océano Pacífico y el océano Índico. No es una especie en peligro de extinción. El pez payaso común se distingue por su color naranja luminoso y tres rayas transversales blancas. Además, la raya del medio presenta una protuberancia hacia delante. El verdadero pez payaso se reconoce porque, además del color rojo anaranjado y las rayas blancas, presenta rayas negras finísimas que delimitan claramente las rayas blancas. Lo más característico de los peces anémona es que conviven en simbiosis con las anémonas de mar. Cada especie de pez anémona solo convive con una especie determinada de anémona. Otros animales evitan los cnidoblastos de las anémonas, pero él es inmune a su toxina mediante una capa de mucosidad.");

        }else if (idRecuperado.equals("3")){
            imagen1.setImageResource(R.drawable.disco);
            titulo.setText("DISCO");
            descripcion.setText("El pez disco pertenece a la familia de los cíclidos. Con su cuerpo plano en forma de círculo, se sale claramente de lo común. Sus escamas pueden ser de diferentes colores irisados, a menudo de tonos tipo neón amarillos, azules y rojos. Vive en las aguas dulces del Amazonas, en el delta del río y en otros afluentes, como el río Negro y el río Madeira. Su ámbito de expansión llega hasta Perú. Hoy en día se pueden encontrar estos cíclidos en casi todos los afluentes del Amazonas. Vive en las aguas dulces del Amazonas, en el delta del río y en otros afluentes, como el río Negro y el río Madeira. Su ámbito de expansión llega hasta Perú. Hoy en día se pueden encontrar estos cíclidos en casi todos los afluentes del Amazonas. En la naturaleza, los peces comen principalmente algas y plantas acuáticas muertas. También consumen animales invertebrados pequeños, como mosquitos, gusanos y larvas");
        } else if(idRecuperado.equals("4")){
            imagen1.setImageResource(R.drawable.globo);
            titulo.setText("GLOBO");
            descripcion.setText("En lugar de escapar, el pez globo utilizar su elástico estómago muy elástica y su capacidad de ingerir rápidamente grandes cantidades de agua. Un depredador que logra atrapar a un pez globo antes de que se infle, no se sentirá afortunado por mucho tiempo. Casi todos los peces globo contienen tetrodo toxina, una sustancia que hace que el pez globo tenga un sabor muy desagradable, a menudo letal para los peces. Para los humanos, el tetrodo toxina es mortal, hasta 1.200 veces más venenosa que el cianuro. En pez globo contiene suficiente tetrodo toxina para matar a 30 seres humanos adultos, y no hay antídoto conocido. Su tamaño varía, desde el pez globo enano o pigmeo de 2,5 centímetros de largo al gigante pez globo de agua dulce, que puede crecer hasta más de 61 centímetros de longitud. Son peces sin escamas y suelen tener la piel áspera de punta" );
        } else if(idRecuperado.equals("5")){
            imagen1.setImageResource(R.drawable.molly);
            titulo.setText("MOLLY NEGRO");
            descripcion.setText("Con una longitud de 4-6 cm, las primeras formas de cría del molly negro importadas desde EE. UU. eran pequeñas en comparación y tenían una aleta dorsal corta, plana y ligeramente cuadrada. A consecuencia de los numerosos cruces, como con el molly vela, aparecieron otras variantes con grandes diferencias de color, tamaño, forma de las aletas y proporciones corporales. La popularidad del molly negro no solo se debe a su hermoso manto de escamas negro, sino también a su carácter pacífico, que lo convierte en un habitante sociable del acuario. Lo mejor para ellos es una temperatura del agua de 26-28 grados, pero, si es necesario, pueden soportar temperaturas más bajas (de al menos 24 grados) y algo más altas (de 30 grados como máximo). Lo importante es que la temperatura que elijas permanezca estable. Otro motivo por el que el molly negro es uno de los peces ornamentales más populares es que se puede tener en acuarios pequeños de a partir de 60 cm de longitud de arista, es decir, 54 litros." );
        } else if(idRecuperado.equals("6")){
            imagen1.setImageResource(R.drawable.ciclidos);
            titulo.setText("CICLIDOS");
            descripcion.setText("La mayoría de cíclidos proceden de África y casi todas las especies viven en los lagos del este del continente. También se encuentran cíclidos en Sudamérica, Centroamérica, Madagascar y en regiones de Asia. Suelen vivir en zonas de agua dulce. La variedad de tamaños es tan impresionante como la riqueza de colores de este grupo. Los escalares, p. ej., tienen forma de disco y un diseño de flecha, mientras que los cíclidos de Marlier son alargados. Lo mismo pasa con la forma de la boca, que está adaptada a las condiciones de alimentación de cada cíclido. " );
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