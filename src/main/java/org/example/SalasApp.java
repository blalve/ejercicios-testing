package org.example;

public class SalasApp {
    public static void main(String[] args) {
        Sala s = new Sala();
        Sala s2 = new Sala("10x10",true);
        s2.setAire(false);
        s.setDimensiones("20x20");
        s.setAire(true);
        System.out.println(s);
        System.out.println(s2);
        Aula a = new Aula("10x10",false,"David");
        System.out.println(a);

    }
}
