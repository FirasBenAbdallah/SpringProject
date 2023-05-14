package tn.spring.springproject.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springproject.entities.Contrat;
import tn.spring.springproject.repository.ContratRepository;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class ContratServiceImpl implements IContratService{
    @Autowired
    ContratRepository contratRepository;

    @Override
    public Contrat addContrat(Contrat c){
        return contratRepository.save(c);
    }

    @Override
    public Contrat editContrat(Contrat c) {
        return contratRepository.save(c);
    }

    @Override
    public List<Contrat> readAllContrat() {
        return contratRepository.findAll();
    }

    @Override
    public Contrat readContratById(Long idCt) {
        return contratRepository.findById(idCt).get();
    }

    @Override
    public void deleteContrat(Long idCt) {
        try {
            contratRepository.deleteById(idCt);}
        catch (Exception e){
            log.info("Contrat with id {0} not found", idCt);
        }
    }
}
