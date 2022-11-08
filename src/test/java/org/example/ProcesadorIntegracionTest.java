package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


import static org.mockito.Mockito.*;


public class ProcesadorIntegracionTest {

    @Test
    public void testIntegracionProcesador(){
        //declaro el dato que quiero devolver
        String datoAdevolver = "Micadena";

        //Declaro un objeto de la clase Procesador
        Procesador pdor= new Procesador();

        // Creo el proceso simulado
        Proceso procesoSimulado = spy(new Proceso());

        //Cambio el proceso original por el simulado
        pdor.setProceso(procesoSimulado);

        //Cambio el comportamiento del proceso simulado
        when(procesoSimulado.getNombre()).thenReturn(datoAdevolver);

        //llamo al metodo que deberia hacer llamada al proceso simulado
        pdor.llamaProceso();

        //compruebo que ha procesado la llamada a llamaProceso
        verify(procesoSimulado).getNombre();


        // y que se ha realizado bien
        assertEquals("Micadena-i",pdor.getComando());
    }



}
