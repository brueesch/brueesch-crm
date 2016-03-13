package ch.brueesch.crm.client.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CompanyMvcController {

    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyMvcController(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/companies.mvc")
    public String renderCompanies(Model model) {
        model.addAttribute("companies", companyRepository.findAll());
        return "companies";
    }
}
