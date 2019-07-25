package pl.bykowski.springboothibernatewebinar.joined;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.bykowski.springboothibernatewebinar.single.*;

@Service
public class TestVehicle {

    private VehicleRepo vehicleRepo;

    @Autowired
    public TestVehicle(VehicleRepo vehicleRepo) {
        this.vehicleRepo = vehicleRepo;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void get() {
        Bike bike = new Bike();
        bike.setName("Rower Błażeja");
        bike.setDerailleur(21);
        vehicleRepo.save(bike);

        Car car = new Car();
        car.setName("Put-Put");
        car.setWheelsSize(17);
        vehicleRepo.save(car);

    }
}
