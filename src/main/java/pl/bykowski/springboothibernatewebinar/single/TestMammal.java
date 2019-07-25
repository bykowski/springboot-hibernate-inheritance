package pl.bykowski.springboothibernatewebinar.single;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class TestMammal {

    private CatRepo catRepo;
    private DogRepo dogRepo;
    private MammalRepo mammalRepo;

    public TestMammal(MammalRepo mammalRepo, CatRepo catRepo, DogRepo dogRepo) {
        this.catRepo = catRepo;
        this.dogRepo = dogRepo;
        this.mammalRepo = mammalRepo;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void get() {
        Cat cat = new Cat();
        cat.setClawSize(2);
        cat.setName("Klakier");
        mammalRepo.save(cat);

        Dog dog = new Dog();
        dog.setName("Reksio");
        dog.setAgressiveLevel(10);
        mammalRepo.save(dog);

    }
}
