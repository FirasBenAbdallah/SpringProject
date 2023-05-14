package tn.spring.springproject.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springproject.entities.Equipe;
import tn.spring.springproject.repository.EquipeRepository;

import java.util.List;


@Service
@Slf4j
@AllArgsConstructor
public class EquipeServiceImpl implements IEquipeService{
    @Autowired
    EquipeRepository equipeRepository;

    @Override
    public Equipe addEquipe(Equipe e){
        return equipeRepository.save(e);
    }

    @Override
    public Equipe editEquipe(Equipe e) {
        return equipeRepository.save(e);
    }

    @Override
    public List<Equipe> readAllEquipe() {
        return equipeRepository.findAll();
    }

    @Override
    public Equipe readEquipeById(Long idEq) {
        return equipeRepository.findById(idEq).orElse(null);
    }

    @Override
    public void deleteEquipe(Long idEq) {
        try {
            equipeRepository.deleteById(idEq);}
        catch (Exception e){
            log.info("Equipe with id {} not found", idEq);
        }
    }
}
