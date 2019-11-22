package com.company.Model;

import java.util.Comparator;

public class Piloto implements Comparable<Piloto> {

    private String NombrePiloto;
    private int NumbrePartc;

    public int getPuntos() {
        return Puntos;
    }

    public void setPuntos(int puntos) {
        Puntos = puntos;
    }

    private int Puntos;

    public String getNombrePiloto() {
        return NombrePiloto;
    }

    public void setNombrePiloto(String nombrePiloto) {
        NombrePiloto = nombrePiloto;
    }

    public int getNumbrePartc() {
        return NumbrePartc;
    }

    public void setNumbrePartc(int numbrePartc) {
        NumbrePartc = numbrePartc;
    }

    public void setTiempo(int tiempo) {
        Tiempo = tiempo;
    }

    private int Tiempo;

    public int getTiempo() {
        return Tiempo;
    }

    @Override
    public String toString() {
        return " NombrePiloto = " + NombrePiloto + " Puntos = " + Puntos + '\n';
    }

    @Override
    public int compareTo(Piloto piloto) {
        if (this.getTiempo() >= piloto.getTiempo()) {
            return 1;
        }
        return -1;
    }


}

