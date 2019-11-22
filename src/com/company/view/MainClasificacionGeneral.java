package com.company.view;

import com.company.Model.Piloto;
import com.company.Vehiculo.Coche;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MainClasificacionGeneral{

    ArrayList<Piloto> listParticipantes;

    public MainClasificacionGeneral(ArrayList<Piloto> listParticipantes) {
        this.listParticipantes = listParticipantes;
    }

    void mostrar(){
        System.out.println("Clasificación General");
        for (Piloto p: listParticipantes) {
            System.out.println(p.getNombrePiloto() + "----" + p.getPuntos());
        }
    }

//    public  void show(Piloto[] pilotos) {
//        for (Piloto piloto : pilotos) {
//            System.out.println(piloto.toString());
//        }
//    }
}