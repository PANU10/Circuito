package com.company.Model;

import com.company.Vehiculo.Bicicleta;
import com.company.Vehiculo.Coche;
import com.company.Vehiculo.Moto;
import com.company.view.MenuCompeticion;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Game {
  Scanner tec = new Scanner(System.in);
    private int nombrevehiculo;
    Vehiculo vehiculo;
    MenuCompeticion m;

    public Game(MenuCompeticion m) {
        this.m = m;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }




    public  void play() throws InterruptedException {
        Scanner in  = new Scanner(System.in);
        System.out.println("Con que vehiculo queires jugar?");

        System.out.println("1.COCHE\n" +
                "2.MOTO\n" +
                "3.BICI\n");
        nombrevehiculo = in.nextInt();

            switch (nombrevehiculo) {
                // V = D/T
                case 1:
                    Vehiculo coche = new Coche();
                    coche.start();

                    break;
                case 2:
                    Vehiculo moto = new Moto();
                    moto.start();
                    break;
                case 3:
                    Vehiculo bicicleta = new Bicicleta();
                    bicicleta.start();
                    break;
            }
    }
}
