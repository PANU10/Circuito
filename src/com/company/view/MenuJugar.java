package com.company.view;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class MenuJugar {

    String vehiculo;

    public  void show() {

        Scanner tec = new Scanner(System.in);
        System.out.println("Qué tipo de vehículo quieres participar : " + "Coche , Bicicleta, Moto");
        vehiculo = tec.nextLine();
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
