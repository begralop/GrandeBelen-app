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

<<<<<<< HEAD
    /**
     * Medicion: medicion --> guardarMedicion() -->
     *
     * Método para guardar las mediciones, le pasamos una medicion
     *
     * @param medicion Medicion
     *
     * @return No devuelve nada
     */

=======
>>>>>>> metodoObtenerTodasLasMediciones
    public void guardarMedicion(Medicion medicion) {

        Log.d("test", "entra a guardar medicion");
        // ojo: creo que hay que crear uno nuevo cada vez
        PeticionarioREST elPeticionario = new PeticionarioREST();

<<<<<<< HEAD
        // Le pasamos como string de JSON todos los datos que queremos que almacene en la base de datos
        String textoJSON = "{\"Medicion\":\"" + medicion.getMedicion() + "\", \"Latitud\":\"" + medicion.getLatitud() + " \", \"Longitud\":\"" + medicion.getLongitud()  + " \", \"Major\":\"" + medicion.getMajor() + " \", \"Minor\":\"" + medicion.getMinor() + "\"}";
        elPeticionario.hacerPeticionREST("POST", "http://192.168.64.2/backend_app_sprint0/src/logica/guardarMediciones.php", textoJSON,
=======
		/*

		   enviarPeticion( "hola", function (res) {
		   		res
		   })

        elPeticionario.hacerPeticionREST("GET",  "http://158.42.144.126:8080/prueba", null,
			(int codigo, String cuerpo) => { } );

		   */
        //la contrabarra es pa clavar la cometa dins del string sense tancar el stringç
        //http://localhost/phpmyadmin/sql.php?db=android_mysql&table=datosmedidos&pos=0
        String textoJSON = "{\"Medicion\":\"" + medicion.getMedicion() + "\", \"Latitud\":\"" + medicion.getLatitud() + "\", \"Longitud\":\"" + medicion.getLongitud() + "\"}";
        Log.d("JSON", textoJSON);
        elPeticionario.hacerPeticionREST("POST", "http://172.20.10.5:8888/backend_app_sprint0/src/logica/guardarMediciones.php", textoJSON,
>>>>>>> metodoObtenerTodasLasMediciones
                new PeticionarioREST.RespuestaREST() {
                    @Override
                    public void callback(int codigo, String cuerpo) {
                        Log.d("test" ,"Se ha insertado correctamente");
                    }
                }
        );

    }

    /**
     * Medicion: medicion --> obtenerUltimasMediciones() -->
     *
     * Método para obtener las últimas mediciones, le pasamos un entero
     *
     * @param cuantas int
     *
     * @return No devuelve nada
     */

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

    /**
     * Context: context --> obtenerTodasLasMediciones() -->
     *
     * Método para obtener todas las mediciones, le pasamos un context para que obtenga la clase Main
     *
     * @param context Context
     *
     * @return No devuelve nada
     */

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
