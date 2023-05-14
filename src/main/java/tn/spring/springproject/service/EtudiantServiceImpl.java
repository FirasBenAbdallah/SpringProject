package tn.spring.springproject.service;

import lombok.AllArgsConstructor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springproject.entities.Contrat;
import tn.spring.springproject.entities.Equipe;
import tn.spring.springproject.entities.Etudiant;
import tn.spring.springproject.repository.EquipeRepository;
import tn.spring.springproject.repository.EtudiantRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@Slf4j
@AllArgsConstructor

public class EtudiantServiceImpl implements IEtudiantService{
    @Autowired
    private final EtudiantRepository etudiantRepository;
    private final ContratServiceImpl contratService;
    @Autowired
    EquipeRepository equipeRepository;
    public Etudiant addEtudiant(Etudiant e){
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant editEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public List<Etudiant> readAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant readEtudiantById(Long idEt) {
        return etudiantRepository.findById(idEt).get();
    }

    @Override
    public void deleteEtudiant(Long idEtudiant) {
        try {
            etudiantRepository.deleteById(idEtudiant);}
        catch (Exception e){
            log.info("Etudaint with id {0} not found", idEtudiant);
        }
    }

    @Override
    public void affecterEquipeToEtudiant(int idEtudiant, int idEquipe) {
        Etudiant e1 = etudiantRepository.findById(Long.valueOf(idEtudiant)).orElse(null);
        Equipe eq1 = equipeRepository.findById(Long.valueOf(idEquipe)).orElse(null);
        e1.getEquipe().add(eq1);//parent.fils
        etudiantRepository.save(e1);
        //eq1.getEtudiant().add(e1);
        //equipeRepository.save(eq1);
    }
    @Override
    public Etudiant addAndAssignEtudiantToEquipeAndContrat(Etudiant e, Integer idContrat, Integer idEquipe) {
        Etudiant c1 = etudiantRepository.findById(Long.valueOf(idContrat)).orElse(null);
        Equipe eq1 = equipeRepository.findById(Long.valueOf(idEquipe)).orElse(null);
        c1.getEquipe().add(eq1);//parent.fils
        etudiantRepository.save(c1);
        //eq1.getEtudiant().add(e1);
        //equipeRepository.save(eq1);
        return c1;
    }

    /*@Override
    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Long idContrat, Integer idEquipe) {

        if (e == null) return null;

        Contrat c = contratService.deleteContrat(idContrat);

        if (c == null) return null;

        Equipe eq = equipeService.retrieveEquipe(idEquipe);

        if (eq == null) return null;

        e.setContrats(Stream.of(c).collect(Collectors.toList()));

        e.setEquipe(Stream.of(eq).collect(Collectors.toSet()));

        return etudiantRepository.save(e);
    }*/
}
