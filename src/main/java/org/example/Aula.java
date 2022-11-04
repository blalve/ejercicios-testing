package org.example;

public class Aula extends Sala{
    private String profesorAsignado;

    public Aula() {
        super();
        this.profesorAsignado = "";
    }
    public Aula(String dimensiones, Boolean aire, String profesorAsignado) {
        super(dimensiones, aire);
        this.profesorAsignado = profesorAsignado;
    }



    public String getProfesorAsignado() {
        return profesorAsignado;
    }

    public void setProfesorAsignado(String profesorAsignado) {
        this.profesorAsignado = profesorAsignado;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "profesorAsignado='" + profesorAsignado + '\'' +
                '}';
    }
}
