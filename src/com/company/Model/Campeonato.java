package com.company.Model;

public class Campeonato  {
    private  int ncircuito;
    private  int participante;


    public int getNcircuito() {
        return ncircuito;
    }

    public void setNcircuito(int ncircuito) {
        this.ncircuito = ncircuito;
    }

    public int getParticipante() {
        return participante;
    }

    public void setParticipante(int participante) {
        this.participante = participante;
    }

    @Override
    public String toString() {
        return "Campeonato{" +
                "ncircuito=" + ncircuito +
                ", participante=" + participante +
                '}';
    }

}
