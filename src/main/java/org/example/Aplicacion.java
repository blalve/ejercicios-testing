package org.example;

public class Aplicacion {

    Controlador controlador;

    public Aplicacion() {
        controlador = new Controlador();
    }

    public Controlador getControlador() {
        return controlador;
    }

    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }

    public void main(String[] args) {
    controlador.list();

    }
}
