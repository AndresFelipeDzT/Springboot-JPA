package com.tareas.repository;


import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.tareas.modelo.Tarea;

@Repository
public interface TareasRepository extends JpaRepository<Tarea, Long> {
    

}
