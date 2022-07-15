package com.cursosdedesarrollo.demoapp;

import com.cursosdedesarrollo.demoapp.dtos.Cliente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteTest {

    private Cliente cliente;
    @BeforeEach
    public void setUpTest(){
        this.cliente = new Cliente();
        this.cliente.setNombre("juan");
        this.cliente.setApellido("Fernandez");
        this.cliente.setDni("33887543P");
        this.cliente.setFechaNacimiento("04-05-1989");
        this.cliente.setEmail("juanfernandez@gmail.com");
    }

    @Test
    public void testCliente(){
        assertEquals("juan", cliente.getNombre());
        assertEquals("Fernandez", cliente.getApellido());
        assertEquals("33887543P", cliente.getDni());
        assertEquals("04-05-1989", cliente.getFechaNacimiento());
        assertEquals("juanfernandez@gmail.com", cliente.getEmail());
    }

}
