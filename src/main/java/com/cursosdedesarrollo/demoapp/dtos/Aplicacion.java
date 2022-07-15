package com.cursosdedesarrollo.demoapp.dtos;

public class Aplicacion {

    Controlador controlador;
    public Aplicacion(){
        controlador = new Controlador();
    }
    public void main() {
        controlador.list();
    }
}
