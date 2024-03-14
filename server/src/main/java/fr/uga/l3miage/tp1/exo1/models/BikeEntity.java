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
    @Column
    private String immatriculation ;

    @Column
    private Integer capacity ;
    @Column
    @Enumerated(EnumType.ORDINAL)
    private CylinderNumber cylinderNumber ;
    @Column
    private Boolean automatic ;
    @Column
    private Boolean shiffter ;

    @Column
    @Enumerated(EnumType.STRING)
    private ShifterType shifterType;
    @Column
    private LocalDate circulationDate ;

}


/*
    @Entity
    public class SmartphoneEntity{

    @Id
    private String imei;

    private String macAddr;

    @Column(updatable = false, nullable = false)
    private double das;
}*/