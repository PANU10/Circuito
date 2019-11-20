package com.company.Vehiculo;

import com.company.Model.Piloto;
import com.company.Model.Vehiculo;
import com.company.Model.Sortbypuntos;
import com.company.view.MainClasificacionGeneral;
import com.company.view.MenuCompeticion;

import java.util.*;

public class Coche extends Vehiculo {

    ArrayList<Piloto> listParticipantes = new ArrayList<>();

    MenuCompeticion menuCompeticion;
    Sortbypuntos sortbypuntos;

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
                listParticipantes.add(pilotos[i]);
            }

            System.out.println("¡Empieza la carrera " + (j+1) + "!" +"\n");
            System.out.println("---------------------------------");



            for (int i = 0; i < pilotos.length; i++) {
                int r = random.nextInt(200) + 50;
                pilotos[i].setTiempo(r);
            }

            Arrays.sort(pilotos);

            for (Piloto p: listParticipantes
                 ) {
                System.out.println(p.getNumbrePartc() + "-----" + p.getPuntos());
            }

            System.out.println("Clasificación final: ");


            for (int i = 0; i < pilotos.length; i++) {
                System.out.println(i+1+"    "+pilotos[i].getNombrePiloto()+"   "+pilotos[i].getTiempo()+" "+"Minutos");
            }
            System.out.println("---------------------------------");

            for (int i = 0; i < 4 ; i++) {
                if(listParticipantes.get(i) == listParticipantes.get(0)) listParticipantes.get(i).setPuntos(+10);
                 else if(listParticipantes.get(i) == listParticipantes.get(1)) listParticipantes.get(i).setPuntos(+7);
                 else if(listParticipantes.get(i) == listParticipantes.get(2))listParticipantes.get(i).setPuntos(+5);
                 else if(listParticipantes.get(i) == listParticipantes.get(3))listParticipantes.get(i).setPuntos(+3);
                 else if (listParticipantes.get(i) == listParticipantes.get(4)) listParticipantes.get(i).setPuntos(+1);
            }
        }

        Collections.sort(listParticipantes, sortbypuntos);

        MainClasificacionGeneral clasificacionGeneral = new MainClasificacionGeneral(listParticipantes);
        System.out.println("Classificacion general");
        System.out.println(listParticipantes);
    }
//
//        System.out.println("Nombre Circuito: ");
//        Cursa.NomCursa = sc.nextLine();
//
//        Cursa cursa = new Cursa();
//        Cursa.NomCursa = Circuit.NomCircuit;


}

