package com.cursosdedesarrollo.demoapp;

import com.cursosdedesarrollo.demoapp.dtos.Calculadora;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    private Calculadora calculadora;
    @BeforeEach
    public void setUpTest(){
        this.calculadora = new Calculadora();

    }

    @Test
    public void testSuma(){
        assertEquals(3, calculadora.sumar(1, 2));
    }

    @Test
    public void testResta(){
        assertEquals(2, calculadora.restar(4, 2));
    }

    @Test
    public void testMultiplicar(){
        assertEquals(4, calculadora.multiplicar(2, 2));
    }

    @Test
    public void testDividir(){
        assertEquals(1, calculadora.dividir(2, 2));
    }
}
