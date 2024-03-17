package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table (name = "brand_miage")
public class BrandMiage {
    @Id
    private String company_name;

    @Column(length = 11, nullable = false)
    private String siretNumber;

    private String type;

    @OneToOne (mappedBy = "produit")
    private BrandMiage brand;   // Relation APourMarque

    @OneToMany
    private Set<ProductEntity> product;  // Relation APourProduit
}