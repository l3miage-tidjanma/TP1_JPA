package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table (name = "brand_miage")
public class BrandMiageEntity {
    @Id
    private String company_name;

    @Column(length = 11, nullable = false)
    private String siretNumber;

    private String type;

    @OneToMany(mappedBy="brand")
    private Set<ProductEntity> products;  // Relation APourProduit

    /*
     * En utilisant mappedBy = "brand", j'indique à JPA que la relation est déjà mappée par l'attribut "brand" dans
     * 'ProductEntity' ( = la relation est déjà gérée par l'attribut "brand" dans 'ProductEntity').
     *
     * Cela évite la duplication de la configuration de la relation dans ProductEntity et BrandMiage.
     * (= Ainsi, JPA n'aura pas besoin de créer une colonne supplémentaire dans la table de la marque pour gérer cette
     * relation (comme cela serait le cas avec une relation unidirectionnelle).
     * Et donc, par exemple, l'utilisation de @JoinColumn(name = "brand_company_name") dans notre relation @ManyToOne
     *
     * Cependant, pour ce qui est de la persistence dans le @OneToMany, avec l'attribut 'cascade' comme tel:
     * @OneToMany(mappedBy = "brand", cascade = CascadeType.PERSIST)
     * -> Ajout à la base au prochain commit (insert, update)
     */
}