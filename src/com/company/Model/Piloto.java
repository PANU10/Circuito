package com.company.Model;

public class Piloto implements Comparable<Piloto> {

    private String NombrePiloto = "";
    private int NumbrePartc;

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
        return "Piloto{" +
                "NombrePiloto='" + NombrePiloto + '\'' +
                '}';
    }

    @Override
    public int compareTo(Piloto piloto) {
        if (Tiempo >= piloto.getTiempo()) {
            return 1;
        }
        return -1;
    }
}
