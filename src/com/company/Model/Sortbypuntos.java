package com.company.Model;

import java.util.Comparator;

public class Sortbypuntos implements Comparator<Piloto> {

    @Override
    public int compare(Piloto p1, Piloto t2) {
        if (p1.getPuntos() < t2.getPuntos()) return 1;
        else if (p1.getPuntos() > t2.getPuntos()) return -1;
        return 0;
    }
}
