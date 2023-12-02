package com.crud.ut.servicios;

import com.crud.ut.entidades.Docente;
import com.crud.ut.repositorio.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocenteService {
    @Autowired
    DocenteRepository docenteRepository;

    public List<Docente> getDocentes() {return docenteRepository.findAll();}

   public Optional<Docente> getDocentes(Long id){return  docenteRepository.findById(id);}

   public  void save(Docente docente){docenteRepository.save(docente);}

   public  void update(Docente docente){
        if (docenteRepository.existsById(docente.getId())){
            docenteRepository.save(docente);
        }
   }
   public  void delete(Long id){docenteRepository.deleteById(id);}
}
