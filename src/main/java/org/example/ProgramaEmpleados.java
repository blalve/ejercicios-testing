package org.example;

public class ProgramaEmpleados {
    public static void main( String[] args ) {
        Empleado e = new Empleado();
        Empleado e2 = new Empleado("Blanca","20200200R","958123456",16000F,"Alto");
        e.nombre = "Blanca";
        e.setDni("20200200R");
        e.setTlf("600000000");
        e.setSueldo(1000F);
        e.setRango("medio");
        System.out.println(e.nombre);
        System.out.println(e.getDni());
        System.out.println(e.getTlf());
        System.out.println(e.getSueldo());
        System.out.println(e.getRango());
        e2.setDni("3333");






    }
}
