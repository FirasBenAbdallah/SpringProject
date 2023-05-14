package tn.spring.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.springproject.entities.Equipe;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe, Long> {
    //Equipe findEquipeByIdEquipe(Long Eq);
}
