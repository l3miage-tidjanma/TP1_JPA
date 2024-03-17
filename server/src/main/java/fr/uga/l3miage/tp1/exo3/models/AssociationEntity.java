package fr.uga.l3miage.tp1.exo3.models;

import fr.uga.l3miage.tp1.exo3.enums.AssociationType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AssociationEntity {
    @Id
    private String name;

    @Column(nullable = false)
    private String presidentName;

    @Column(nullable = false)
    private String treasurerName;

    private String secretaryName;

    private AssociationType associationType;

    @ManyToOne
    private FederationEntity federation;    // une association appartient à une seule fédération
}
