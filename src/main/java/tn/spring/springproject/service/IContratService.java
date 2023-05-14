package tn.spring.springproject.service;

import tn.spring.springproject.entities.Contrat;

import java.util.List;

public interface IContratService {
    Contrat addContrat(Contrat c);

    Contrat editContrat(Contrat c);

    List<Contrat> readAllContrat();

    Contrat readContratById(Long idCt);

    void deleteContrat(Long idCt);
}
