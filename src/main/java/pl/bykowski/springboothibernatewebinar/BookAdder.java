package pl.bykowski.springboothibernatewebinar;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import java.time.LocalDate;

@Route
public class BookAdder extends VerticalLayout {

    private BookRepo bookDao;

    @Autowired
    public BookAdder(BookRepo bookDao) {
        TextField textFieldTitle = new TextField("Title");
        TextField textFieldAuthor = new TextField("Author");
        DatePicker datePicker = new DatePicker("Publish date");
        ComboBox<BookType> comboBoxBookType = new ComboBox<>("Book type", BookType.values());
        Button button = new Button("add book");

        button.addClickListener(clickEvent -> {
            Book book = new Book();
            book.setTitle(textFieldTitle.getValue());
            book.setAuthor(textFieldAuthor.getValue());
            book.setYear(datePicker.getValue());
            book.setBookType(comboBoxBookType.getValue());
            bookDao.save(book);

            Notification notification = new Notification("Book added!", 3000);
            notification.open();
        });

        add(textFieldTitle, textFieldAuthor, datePicker, comboBoxBookType, button);
    }
}