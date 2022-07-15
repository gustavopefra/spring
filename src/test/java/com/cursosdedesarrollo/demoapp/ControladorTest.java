package com.cursosdedesarrollo.demoapp;

import com.cursosdedesarrollo.demoapp.dtos.Controlador;
import com.cursosdedesarrollo.demoapp.dtos.Modelo;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;


public class ControladorTest {

    private Controlador controlador;
    private Modelo modelo;

    private List<String> datosProcesados;


    @BeforeEach
    public void setUpTest(){
        this.controlador = new Controlador();
        this.modelo = Mockito.mock(Modelo.class);
        this.datosProcesados = Mockito.mock(List.class);
    }

    @Test
    public void testList(){
        try {
            Mockito.when(this.modelo.list()).thenReturn(Arrays.asList("cadena", "cadena2"));

            this.controlador.list();

            assertEquals(this.modelo.list().get(0), "cadena");
            assertEquals(this.modelo.list().get(0), "cadena2");
        }catch (Exception e) {
            fail(e.getMessage());
        }
    }


}
