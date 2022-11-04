package org.example;

public class Jefe extends Empleado{

    public Integer nivel;

    public String seccion;

    public Jefe() {
        super();
        this.nivel = 0;
        this.seccion = "";


    }


    public Jefe(String nombre, String dni, String tlf, Float sueldo, String rango, Integer nivel, String seccion) {
        super(nombre, dni, tlf, sueldo, rango);
        this.nivel = nivel;
        this.seccion = seccion;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
}
