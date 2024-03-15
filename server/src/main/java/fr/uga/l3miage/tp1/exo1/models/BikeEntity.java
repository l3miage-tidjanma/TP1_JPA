package fr.uga.l3miage.tp1.exo1.models;

import fr.uga.l3miage.tp1.exo1.enums.CylinderNumber;
import fr.uga.l3miage.tp1.exo1.enums.PowerType;
import fr.uga.l3miage.tp1.exo1.enums.ShifterType;
import fr.uga.l3miage.tp1.exo1.enums.WeightRange;
import org.hibernate.type.descriptor.sql.VarcharTypeDescriptor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class BikeEntity {
    @Id
    private String immatriculation ;


    private Integer capacity ;

    @Enumerated(EnumType.ORDINAL)
    private CylinderNumber cylinderNumber ;

    private Boolean automatic ;

    private Boolean shiffter ;


    @Enumerated(EnumType.STRING)
    private ShifterType shifterType;

    private LocalDate circulationDate ;

}