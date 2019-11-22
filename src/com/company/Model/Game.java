package com.company.Model;

import com.company.Vehiculo.Bicicleta;
import com.company.Vehiculo.Coche;
import com.company.Vehiculo.Moto;
import com.company.view.MenuCompeticion;

import java.beans.BeanInfo;
import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public ArrayList<Piloto> listParticipantes = new ArrayList<>();
    private int nombrevehiculo;
    Vehiculo vehiculo;

    MenuCompeticion menuCompeticion;
    Sortbypuntos sortbypuntos;

    public Game(MenuCompeticion m) {
        this.menuCompeticion = m;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void play() throws InterruptedException {
        escogerVehiculo();

        Random random = new Random();
        System.out.println("Piloto: " + menuCompeticion.getJugador());

        for (int Timer = 4; Timer > 0; ) {
            Timer--;
            Thread.sleep(1000);
            System.out.print(Timer + "...");

            if (Timer == 0) {
                System.out.println("GO");
            }
        }

        listParticipantes.clear();

        Piloto pilotoJugador = new Piloto();
        pilotoJugador.setNombrePiloto(menuCompeticion.getJugador());
        listParticipantes.add(pilotoJugador);

        for (int i = 1; i < menuCompeticion.getContadorP(); i++) {
            Piloto piloto = new Piloto();
            piloto.setNombrePiloto("Participante " + i);
            listParticipantes.add(piloto);
        }

        for (int j = 0; j < menuCompeticion.getNcircuito(); j++) {

            System.out.println("¡Empieza la carrera " + (j + 1) + "!" + "\n");
            System.out.println("---------------------------------");

            for (Piloto p : listParticipantes) {
                int r = random.nextInt(200) + 50;
                p.setTiempo(r);
            }

            Collections.sort(listParticipantes);

            for (int k = 0; k < 5; k++) {
                Piloto p = listParticipantes.get(k);
                if (k == 0) {
                    p.setPuntos(p.getPuntos() + 10);
                } else if (k == 1) {
                    p.setPuntos(p.getPuntos() + 7);
                } else if (k == 2) {
                    p.setPuntos(p.getPuntos() + 5);
                } else if (k == 3) {
                    p.setPuntos(p.getPuntos() + 3);
                } else if (k == 4) {
                    p.setPuntos(p.getPuntos() + 1);
                }
            }

            System.out.println("Circuito " + j);

            for (Piloto p : listParticipantes) {
                System.out.println(p.getNombrePiloto() + " ---- " + p.getTiempo() + " Min " + " ---- " + p.getPuntos() + " Puntos");
            }
            System.out.println("---------------------------------");

            Collections.sort(listParticipantes, sortbypuntos);

        }

    }

    void escogerVehiculo(){
        Scanner in  = new Scanner(System.in);
        System.out.println("Con que vehiculo queires jugar?");

        System.out.println("1.COCHE\n" +
                "2.MOTO\n" +
                "3.BICI\n");
        nombrevehiculo = in.nextInt();

        switch (nombrevehiculo) {
            // V = D/T
            case 1:
                Coche coche1;
                break;
            case 2:
                Moto moto;
                break;
            case 3:
                Bicicleta bicicleta;
                break;
        }
    }
}
