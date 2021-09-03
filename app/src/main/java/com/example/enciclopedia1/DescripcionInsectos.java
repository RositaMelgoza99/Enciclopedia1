package com.example.enciclopedia1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class DescripcionInsectos extends AppCompatActivity {
    private ImageView imagen1 ;
    private TextView titulo, descripcion;
    Bundle idAnimal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion_insectos);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        // Inicializando lo componentes
        imagen1 = findViewById(R.id.imagenInsecto);
        titulo = findViewById(R.id.tituloInsecto);
        descripcion = findViewById(R.id.descripcionInsecto);

        // Recuperar la informacion
        idAnimal = getIntent().getExtras();
        String idRecuperado = idAnimal.getString("id");

        if (idRecuperado.equals("1")) {
            imagen1.setImageResource(R.drawable.mariposa);
            titulo.setText("MARIPOSA");
            descripcion.setText(" Las mariposas son un tipo de insecto muy popular por los llamativos colores que tiñen sus alas y por su vuelo vacilante cuando se acerca el buen tiempo. Se han descrito unas 24.000 especies diferentes. Como todos los insectos cuentan con seis patas, dos alas y un cuerpo dividido en tres partes: cabeza, tórax y abdomen.Su boca tiene forma de tubo pues es la herramienta con la que succionan los nutrientes de las plantas para alimentarse a través de una larga lengua enrollada sobre si misma que recibe el nombre de espiritrompa.\n" +
                    "Las orugas se alimentan de la materia vegetal que las rodea: hojas, flores, frutos, tallos, raíces, lo que les da gran importancia agrícola al constituir plagas importantes de cultivos. Algunas especies son especializadas en una o unas pocas especies relacionadas, otras son polífagas, pueden alimentarse de una gran variedad de plantas de diferentes familias\n");

        } else if (idRecuperado.equals("2")) {
            imagen1.setImageResource(R.drawable.abeja);
            titulo.setText("ABEJA");
            descripcion.setText("Las abejas son unos insectos extremadamente sociables que viven en colonias que se establecen en forma de enjambres y en los que se organizan en una estricta jerarquía de tres rangos sociales: la abeja reina, los zánganos y las abejas obreras. Habitan en todos los continentes de la Tierra excepto en la Antártida, y se trata de uno de los insectos más antiguos, del que se sabe, puebla nuestro planeta desde hace más de de 30 millones de años. Se conocen más de 20.000 subespecies distintas de abeja divididas en 7 familias reconocidas. \n" +
                    "Las abejas son los insectos polinizadores por excelencia y tienen una función esencial para el equilibrio de la naturaleza,  ya que contribuyen activamente a la supervivencia de muchas especies de plantas que se reproducen gracias al transporte de polen que llevan a cabo estos pequeños animales al alimentarse del néctar de las flores.\n");

        }else if (idRecuperado.equals("3")){
            imagen1.setImageResource(R.drawable.libelula);
            titulo.setText("LIBELULA");
            descripcion.setText("La libélula,es un insecto perteneciente a la orden. La libélula no es realmente una mosca a pesar de que ambas tienen seis patas y tres partes del cuerpo, cabeza, tórax y abdomen. La principal diferencia entre ellas es que las moscas sólo tienen dos alas, mientras que las libélulas tienen cuatro alas. La libélula tiene dos grandes ojos compuestos que ocupan la mayor parte de su cabeza. Tienen alas largas, delicadas y membranosas que son transparentes y algunas tienen un color amarillo claro cerca de las puntas. Sus cuerpos son largos y delgados y tienen una antena corta. Tienen la ventaja de una vista excelente. Cada uno de sus dos grandes ojos está formado por miles de unidades de seis caras.");
        } else if(idRecuperado.equals("4")){
            imagen1.setImageResource(R.drawable.mosca);
            titulo.setText("Mosca");
            descripcion.setText("Existen más de 120.000 especies de moscas en el mundo entero, y son consideradas una plaga puesto que suponen un riesgo para la salud de personas y animales. Pueden contaminar su hogar y su negocio y son portadoras de enfermedades como Salmonella y E.coli. Algunas especies incluso pueden llegar a picar. Un leve problema de moscas sin eliminar puede convertirse en una grave infestación, ya que algunas especies de moscas son capaces de completar su desarrollo de huevos a adultos en tan solo siete días. " );
        } else if(idRecuperado.equals("5")){
            imagen1.setImageResource(R.drawable.avispa);
            titulo.setText("Avispa");
            descripcion.setText("Estos insectos ostentan todos los colores que podamos imaginar, desde el amarillo al que ya estamos acostumbrados, al marrón, el azul metálico o el rojo vivo. Generalmente, las especies de colores más brillantes pertenecen a la familia de las Vespidae, es decir, las avispas que pican. A pesar del miedo que provocan, las avispas son sumamente beneficiosas para el ser humano. Casi todos los insectos considerados plagas en el planeta son presa de una especie de avispa, bien sea como alimento o como anfitrión de sus larvas parasitarias. Las avispas son tan adeptas a controlar las plagas, que hoy en día, el sector agrícola industrial las despliega de forma generalizada como insecticida ecológico para proteger los cultivos. " );
        } else if(idRecuperado.equals("6")){
            imagen1.setImageResource(R.drawable.chinche);
            titulo.setText("CHINCHE");
            descripcion.setText("Las chinches son pequeños insectos parásitos de color marrón rojizo que pican la piel expuesta de los seres humanos y de los animales que están dormidos para alimentarse con su sangre. Aunque las chinches no son conocidas por propagar enfermedades, pueden causar otros problemas económicos y de salud pública. " );
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