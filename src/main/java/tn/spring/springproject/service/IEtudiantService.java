package tn.spring.springproject.service;

import tn.spring.springproject.entities.Etudiant;
import java.util.List;

public interface IEtudiantService {
    Etudiant addEtudiant(Etudiant e);
    Etudiant editEtudiant(Etudiant e);
    List<Etudiant> readAllEtudiants();
    Etudiant readEtudiantById(Long idEt);
    void deleteEtudiant(Long idEtudiant);
    void affecterEquipeToEtudiant(int idEtudiant, int idEquipe);
    Etudiant addAndAssignEtudiantToEquipeAndContrat(Etudiant e, Integer idContrat, Integer idEquipe);
}
