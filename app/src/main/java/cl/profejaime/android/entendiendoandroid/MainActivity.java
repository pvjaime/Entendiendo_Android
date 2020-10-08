package cl.profejaime.android.entendiendoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Variables de los elementos de la vista
    //Referencia al componente de la imagen
    private ImageView logoInacap;
    //Referencia al componente del texto
    private TextView textoModificar;
    //Referencia al componente del Boton
    private Button botonAccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Le voy a setear la vista que va a estar atada a esta clase
        setContentView(R.layout.activity_main);
        //Rescato los componentes desde la vista que setie en el punto anterior
        logoInacap = findViewById(R.id.logoInacap);
        textoModificar = findViewById(R.id.textoBienvenida);
        botonAccion = findViewById(R.id.ingresar_a_la_app);
        botonAccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoModificar.setText("vamonos a tomar once");
                logoInacap.setVisibility(View.GONE);
            }
        });
    }

    public void saludarATodos(View view) {
        textoModificar.setText("vamonos a tomar once");
        logoInacap.setVisibility(View.GONE);
    }
}