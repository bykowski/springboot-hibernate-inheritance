package pl.bykowski.springboothibernatewebinar.table_per_class;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScissorsRepo extends JpaRepository<Scissors, Long> {
}
