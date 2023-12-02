package com.crud.ut.controlador;

import com.crud.ut.entidades.Docente;
import com.crud.ut.servicios.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/docentes")
public class DocenteController {
    @Autowired
private DocenteService docenteService;




@GetMapping
    public List<Docente> getAll(){
    return  docenteService.getDocentes();
}
@PostMapping
    public void  saveUpdate(@RequestBody Docente docente){docenteService.save(docente);}
@PutMapping
 public void Update(@RequestBody Docente docente){docenteService.update(docente);}

 @DeleteMapping("/{docenteId}")
 public void   delete(@PathVariable("docenteId")Long docenteId){docenteService.delete(docenteId);}

 @GetMapping("/{docenteId}")
 public Optional<Docente> getBId(@PathVariable("docenteId")Long docenteId){
    return  docenteService.getDocentes(docenteId);
 }

}
