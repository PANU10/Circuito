package com.company.view;

import com.company.Model.Piloto;
import com.company.Vehiculo.Coche;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MainClasificacionGeneral{

    ArrayList<Piloto> listParticipantes = new ArrayList<>();

    public MainClasificacionGeneral(ArrayList<Piloto> listParticipantes) {
        this.listParticipantes = listParticipantes;
    }

//    public  void show(Piloto[] pilotos) {
//        for (Piloto piloto : pilotos) {
//            System.out.println(piloto.toString());
//        }
//    }
}