package ch.brueesch.crm.contact;

import ch.brueesch.crm.company.CompanyRepository;
import ch.brueesch.crm.opportunity.OpportunityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactController {

    private final CompanyRepository companyRepository;
    private final ContactRepository contactRepository;
    private final OpportunityRepository opportunityRepository;

    @Autowired
    public ContactController(CompanyRepository companyRepository, ContactRepository contactRepository, OpportunityRepository opportunityRepository) {
        this.companyRepository = companyRepository;
        this.contactRepository = contactRepository;
        this.opportunityRepository = opportunityRepository;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/contact/{id}")
    public String renderContact(Model model, @PathVariable Long id) {
        model.addAttribute("contact", contactRepository.getOne(id));
        model.addAttribute("companies", companyRepository.findAll());
        model.addAttribute("opportunities", opportunityRepository.findAll());
        return "contact";
    }
}
