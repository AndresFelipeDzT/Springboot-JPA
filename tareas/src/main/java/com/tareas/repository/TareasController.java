package com.tareas.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tareas.modelo.Tarea;

@RestController
@RequestMapping("/tareas")
public class TareasController {

    @Autowired
    TareasRepository tareasRepository;

    @PostMapping("/")
        @ResponseStatus(HttpStatus.CREATED)
        public Tarea crearTarea(@RequestBody Tarea todo) {
            return tareasRepository.save(todo);
        }

        @GetMapping("/")
        public Iterable<Tarea> getTareas() {
            return tareasRepository.findAll();
        }

}
