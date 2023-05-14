package tn.spring.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.springproject.entities.Departement;

@Repository
public interface DepartementRepository extends JpaRepository<Departement, Long> {
   //Departement findDepartementByIdDepart(Long D);
}
