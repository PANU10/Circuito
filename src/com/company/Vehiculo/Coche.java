package com.company.Vehiculo;

import com.company.Model.Piloto;
import com.company.Model.Vehiculo;
import com.company.view.MenuCompeticion;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Coche extends Vehiculo {

    public void start() throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        MenuCompeticion menuCompeticion = new MenuCompeticion();
        Vehiculo vehiculo = new Vehiculo();
//        System.out.println("Número participantes: ");
//        int NumPartc = sc.nextInt();
//        sc.nextLine()

        pilotos = new Piloto[menuCompeticion.getContadorP()];
        Coche[] coches = new Coche[menuCompeticion.getContadorP()];


        for (int i = 0; i < pilotos.length; i++) {

            pilotos[i] = new Piloto();
            coches[i] = new Coche();

            System.out.println("Nombre del piloto: ");
            String nombre = menuCompeticion.getJugador();

            pilotos[i].setNombrePiloto(nombre);
            pilotos[i].setNumbrePartc(i);


            System.out.println("Marca del coche: ");
            String marca = sc.nextLine();
            coches[i].setMarca(marca);
        }
//
//        System.out.println("Nombre Circuito: ");
//        Cursa.NomCursa = sc.nextLine();
//
//        Cursa cursa = new Cursa();
//        Cursa.NomCursa = Circuit.NomCircuit;

        for (int Timer = 4; Timer > 0; ) {
            Timer--;
            Thread.sleep(1000);
            System.out.print(Timer + "...");

            if (Timer == 0) {
                System.out.println("GO");
            }
        }
        System.out.println("¡Empieza la carrera!"+ "\n");
        System.out.println("---------------------------------");



        for (int i = 0; i < pilotos.length; i++) {
            int r = random.nextInt(200) + 50;
            pilotos[i].setTiempo(r);
        }

        Arrays.sort(pilotos);

        System.out.println("Clasificación final: ");


        for (int i = 0; i < pilotos.length; i++) {
            System.out.println(i+1+"    "+pilotos[i].getNombrePiloto()+"   "+pilotos[i].getTiempo()+" "+"Minutos");
        }
        System.out.println("---------------------------------");
    }
}

