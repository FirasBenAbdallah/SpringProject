package tn.spring.springproject.entities;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Equipe implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipe;
    private String nomEquipe;
    @Enumerated(EnumType.ORDINAL)
    Niveau niveau;

    @ManyToMany(mappedBy = "equipe", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Etudiant> etudiant;

    @OneToOne (mappedBy = "equipe")
    private DetailEquipe detailequipe;
}