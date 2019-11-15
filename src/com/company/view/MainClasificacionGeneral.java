package com.company.view;

import com.company.Model.Piloto;
import java.util.ArrayList;

public class MainClasificacionGeneral {

    public  void show(Piloto[] pilotos) {
        for (Piloto piloto : pilotos) {
            System.out.println(piloto.toString());
        }
    }
}
