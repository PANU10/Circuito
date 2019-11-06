package com.company.view;

import com.company.Model.Participante;

import java.util.Scanner;

public class MenuCompeticion {

    Participante participante = new Participante();

    private String jugador;
   // private  int participante;
    private  int ncircuito;

    public  void show() {
        //El nom del jugador, qtat de participants i qtat de circuits del campionat

        Scanner tec = new Scanner(System.in);

        System.out.println("Nombre de jugador: ");
        jugador = tec.nextLine();
        participante.setNombreJugador(jugador);

        System.out.println("Cantidad de participantes: ");
       // participante = tec.nextInt();
        // participante.setContadorP(participante);

        System.out.println("Circuitos: ");
        ncircuito = tec.nextInt();

    }
}
