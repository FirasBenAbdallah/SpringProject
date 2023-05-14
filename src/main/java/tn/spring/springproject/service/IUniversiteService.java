package tn.spring.springproject.service;

import tn.spring.springproject.entities.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite addUniversite(Universite c);

    Universite editUniversite(Universite c);

    List<Universite> readAllUniversite();

    Universite readUniversiteById(Long idUniv);

    void deleteUniversite(Long idUniv);
}
