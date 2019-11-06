package com.company.Model;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Game {

    private String vehiculo;

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }


    public  void show() {

    }

    public void contra(){

        switch (vehiculo){

            case "Coche":
                System.out.println("Coche");
                break;
            case "Bicicleta":
                System.out.println("BICI");
                break;
            case "Moto":
                System.out.println("BICI0");
                break;
        }
    }
}
