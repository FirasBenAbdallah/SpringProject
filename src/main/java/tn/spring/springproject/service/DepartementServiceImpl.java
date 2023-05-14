package tn.spring.springproject.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springproject.entities.Departement;
import tn.spring.springproject.repository.DepartementRepository;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class DepartementServiceImpl implements IDepartementService{
    @Autowired
    DepartementRepository departementRepository;

    @Override
    public Departement addDepartement(Departement c){
        return departementRepository.save(c);
    }

    @Override
    public Departement editDepartement(Departement c) {
        return departementRepository.save(c);
    }

    @Override
    public List<Departement> readAllDepartement() {
        return departementRepository.findAll();
    }

    @Override
    public Departement readDepartementById(Long idDep) {
        return departementRepository.findById(idDep).get();
    }

    @Override
    public void deleteDepartement(Long idDep) {
        try {
            departementRepository.deleteById(idDep);}
        catch (Exception e){
            log.info("Departement with id {0} not found", idDep);
        }
    }
}
