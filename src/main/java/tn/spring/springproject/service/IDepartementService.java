package tn.spring.springproject.service;

import tn.spring.springproject.entities.Departement;

import java.util.List;

public interface IDepartementService {
    Departement addDepartement(Departement c);

    Departement editDepartement(Departement c);

    List<Departement> readAllDepartement();

    Departement readDepartementById(Long idDep);

    void deleteDepartement(Long idDep);
}
