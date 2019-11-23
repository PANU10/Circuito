package com.company.view;

import com.company.Model.Game;
import com.company.Vehiculo.Coche;

import java.util.Scanner;

public class MainMenu {

    public static void show() throws InterruptedException {
        Scanner tec = new Scanner(System.in);

        MenuCompeticion menuCompeticion = new MenuCompeticion();
        Game menuJugar = new Game(menuCompeticion);

        MainClasificacionGeneral clasificacionGeneral = new MainClasificacionGeneral(menuJugar.listParticipantes);

        int opcion;
        do{
            System.out.println("MENU: ");

            System.out.println(" 1. Configuración de la competición ");
            System.out.println(" 2. Jugar ");
            System.out.println(" 3. ClassificacióGeneral ");
            System.out.println(" 0. Acabar " + "\n");


            System.out.println("Elige una opción : ");
            opcion = tec.nextInt();

            switch (opcion) {
                case 1:  {
                    menuCompeticion.show();
                    break;
                }
                case 2: {
                    menuJugar.play();
                    break;
                }
                case 3: {
                    clasificacionGeneral.mostrar();
                    break;
                }
                case 0: {
                    return;
                }
            }
        } while (true);
    }
}
