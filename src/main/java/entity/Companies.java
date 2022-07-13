package entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.*;

@Entity
@Table(name = "companies")
public class Companies extends PanacheEntityBase {

    @Id
    @GeneratedValue(generator = "id", strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long id;

    @Column(name = "corporateName")
    public String corporateName;

    @Column(name = "cnpj")
    public Long cnpj;

    @Column(name = "telephone")
    public Long telephone;

    @Column(name = "status")
    public Boolean status;

    @ManyToOne
    @JoinColumn(name = "taxRegime_id")
    @JsonbTransient
    public TaxRegime taxRegime;
}
