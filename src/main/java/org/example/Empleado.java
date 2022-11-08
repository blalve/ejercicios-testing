package org.example;

public class Empleado extends Persona {


    private String dni;
    private String tlf;
    private Float sueldo;
    private String rango;

    public Empleado() {
        this.nombre = "";
        this.dni = "";
        this.tlf = "";
        this.sueldo = 0F;
        this.rango = "";
    }

    public Empleado(String nombre, String dni, String tlf, Float sueldo, String rango) {
        this.nombre = nombre;
        this.dni = dni;
        this.tlf = tlf;
        this.sueldo = sueldo;
        this.rango = rango;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public Float getSueldo() {
        return sueldo;
    }

    public void setSueldo(Float sueldo) {
        this.sueldo = sueldo;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", tlf='" + tlf + '\'' +
                ", sueldo=" + sueldo +
                ", rango='" + rango + '\'' +
                '}';
    }
}
