package pl.bykowski.springboothibernatewebinar;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@Route
public class BookReader extends VerticalLayout {

    private BookRepo bookRepo;

    @Autowired
    public BookReader(BookRepo bookRepo) {
        TextField textFieldId = new TextField("Give id:");
        Button button = new Button("show book");
        Label label = new Label();

        button.addClickListener(clickEvent -> {
            Optional<Book> bookRepoById = bookRepo.findById(Long.parseLong(textFieldId.getValue()));
            if (bookRepoById.isPresent())
                label.setText(bookRepoById.get().toString());
        });

        add(textFieldId, button, label);
    }
}