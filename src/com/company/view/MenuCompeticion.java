package com.company.view;

import java.util.Scanner;

public class MenuCompeticion {
    private String nombreJugador;
    private  int contadorP;
    private  int ncircuito;


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
