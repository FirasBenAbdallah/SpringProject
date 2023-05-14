package tn.spring.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.springproject.entities.Universite;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite, Long> {
    //Universite findUniversiteByIdUniv(Long U);
}
