package entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;

@Entity
@Table(name = "taxRegime")
public class TaxRegime extends PanacheEntityBase {

    @Id
    @GeneratedValue(generator = "id", strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long id;

    @Column(name = "description")
    public String description;
}
