package org.acme.DTO.companies;

import javax.persistence.OneToOne;


public class companiesDTO {

    public Long id;
    public String corporateName;
    public Long cnpj;
    public Long telephone;
    public String email;
    public Boolean status;
    public Long taxRegime;

}
