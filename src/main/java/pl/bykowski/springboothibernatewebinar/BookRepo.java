package pl.bykowski.springboothibernatewebinar;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepo extends CrudRepository<Book, Long> {

    List<Book> findByBookType(BookType bookType);

    //todo
    //find by year

}
