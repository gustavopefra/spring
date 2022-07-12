package com.cursosdedesarrollo.demoapp.services;

import com.cursosdedesarrollo.demoapp.entities.Alumno;
import com.cursosdedesarrollo.demoapp.repositories.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlumnoService {
    @Autowired
    private AlumnoRepository alumnoRepository;

    public List<Alumno> findAll() {
        return this.alumnoRepository.findAll();
    }

    public Alumno save(Alumno objeto) {
        return this.alumnoRepository.save(objeto);

    }

    public Alumno findById(Long id) {
        return this.alumnoRepository.findById(id).orElse(new Alumno());
    }

    public void deleteAlumno(Alumno objeto) {
        this.alumnoRepository.delete(objeto);
    }
}