package com.company.view;

import java.util.Scanner;

public class MainMenu {

    public static void show() {

        System.out.println("MENU: ");

        System.out.println(" 1. Configuración de la competición ");
        System.out.println(" 2. Resultats/Palmarès/ClassificacióGeneral ");
        System.out.println(" 3. Jugar ");
        System.out.println(" 4. Acabar ");

        Scanner tec = new Scanner(System.in);
        int opcion = tec.nextInt();

        switch (opcion) {
            case 1:  {
                MenuCompeticion.show();
                break;
            }
            case 2: {
                MainClasificacionGeneral.show();
                break;
            }
            case 3: {
                MenuJugar.show();
                break;
            }
            case 4: {
                break;
            }
        }
    }
}
