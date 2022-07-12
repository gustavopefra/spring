package com.cursosdedesarrollo.demoapp.controllers;

import com.cursosdedesarrollo.demoapp.entities.Alumno;
import com.cursosdedesarrollo.demoapp.services.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.validation.Valid;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
public class ControladorAccesoServicio {
    @Autowired
    private AlumnoService alumnoService;

    @GetMapping("/")
    public List<Alumno> getList() throws ServletException, IOException {
        return this.alumnoService.findAll();
    }

    @PostMapping("/api/crud/add")
    public Alumno addAlumno(@Valid @RequestBody Alumno alumno)
            throws ServletException, IOException {
        return this.alumnoService.save(alumno);
    }

    @GetMapping("/api/crud/{id}")
    public Alumno getAlumno (@PathVariable Long id )throws ServletException, IOException {
        return this.alumnoService.findById(id);

    }

    @PostMapping("/api/crud/edit/{id}")
    public Alumno editAlumno(@PathVariable Long id,
                             @Valid @RequestBody Alumno alumno)
            throws ServletException, IOException {
        Alumno alumnoGuardado = this.alumnoService.findById(id);
        alumnoGuardado.setNombre(alumno.getNombre());
        alumnoGuardado.setEdad(alumno.getEdad());

        return this.alumnoService.save(alumnoGuardado);
    }

    @DeleteMapping("/api/crud/delete/{id}")
    public Alumno deleteAlumnoById(@PathVariable Long id) {

        Alumno alumno = this.alumnoService.findById(id);
        this.alumnoService.deleteAlumno(alumno);

        return alumno;
    }
}