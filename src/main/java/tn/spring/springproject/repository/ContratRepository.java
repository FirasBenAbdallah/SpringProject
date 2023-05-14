package tn.spring.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.springproject.entities.Contrat;

@Repository
public interface ContratRepository extends JpaRepository<Contrat, Long> {
    //Contrat findContratByIdContrat(long C);
}
