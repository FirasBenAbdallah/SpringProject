package tn.spring.springproject.service;

import tn.spring.springproject.entities.Contrat;
import tn.spring.springproject.entities.DetailEquipe;

import java.util.List;

public interface IDetailEquipeService {
    DetailEquipe addDetailEquipe(DetailEquipe c);

    DetailEquipe editDetailEquipe(DetailEquipe c);

    List<DetailEquipe> readAllDetailEquipe();

    DetailEquipe readDetailEquipeById(Long idDE);

    void deleteDetailEquipe(Long idDE);
}
