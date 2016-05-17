package ch.brueesch.crm.address;

import ch.brueesch.crm.company.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AddressMvcController {

    private final AddressRepository addressRepository;

    @Autowired
    public AddressMvcController(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/addresses")
    public String renderCompanies(Model model) {
        model.addAttribute("addresses", addressRepository.findAll());
        return "addresses";
    }
}
