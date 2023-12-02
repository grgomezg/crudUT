package com.crud.ut.servicios;

import com.crud.ut.entidades.Estudiante;
import com.crud.ut.repositorio.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteService {
    @Autowired
    EstudianteRepository estudianteRepository;
    public List<Estudiante> getEstudiantes(){
        return  estudianteRepository.findAll();
    }

    public Optional<Estudiante> getEstudiantes(Long id){
        return  estudianteRepository.findById(id);
    }

    public void  save(Estudiante estudiante){
        estudianteRepository.save(estudiante);
        };
        public void Update(Estudiante estudiante){

            //validar si el estudiante existe
            if(estudianteRepository.existsById(estudiante.getId())){
                estudianteRepository.save(estudiante);
            }else{

            };



    }
    public void delete(Long id){
        estudianteRepository.deleteById(id);
    }

}
