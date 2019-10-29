package com.company.view;

import java.util.Scanner;

public class MainMenu {

    public static void show() {

        MenuCompeticion menuCompeticion = new MenuCompeticion();
        MainClasificacionGeneral mainClasificacionGeneral = new MainClasificacionGeneral();
        MenuJugar menuJugar = new MenuJugar();

        System.out.println("MENU: ");

        System.out.println(" 1. Configuración de la competición ");
        System.out.println(" 2. ClassificacióGeneral ");
        System.out.println(" 3. Jugar ");
        System.out.println(" 0. Acabar ");

        Scanner tec = new Scanner(System.in);
        int opcion = tec.nextInt();

        switch (opcion) {
            case 1:  {
                menuCompeticion.show();
                break;
            }
            case 2: {
                mainClasificacionGeneral.show();
                break;
            }
            case 3: {
                menuJugar.show();
                break;
            }
            case 0: {
                break;
            }
        }
    }
}
