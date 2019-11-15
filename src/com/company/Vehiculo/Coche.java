package com.company.Vehiculo;

import com.company.Model.Piloto;
import com.company.Model.Vehiculo;
import com.company.view.MenuCompeticion;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Coche extends Vehiculo {

    MenuCompeticion menuCompeticion;

    public Coche(MenuCompeticion menuCompeticion) {
        this.menuCompeticion = menuCompeticion;
    }

    public void start() throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();



        Vehiculo vehiculo = new Vehiculo();
//        System.out.println("Número participantes: ");
//        int NumPartc = sc.nextInt();
//        sc.nextLine()

        pilotos = new Piloto[menuCompeticion.getContadorP()];
        Coche[] coches = new Coche[menuCompeticion.getContadorP()];

        String nombre = menuCompeticion.getJugador();
        System.out.println("Piloto: " + menuCompeticion.getJugador());

        for (int Timer = 4; Timer > 0; ) {
            Timer--;
            Thread.sleep(1000);
            System.out.print(Timer + "...");

            if (Timer == 0) {
                System.out.println("GO");
            }
        }
        for(int j = 0; j < menuCompeticion.getNcircuito(); j++){

            for (int i = 0; i < pilotos.length; i++) {

                pilotos[i] = new Piloto();
                coches[i] = new Coche(menuCompeticion);


                pilotos[0].setNombrePiloto(nombre);
                pilotos[i].setNombrePiloto("Participante " + i);
                pilotos[i].setNumbrePartc(i);

            }

            System.out.println("¡Empieza la carrera " + (j+1) + "!" +"\n");
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
//
//        System.out.println("Nombre Circuito: ");
//        Cursa.NomCursa = sc.nextLine();
//
//        Cursa cursa = new Cursa();
//        Cursa.NomCursa = Circuit.NomCircuit;


}

