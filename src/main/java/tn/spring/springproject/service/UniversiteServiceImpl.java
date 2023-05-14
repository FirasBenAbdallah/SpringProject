package tn.spring.springproject.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springproject.entities.Universite;
import tn.spring.springproject.repository.UniversiteRepository;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class UniversiteServiceImpl implements IUniversiteService{
    @Autowired
    UniversiteRepository universiteRepository;

    @Override
    public Universite addUniversite(Universite c){
        return universiteRepository.save(c);
    }

    @Override
    public Universite editUniversite(Universite c) {
        return universiteRepository.save(c);
    }

    @Override
    public List<Universite> readAllUniversite() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite readUniversiteById(Long idUniv) {
        return universiteRepository.findById(idUniv).get();
    }

    @Override
    public void deleteUniversite(Long idUniv) {
        try {
            universiteRepository.deleteById(idUniv);}
        catch (Exception e){
            log.info("Universite with id {0} not found", idUniv);
        }
    }
}
