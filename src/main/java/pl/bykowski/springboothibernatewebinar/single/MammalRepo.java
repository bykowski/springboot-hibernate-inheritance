package pl.bykowski.springboothibernatewebinar.single;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MammalRepo extends JpaRepository<Mammal, Long> {
}
