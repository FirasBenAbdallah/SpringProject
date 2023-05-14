package tn.spring.springproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.springproject.entities.Etudiant;
import tn.spring.springproject.service.IEtudiantService;


import java.util.List;

@RestController
@RequestMapping("/etudiant")
public class EtudiantRestController {

    @Autowired
    IEtudiantService etudiantService;

    // http://localhost:8098/spring/etudiant/readalletudiant
    @GetMapping("/readalletudiant")
    List<Etudiant> readAllEtudiant(){ return etudiantService.readAllEtudiants(); }

    // http://localhost:8098/spring/etudiant/addetudiant
    @PostMapping("/addetudiant")
    Etudiant addEtudiant(@RequestBody Etudiant e) {
        return etudiantService.addEtudiant(e);
    }

    // http://localhost:8098/spring/etudiant/editetudiant
    @PutMapping("editetudiant")
    public Etudiant editEtudiant(@RequestBody Etudiant e){
        return etudiantService.editEtudiant(e);
    }

    // http://localhost:8098/spring/etudiant/deleteetudiant/{idetudiant}
    @DeleteMapping("deleteetudiant/{idetudiant}")
    public void deleteEtudiant(@PathVariable("idetudiant") Long idEt) {
        etudiantService.deleteEtudiant(idEt);
    }

    // http://localhost:8098/spring/etudiant/affecterequipetoetudiant/{id-etudiant}/{id-equipe}
    @PutMapping("/affecterequipetoetudiant/{id-etudiant}/{id-equipe}")
    public void affecterEquipeToEtudiant(@PathVariable("id-etudiant") int idEtudiant,@PathVariable("id-equipe") int idEquipe){
        etudiantService.affecterEquipeToEtudiant(idEtudiant, idEquipe);

    }
    // http://localhost:8098/spring/etudiant/addAndAssignEquipeToEquipeAndContrat/{id-etudiant}/{id-equipe}
    @PutMapping("/addAndAssignEquipeToEquipeAndContrat/{id-contrat}/{id-equipe}")
    public Etudiant addAndAssignEtudiantToEquipeAndContrat(@RequestBody Etudiant e, @PathVariable("id-contrat") Integer idContrat,@PathVariable("id-equipe") Integer idEquipe){
        return etudiantService.addAndAssignEtudiantToEquipeAndContrat(e, idContrat, idEquipe);
    }
}
