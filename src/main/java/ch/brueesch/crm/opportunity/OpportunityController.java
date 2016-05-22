package ch.brueesch.crm.opportunity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OpportunityController {

    private final OpportunityRepository opportunityRepository;

    @Autowired
    public OpportunityController(OpportunityRepository opportunityRepository) {
        this.opportunityRepository = opportunityRepository;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/opportunities")
    public String renderOpportunities(Model model) {
        model.addAttribute("opportunities", opportunityRepository.findAll());
        return "opportunities";
    }
}
