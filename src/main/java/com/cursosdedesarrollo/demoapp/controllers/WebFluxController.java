package com.cursosdedesarrollo.demoapp.controllers;

import com.cursosdedesarrollo.demoapp.entities.Alumno;
import com.cursosdedesarrollo.demoapp.services.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class WebFluxController {

    @Autowired
    private AlumnoService alumnoService;

    @GetMapping("/api/alumnos/{id}")
    private Mono<Alumno> getAlumnoById(
            @PathVariable Long id) {
        return Mono.just(alumnoService.findById(id));

    }

}
