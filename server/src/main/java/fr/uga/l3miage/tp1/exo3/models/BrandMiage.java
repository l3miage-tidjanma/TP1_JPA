package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.*;

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

    @ManyToOne
    private ProductEntity product;  // Relation APourProduit
}
