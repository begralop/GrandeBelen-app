package com.example.grandebelen_app;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.grandebelen_app.logicaFake.Logica;
import com.example.grandebelen_app.logicaFake.Medicion;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class TestLogica {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void probarCrearMedicion() {
        Medicion m = new Medicion(6,7,8);
        assertEquals(6, m.getMedicion() );
    }

}