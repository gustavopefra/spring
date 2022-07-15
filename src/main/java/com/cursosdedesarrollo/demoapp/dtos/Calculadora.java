package com.cursosdedesarrollo.demoapp.dtos;

import lombok.Data;

@Data
public class Calculadora {


    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar (int a, int b) {
        return a - b;
    }

    public int multiplicar (int a, int b) {
        return a * b;
    }

    public int dividir (int a, int b) {
        return a / b;
    }
}
