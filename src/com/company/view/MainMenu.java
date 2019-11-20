package com.company.view;

import com.company.Model.Game;

import java.util.Scanner;

public class MainMenu {

    public static void show() throws InterruptedException {
        Scanner tec = new Scanner(System.in);


        MenuCompeticion menuCompeticion = new MenuCompeticion();
        Game menuJugar = new Game(menuCompeticion);

        int opcion;
        do{
            System.out.println("MENU: ");

            System.out.println(" 1. Configuración de la competición ");
            System.out.println(" 2. ClassificacióGeneral ");
            System.out.println(" 3. Jugar ");
            System.out.println(" 0. Acabar ");

            opcion = tec.nextInt();

            switch (opcion) {
                case 1:  {
                    menuCompeticion.show();
                    break;
                }
                case 2: {
                    break;
                }
                case 3: {
                    menuJugar.play();
                    break;
                }
                case 0: {
                    return;
                }
            }
        } while (true);
    }
}
