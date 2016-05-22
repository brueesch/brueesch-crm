package ch.brueesch.crm.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CompanyController {

    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyController(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/companies")
    public String renderCompanies(Model model) {
        model.addAttribute("companies", companyRepository.findAll());
        return "companies";
    }
}
