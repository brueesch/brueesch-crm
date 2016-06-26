package ch.brueesch.crm.company;

import ch.brueesch.crm.contact.ContactRepository;
import ch.brueesch.crm.opportunity.OpportunityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CompanyController {

    private final CompanyRepository companyRepository;
    private final ContactRepository contactRepository;
    private final OpportunityRepository opportunityRepository;

    @Autowired
    public CompanyController(CompanyRepository companyRepository, ContactRepository contactRepository, OpportunityRepository opportunityRepository) {
        this.companyRepository = companyRepository;
        this.contactRepository = contactRepository;
        this.opportunityRepository = opportunityRepository;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/company/{id}")
    public String renderCompany(Model model, @PathVariable Long id) {
        model.addAttribute("company", companyRepository.getOne(id));
        model.addAttribute("contacts", contactRepository.findAll());
        model.addAttribute("opportunities", opportunityRepository.findAll());
        return "company";
    }
}
