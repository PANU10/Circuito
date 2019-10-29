package com.company.view;

import java.util.Scanner;

public class MenuCompeticion {
    private String nombreJugador;
    private  int contadorP;
    private  int ncircuito;

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
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
        //El nom del jugador, qtat de participants i qtat de circuits del campionat

        Scanner tec = new Scanner(System.in);

        System.out.println("Nombre de jugador: ");
        nombreJugador = tec.nextLine();

        System.out.println("Cantidad de participantes: ");
        contadorP = tec.nextInt();

        System.out.println("Circuitos: ");
        ncircuito = tec.nextInt();

    }
}
