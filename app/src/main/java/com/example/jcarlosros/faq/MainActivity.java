package com.example.jcarlosros.faq;

/**
 * @author Juan Carlos Ríos Jiménez
 * @version 1
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /**
     * Almacena la respuesta de la pregunta seleccionada.
     */
    String respuesta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     *Despliega la respuesta a la pregunta uno.
     */
    public void res1(View v)
    {
        respuesta = "IPNCard es un sistema de compras virtuales, en la cual puedes realizar " +
                "compras de productos disponibles en el CECyT #9. Es una forma segura y fácil " +
                "de gestionar tu dinero para uso escolar.";
        TextView res;
        res = (TextView) findViewById(R.id.txtRes);
        res.setText(respuesta);
    }
    /**
     *Despliega la respuesta a  la pregunta dos.
     */
    public void res2(View v)
    {
        respuesta = "A través de tu perfil de alumno puedes revisar el catálogo de productos" +
                "disponibles, tu perfil personal, así como el historial de compras que haz " +
                "realizado anteriormente; además, podrás solicitar las compras que requieras.";
        TextView res;
        res = (TextView) findViewById(R.id.txtRes);
        res.setText(respuesta);
    }
    /**
     *Despliega la respuesta a  la pregunta tres.
     */
    public void res3(View v)
    {
        respuesta = "Por el momento, IPNCard solo está disponoble para los alumnos de primero" +
                "a sexto semestre del Centro de Estudios Científicos y Tecnológico 9 \"Juan de" +
                "Dios Batiz\".";
        TextView res;
        res = (TextView) findViewById(R.id.txtRes);
        res.setText(respuesta);
    }
    /**
     *Despliega la respuesta a  la pregunta cuatro.
     */
    public void res4(View v)
    {
        respuesta = "A través de la página de logueo, puedes pulsar el texto \"Regístrate\"," +
                "o, si lo prefieres, puedes hacerlo desde nuestra página web.";
        TextView res;
        res = (TextView) findViewById(R.id.txtRes);
        res.setText(respuesta);
    }
    /**
     *Despliega la respuesta a  la pregunta cinco.
     */
    public void res5(View v)
    {
        respuesta = "Si ocurre algún problema al realizar tu registro deberás acudir a Gestión" +
                "Escolar (procura tener a la mano tu número de boleta otorgado por el Instituto.";
        TextView res;
        res = (TextView) findViewById(R.id.txtRes);
        res.setText(respuesta);
    }

}
