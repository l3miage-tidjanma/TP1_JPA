package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.*;

@Entity
@Table (name = "product_entity")
public class ProductEntity {
    @Id
    @Column(length = 15, nullable = false)
    private String bar_code_number;

    private String name;

    private boolean consumable;

    @ManyToOne
    private ProductEntity product; // Relation APourMarque
    /*  Chaque produit appartient à une seule marque, donc
        utiliser l'annotation @ManyToOne du côté de
        l'entité ProductEntity pour indiquer cette relation.
    */
}
