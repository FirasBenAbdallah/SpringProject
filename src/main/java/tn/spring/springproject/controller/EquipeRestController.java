package tn.spring.springproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.springproject.entities.Equipe;
import tn.spring.springproject.service.IEquipeService;

import java.util.List;

@RestController
@RequestMapping("/equipe")
public class EquipeRestController {

    @Autowired
    IEquipeService equipeService;

    // http://localhost:8098/spring/equipe/readAllEquipe
    @GetMapping("/readallequipe")
    List<Equipe> readAllEquipe(){ return equipeService.readAllEquipe(); }

    // http://localhost:8098/spring/equipe/addequipe
    @PostMapping("/addequipe")
    Equipe addEquipe(@RequestBody Equipe e) {
        return equipeService.addEquipe(e);
    }

    // http://localhost:8098/spring/equipe/editequipe
    @PutMapping("editequipe")
    public Equipe editEquipe(@RequestBody Equipe e){
        return equipeService.editEquipe(e);
    }

    @DeleteMapping("deleteequipe/{idequipe}")
    public void deleteEquipe(@PathVariable("idequipe") Long idEq) {
        equipeService.deleteEquipe(idEq);
    }
}
