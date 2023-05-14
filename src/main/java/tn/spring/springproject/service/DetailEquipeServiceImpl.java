package tn.spring.springproject.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springproject.entities.DetailEquipe;
import tn.spring.springproject.repository.DetailEquipeRepository;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class DetailEquipeServiceImpl implements IDetailEquipeService{
    @Autowired
    DetailEquipeRepository detailEquipeRepository;

    @Override
    public DetailEquipe addDetailEquipe(DetailEquipe c){
        return detailEquipeRepository.save(c);
    }

    @Override
    public DetailEquipe editDetailEquipe(DetailEquipe c) {
        return detailEquipeRepository.save(c);
    }

    @Override
    public List<DetailEquipe> readAllDetailEquipe() {
        return detailEquipeRepository.findAll();
    }

    @Override
    public DetailEquipe readDetailEquipeById(Long idDE) {
        return detailEquipeRepository.findById(idDE).get();
    }

    @Override
    public void deleteDetailEquipe(Long idDE) {
        try {
            detailEquipeRepository.deleteById(idDE);}
        catch (Exception e){
            log.info("DetailEquipe with id {0} not found", idDE);
        }
    }
}
