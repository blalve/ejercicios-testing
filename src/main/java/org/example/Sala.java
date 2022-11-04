package org.example;

public class Sala {
    private String dimensiones;
    private Boolean aire;

    public Sala() {
        this.dimensiones = "";
        this.aire = false;
    }
    public Sala(String dimensiones, Boolean aire) {
        this.dimensiones = dimensiones;
        this.aire = aire;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "dimensiones='" + dimensiones + '\'' +
                ", aire=" + aire +
                '}';
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public Boolean getAire() {
        return aire;
    }

    public void setAire(Boolean aire) {
        this.aire = aire;
    }

}
