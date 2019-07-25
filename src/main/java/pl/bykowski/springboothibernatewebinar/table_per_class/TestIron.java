package pl.bykowski.springboothibernatewebinar.table_per_class;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.bykowski.springboothibernatewebinar.single.*;

@Service
public class TestIron {

    private KnifeRepo knifeRepo;
    private ScissorsRepo scissorsRepo;

    public TestIron(KnifeRepo knifeRepo, ScissorsRepo scissorsRepo) {
        this.knifeRepo = knifeRepo;
        this.scissorsRepo = scissorsRepo;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void get() {
        Knife knife = new Knife();
        knife.setSize(16);
        knife.setName("myKnife");
        knifeRepo.save(knife);

        Scissors scissors = new Scissors();
        scissors.setName("ReksioScissors");
        scissors.setElements(5);
        scissorsRepo.save(scissors);
    }
}
