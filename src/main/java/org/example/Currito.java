package org.example;

public class Currito extends Empleado{

    public String departamento;
    public String puesto;


    public Currito(String nombre, String dni, String tlf, Float sueldo, String rango, String departamento, String puesto) {
        super(nombre, dni, tlf, sueldo, rango);
        this.departamento = "";
        this.puesto = "";
    }
}
