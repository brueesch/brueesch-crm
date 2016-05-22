package ch.brueesch.crm.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AddressesController {

    private final AddressRepository addressRepository;

    @Autowired
    public AddressesController(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/addresses")
    public String renderAddresses(Model model) {
        model.addAttribute("addresses", addressRepository.findAll());
        return "addresses";
    }
}
