package ch.brueesch.crm.opportunity;

import ch.brueesch.crm.company.CompanyRepository;
import ch.brueesch.crm.contact.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OpportunityController {

    private final CompanyRepository companyRepository;
    private final ContactRepository contactRepository;
    private final OpportunityRepository opportunityRepository;

    @Autowired
    public OpportunityController(CompanyRepository companyRepository, ContactRepository contactRepository, OpportunityRepository opportunityRepository) {
        this.companyRepository = companyRepository;
        this.contactRepository = contactRepository;
        this.opportunityRepository = opportunityRepository;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/opportunity/{id}")
    public String renderOpportunity(Model model, @PathVariable Long id) {
        model.addAttribute("contacts", contactRepository.findAll());
        model.addAttribute("companies", companyRepository.findAll());
        model.addAttribute("opportunity", opportunityRepository.getOne(id));
        return "opportunity";
    }
}
