package com.crud.ut.controlador;

import com.crud.ut.entidades.Estudiante;
import com.crud.ut.servicios.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/estudiantes")
public class EstudianteController {

    @Autowired
    private  EstudianteService estudianteService;




    @GetMapping
        public List<Estudiante> getAll(){
        return estudianteService.getEstudiantes();
            }

    @PostMapping
    public void  saveUpdate(@RequestBody Estudiante estudiante){
        estudianteService.save(estudiante);
    }

    @PutMapping
    public void  Update(@RequestBody Estudiante estudiante){
        estudianteService.Update(estudiante);    }

    @DeleteMapping("/{estudianteId}")
    public void  delete(@PathVariable("estudianteId")Long estudianteId){
        estudianteService.delete(estudianteId);
    }

    @GetMapping("/{estudianteId}")
    public Optional<Estudiante> getBId(@PathVariable("estudianteId") Long estudianteId){
        return estudianteService.getEstudiantes(estudianteId);
    }
}
