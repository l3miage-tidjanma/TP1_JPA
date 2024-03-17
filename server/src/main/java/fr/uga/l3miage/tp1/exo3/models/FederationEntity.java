package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class FederationEntity {
    @Id
    private String name;

    boolean isFageMembership;

    @OneToMany(mappedBy = "federation")
    private Set<AssociationEntity> associations;    // une fédération peut avoir plusieurs associations.
}
