package ch.brueesch.crm.company;


import com.vaadin.annotations.Theme;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Grid;
import com.vaadin.ui.UI;
import org.springframework.beans.factory.annotation.Autowired;

@SpringUI(path = "ui")
@Theme("valo")
public class CompanyUI extends UI {

    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyUI(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    protected void init(VaadinRequest request) {
        Grid table = new Grid();
        BeanItemContainer<Company> container = new BeanItemContainer<Company>(Company.class, companyRepository.findAll());
        table.setContainerDataSource(container);
        table.setSizeFull();
        setContent(table);
    }
}
