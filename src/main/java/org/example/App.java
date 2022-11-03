package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Perro toby = new Perro();
        toby.raza = "Terrier";
        Perro otto = new Perro();
        otto.raza = "Pastor Alemán";
        System.out.println(toby.raza);
        System.out.println(otto.raza);
        Perro fluky = new Perro("Pastor de aguas");
        System.out.println(fluky.raza);


        Integer resultado = Calculadora.suma(1,2);
        System.out.println(resultado);
        resultado = Calculadora.multi(1,2);
        System.out.println(resultado);
        resultado = Calculadora.divi(4,2);
        System.out.println(resultado);


        Float resul = Calcu.suma(1F,2F);
        System.out.println(resul);
        resul = Calcu.resta(1F,2F);
        System.out.println(resul);
        resul = Calcu.multi(1F,2F);
        System.out.println(resul);
        resul = Calcu.divi(1.5F,2F);
        System.out.println(resul);

    }
}
