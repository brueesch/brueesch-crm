package ch.brueesch.crm.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactsController {

    private final ContactRepository contactRepository;

    @Autowired
    public ContactsController(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/contacts")
    public String renderContacts(Model model) {
        model.addAttribute("contacts", contactRepository.findAll());
        return "contacts";
    }
}
