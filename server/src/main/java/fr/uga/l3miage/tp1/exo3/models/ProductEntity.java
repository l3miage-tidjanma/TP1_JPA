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

    @OneToOne
    private ProductEntity product; // Relation APourMarque
}
