package org.example;

import java.util.ArrayList;
import java.util.List;

public class Modelo {

    private List<String> listado;

    public Modelo() {
        listado = new ArrayList<String>();
        listado.add("PrimerValor");
        listado.add("SegundoValor");


    }

    public List<String> list () {
        return listado;
    }
}
