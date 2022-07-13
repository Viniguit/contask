package resource;


import entity.Companies;
import entity.TaxRegime;
import org.acme.DTO.companies.CreateCompanieDTO;
import org.acme.DTO.companies.companiesDTO;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;

import javax.ws.rs.*;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("companies")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CompaniesResource {

    @GET
    public List<Companies> getCompanies(){

        return Companies.listAll();
    }

    @POST
    @Transactional
    public void creatCompanies(CreateCompanieDTO dto){
        Companies companies = new Companies();
        companies.corporateName = dto.companies.corporateName;
        companies.cnpj = dto.companies.cnpj;
        companies.telephone = dto.companies.telephone;
        companies.status = dto.companies.status;
        companies.taxRegime = TaxRegime.findById(dto.companies.taxRegime);
        companies.persist();


    }

}
