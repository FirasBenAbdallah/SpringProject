package tn.spring.springproject.service;

import tn.spring.springproject.entities.Equipe;

import java.util.List;

public interface IEquipeService {
    Equipe addEquipe(Equipe e);

    Equipe editEquipe(Equipe e);

    List<Equipe> readAllEquipe();

    Equipe readEquipeById(Long idEq);

    void deleteEquipe(Long idEq);
}
