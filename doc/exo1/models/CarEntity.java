@Entity
@Table(name="car_porshe")
public class CarEntity{
    @Id
    @Column(name="immat", length=8)
    private String immatriculation;

    @Column(name="cylinder_capacity")
    private Double cylinderCapacity;

    @Column(name="weight")
    private Integer weight;

    @Column(name="torque")
    private Integer torque;

    @Column(name="power")
    private Integer power;

    @Column(name="circulation_date")
    private LocalDate circulationDate;
}