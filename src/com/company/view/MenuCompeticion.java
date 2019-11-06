package com.company.view;

import com.company.Model.Campeonato;
import com.company.Model.Participante;

import java.util.Scanner;

public class MenuCompeticion {

    Participante participante = new Participante();
    Campeonato campeonato = new Campeonato();

    private String jugador;
    private int contadorP;
    private int ncircuito;

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public int getContadorP() {
        return contadorP;
    }

    public void setContadorP(int contadorP) {
        this.contadorP = contadorP;
    }

    public int getNcircuito() {
        return ncircuito;
    }

    public void setNcircuito(int ncircuito) {
        this.ncircuito = ncircuito;
    }

    public  void show() {
        //El nom del jugador, qtat de participants i qtat de circuits del campionatjkjukkhj

        Scanner tec = new Scanner(System.in);

        System.out.println("Nombre de jugador: ");
        jugador = tec.nextLine();
        participante.setNombreJugador(jugador);

        System.out.println("Cantidad de participantes: ");
        contadorP = tec.nextInt();
        campeonato.setParticipante(contadorP);

        System.out.println("Circuitos: ");
        ncircuito = tec.nextInt();
        campeonato.setNcircuito(ncircuito);
    }
}
