package pl.bykowski.springboothibernatewebinar;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@Route
public class BookReaderByType extends VerticalLayout {

    private BookRepo bookRepo;

    @Autowired
    public BookReaderByType(BookRepo bookRepo) {
        ComboBox<BookType> bookTypeComboBox = new ComboBox<>("Select book type", BookType.values());
        Button button = new Button("show book");

        button.addClickListener(clickEvent -> {
            List<Book> byBookType = bookRepo.findByBookType(bookTypeComboBox.getValue());
            byBookType.forEach(book -> add(new Label(book.toString())));
        });
        add(bookTypeComboBox, button);
    }
}