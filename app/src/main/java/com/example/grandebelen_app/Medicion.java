package com.example.grandebelen_app;

// --------------------------------------------------------------
//
// Medicion
// Belén Grande López
// 2021-10-7
// Clase POJO medicion
//
// --------------------------------------------------------------

public class Medicion {

    private int medicion;
    private double latitud;
    private double longitud;
    private int major;
    private int minor;

    public Medicion(int medicion, double latitud, double longitud, int major, int minor) {
        this.medicion = medicion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.major = major;
        this.minor = minor;
    }

    public int getMedicion() {
        return medicion;
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public int getMajor() {
        return major;
    }

    public int getMinor() {
        return minor;
    }
}
