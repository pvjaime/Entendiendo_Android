package cl.profejaime.android.entendiendoandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    //Vamos a declarar los objetos que estan en el activity_login.xml
    //Los EditText de la vista
    private EditText txtLogin;
    private EditText txtClave;
    //Los Botones de la vista
    private Button btnLogin, btnRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //Aca vamos a enlazar el elemento de la vista con el objeto
        txtLogin = findViewById(R.id.txtUsuario);
        txtClave = findViewById(R.id.txtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnRegistro = findViewById(R.id.btnRegistro);

        //Opciones para trabajar con las acciones del boton click
        //Opcion 1
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Aca voy a empezar a trabajar con esos objetos
                String user = txtLogin.getText().toString();
                String clave = txtClave.getText().toString();
                // Llamo a la funcion para validar el usuario
                validarUsuario(user, clave);
            }
        });
    }

    //Esta es la accion que realizo cuando hago click en el boton de login
    private void validarUsuario(String user, String clave) {
        if(user.equalsIgnoreCase("miguel") && clave.equalsIgnoreCase("123456")){
            //Esta es otra forma de mostrar una alerta al usuario
            Toast.makeText(getApplicationContext(),"Bienvenido",Toast.LENGTH_SHORT).show();
            //Vamos a abrir el menu principal
            //para ello vamos a generar un intent donde configuro mi activity actual y la de destino
            Intent irAlMenuPrincipal = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(irAlMenuPrincipal);
            //Finalizo la actividad actual
            finish();
        }else{
            //Aca vamos a mostrar una alerta para decirle al usuario que su ingreso no es valido
            AlertDialog.Builder alert1 = new AlertDialog.Builder(this);
            alert1.setMessage("Usuario Incorrecto").setTitle("Acceso Incorrecto");
            AlertDialog dialog = alert1.create();
            dialog.show();
        }

    }
}