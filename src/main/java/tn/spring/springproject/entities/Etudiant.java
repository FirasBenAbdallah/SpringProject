package tn.spring.springproject.entities;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;
    private String prenomE;
    private String nomE ;
    private Option op;

    @OneToOne (mappedBy="etudiant")
    private Contrat contrat;

    @ManyToMany (fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Equipe> equipe;

    @ManyToOne
    private Departement departement;
}
