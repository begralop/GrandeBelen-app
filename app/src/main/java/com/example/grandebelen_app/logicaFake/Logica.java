package com.example.grandebelen_app.logicaFake;

// --------------------------------------------------------------
//
// Logica
// Belén Grande López
// 2021-10-7
// Clase Logica donde se incluyen los metodos de la logica de negocio que llama a los del backend conectado a la bbdd
//
// --------------------------------------------------------------

import android.content.Context;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.grandebelen_app.MainActivity;
import com.example.grandebelen_app.Medicion;

public class Logica extends AppCompatActivity {

    public void guardarMedicion(Medicion medicion) {

        // ojo: creo que hay que crear uno nuevo cada vez
        PeticionarioREST elPeticionario = new PeticionarioREST();

        // Le pasamos como string de JSON todos los datos que queremos que almacene en la base de datos
        String textoJSON = "{\"Medicion\":\"" + medicion.getMedicion() + "\", \"Latitud\":\"" + medicion.getLatitud() + " \", \"Longitud\":\"" + medicion.getLongitud()  + " \", \"Major\":\"" + medicion.getMajor() + " \", \"Minor\":\"" + medicion.getMinor() + "\"}";
        elPeticionario.hacerPeticionREST("POST", "http://192.168.64.2/backend_app_sprint0/src/logica/guardarMediciones.php", textoJSON,
                new PeticionarioREST.RespuestaREST() {
                    @Override
                    public void callback(int codigo, String cuerpo) {
                        Log.d("" ,"Se ha insertado correctamente");
                    }
                }
        );

    }

    public void obtenerUltimasMediciones(int cuantas) {


        // ojo: creo que hay que crear uno nuevo cada vez
        PeticionarioREST elPeticionario = new PeticionarioREST();


       /*elPeticionario.hacerPeticionREST("POST", "http://192.168.64.2/backend_app_sprint0/guardarMediciones.php", textoJSON,
                new PeticionarioREST.RespuestaREST() {
                    @Override
                    public void callback(int codigo, String cuerpo) {
                        Log.d("" ,"Se ha insertado correctamente");
                    }
                }
        );

         */

    }

    public void obtenerTodasLasMediciones(Context context) {

        // ojo: creo que hay que crear uno nuevo cada vez
        PeticionarioREST elPeticionario = new PeticionarioREST();


        // Hacemos la petición para obtener todas las mediciones de la base de datos
        elPeticionario.hacerPeticionREST("GET", "http://192.168.64.2/backend_app_sprint0/src/logica/obtenerTodasMediciones.php", null,
                new PeticionarioREST.RespuestaREST() {
                    @Override
                    public void callback(int codigo, String cuerpo) {

                        ((MainActivity)context).abrirActividadConDatos(cuerpo); // LLamamos al método del main para pasarle todas las mediciones

                    }
                }
        );
    }

}
