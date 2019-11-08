package com.company.Model;

import com.company.Vehiculo.Bicicleta;
import com.company.Vehiculo.Coche;
import com.company.Vehiculo.Moto;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Game {
  Scanner tec = new Scanner(System.in);
    private String vehiculo;

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }


    public  void play() {

        System.out.println("Con que vehiculo queires jugar?");

        System.out.println("1.COCHE\n" +
                "2.MOTO\n" +
                "3.BICI\n");

            switch (vehiculo) {
                // V = D/T
                case "Coche":
                    Coche coche = new Coche();
                    coche.start();
                    break;
                case "Moto":
                    Moto moto = new Moto();
                    moto.start();
                    break;
                case "Bicicleta":
                    Bicicleta bicicleta = new Bicicleta();
                    bicicleta.start();
                    break;
            }
    }
}
