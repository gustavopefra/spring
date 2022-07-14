package com.cursosdedesarrollo.demoapp.dtos;


import lombok.Data;

import java.util.Date;

@Data
public class Cliente {

    private String nombre;
    private String apellido;
    private String dni;
    private String email;
    private String fechaNacimiento;
}
