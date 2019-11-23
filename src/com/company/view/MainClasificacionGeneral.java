package com.company.view;

import com.company.Model.Piloto;
import com.company.Vehiculo.Coche;

import java.lang.reflect.Array;
import java.util.*;

public class MainClasificacionGeneral{

    ArrayList<Piloto> listParticipantes;


    public MainClasificacionGeneral(ArrayList<Piloto> listParticipantes) {
        this.listParticipantes = listParticipantes;
    }

    void mostrar(){
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append("--------------------- ");
        sb.append("Clasificación General");
        sb.append(" ---------------------\n");

        for (Piloto p: listParticipantes) {

            sb.append("\n"+p.getNombrePiloto() + " tiene ---- " + p.getPuntos() + " puntos");
        }
        System.out.println(sb.toString());
    }
}