package ch.brueesch.crm.address;


import ch.brueesch.crm.company.Company;
import ch.brueesch.crm.company.CompanyRepository;
import com.vaadin.annotations.Theme;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.event.ShortcutAction;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.springframework.beans.factory.annotation.Autowired;

@SpringUI(path = "address")
@Theme("valo")
public class AddressUI extends UI {

    private final AddressRepository addressRepository;

    private TextField street = new TextField("Street");
    private TextField secondStreet = new TextField("Second Street");
    private TextField zip = new TextField("Zip");
    private TextField city = new TextField("City");
    private TextField country = new TextField("Country");
    private Button save = new Button("Save");

    @Autowired
    public AddressUI(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    protected void init(VaadinRequest request) {
        final VerticalLayout layout = new VerticalLayout();
        save.addClickListener(e -> this.save());
        HorizontalLayout buttons = new HorizontalLayout(save);
        buttons.setSpacing(true);
        save.setStyleName(ValoTheme.BUTTON_PRIMARY);
        save.setClickShortcut(ShortcutAction.KeyCode.ENTER);

        Grid table = new Grid();
        BeanItemContainer<Address> container = new BeanItemContainer<Address>(Address.class, addressRepository.findAll());
        table.setContainerDataSource(container);

        layout.addComponents(street, secondStreet, zip, city, country, save, table);
        setContent(layout);
    }

    private void save() {

        Address address = new Address()
                .setCity(city.getValue())
                .setCountry(country.getValue())
                .setSecondStreet(secondStreet.getValue())
                .setStreet(street.getValue())
                .setZip(zip.getValue());

        addressRepository.save(address);



    }
}
